package isidro.principal;

public class ExepcionDivisionCero extends RuntimeException{
    public ExepcionDivisionCero(){
        System.out.println("Error Division entre cero");
    }
}
