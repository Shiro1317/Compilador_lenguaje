package isidro.principal;
import javafx.application.Platform;
import java.io.*;
import isidro.parser.LenguajeLexer;
import isidro.parser.LenguajeParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;

public class Controller extends MyVisitor {
    @FXML
    public TextArea area_input;
    @FXML
    public TextArea salida;
    private PrintStream flujo;


    public void abrirArchivo(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escoger archivo");
        File file = fileChooser.showOpenDialog(null);
        area_input.clear();


        try {
            BufferedReader in;
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                area_input.appendText(line + "\n");
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void cerrar(ActionEvent actionEvent){
        System.exit(0);
    }

    public void guardarArchivo(ActionEvent event) {
        FileChooser filechooser2 = new FileChooser();
        filechooser2.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(".txt", ".txt"));
        filechooser2.setTitle("Guardar archivo");
        File save = filechooser2.showSaveDialog(null);
        try {
            FileWriter filewriter = new FileWriter(save);
            filewriter.write(area_input.getText());
            filewriter.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void initialize() {  // Método initialize() que permite realizar pos-procesamientos
        Consola datos = new Consola(salida);
        flujo = new PrintStream(datos);
    }
    public void traducir (){ //herramientas computacionales I, Herramientas Computacionales II
      String texto = area_input.getText();
      texto = texto.replaceAll("\\bprintf\\b","print");
      texto = texto.replaceAll("\\bvoid\\b","clase");
        texto = texto.replaceAll("(#include <[a-z]*.h>)","libreria principal ");

        area_input.setText(texto);
    }
    public void traducirC (){ //herramientas computacionales I, Herramientas Computacionales II
        String texto = area_input.getText();
        texto = texto.replaceAll("\\bprint\\b","printf");
        texto = texto.replaceAll("\\bclase\\b","void");
        texto = texto.replaceAll("libreria principal","#include <stdio.h>");

        area_input.setText(texto);
    }

    public void compile () throws IOException{
        System.setOut(flujo); // Reasigna la salida
        salida.clear();
        String texto = area_input.getText()+"\n";

        CharStream input = CharStreams.fromString(texto); //archivo que entra a la parte léxica
        LenguajeLexer lexico = new LenguajeLexer(input); //generación de léxico
        CommonTokenStream tokens = new CommonTokenStream(lexico); //construcción de tokens (léxico genera tokens)
        LenguajeParser sintactico = new LenguajeParser(tokens); //creación de parser (parte de analizador sintáctico)
        ParseTree arbol = sintactico.inicio(); //creación de árbol para recorrer con las visitas
        MyVisitor visita = new MyVisitor(); //uso de clase MyVisitor
        visita.visit(arbol);

    }
    public void clear(){
        area_input.clear();
        salida.clear();
    }
    public class Consola extends OutputStream { //Extiende la clase abstracta OutputStream para esribir informacion

        private TextArea salida_consola;


        public Consola(TextArea salida_consola) {
            this.salida_consola = salida_consola;
        }

        public void adjuntarTexto(String caracteres) { //setter que recibe cadena de caracteres del método write
            Platform.runLater(() -> //Ejecuta hilo que...
                    salida_consola.appendText(caracteres)); // ... Adjunta secuencia de carácteres
        }

        public void write(int b) { // Método que escribe secuencia de carácteres tipo char y lo vuelve a String
            adjuntarTexto(String.valueOf((char) b));
        }
    }

    }

