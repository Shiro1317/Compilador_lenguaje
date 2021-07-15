package isidro.principal;

public class Valor {
    public static Valor VOID = new Valor(new Object());

    final Object valor;

    public  Valor(Object valor){
        this.valor = valor;
    }
    public Boolean booleano(){

        return (Boolean)valor;
    }
    public Integer valorInteger(){
        return (Integer) valor;
    }
    public Double como_doble(){
        return (Double)valor;
    }
    public String como_string(){ return String.valueOf(valor);
    }
    public boolean es_doble(){
        return valor instanceof Double;
    }
    public boolean es_Int(){
        return valor instanceof Integer;
    }



    @Override
    public int hashCode(){
        if(valor ==null){
            return 0;
        }

        return this.valor.hashCode();
    }


    @Override
    public boolean equals(Object o){
        if(valor==o){
            return true;
        }
        if(valor==null || o==null ||o.getClass() != this.getClass()){
            return false;
        }
        Valor ese= (Valor)o;

        return this.valor.equals(ese.valor);
    }
    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
