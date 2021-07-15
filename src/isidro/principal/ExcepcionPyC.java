package isidro.principal;

public class ExcepcionPyC extends RuntimeException{
    public ExcepcionPyC(){
        System.out.println("Error: falto cerrar la linea");
    }
}
