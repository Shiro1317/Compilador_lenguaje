package isidro.principal;

public class ExcepcionDeclaracion extends RuntimeException {
    private String renglon;
    private String lexema;
    public ExcepcionDeclaracion(String token) {
        System.out.println("Error de declaracion en: "+ token);
    }
}
