package isidro.principal;

import isidro.parser.LenguajeLexer;
import isidro.parser.LenguajeParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Compilador Vaporwave");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("palmera.png")));
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);


    }
}
