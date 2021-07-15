package isidro.principal;
import isidro.parser.LenguajeBaseVisitor;
import isidro.parser.LenguajeParser;

import java.util.*;

public class MyVisitor extends LenguajeBaseVisitor<Valor> {
    //comparar valores despues del punto decimal
    public static  final double VALOR_MINI=0.00000000001;

    //guardar las variables
    private final Stack<Integer> pila = new Stack<>();
    private final Map<Integer, LinkedHashMap<String,Valor>> memoria_memorias = new HashMap<>();
    private final LinkedHashMap<String, Valor> memoria = new LinkedHashMap<>();
    private LinkedHashMap<String,Valor> memoria_size = new LinkedHashMap<>();

    private int level=0;

    @Override public Valor visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
        String variable = ctx.ID().getText();
        if(memoria.containsKey(variable))
        {
            System.out.println("La variable ya se ha declarado");
            throw  new RuntimeException("Variable declarada");
        }
        else {
            memoria.put(variable,null);
            return memoria.get(variable);
        }
    }
    @Override public Valor visitDeclarar_y_asignar(LenguajeParser.Declarar_y_asignarContext ctx) {
        String id = ctx.ID().getText();
        if (memoria.containsKey(id)) {
            System.out.println("La variable ya ha sido declarada");
            throw new RuntimeException("La variable ya ha sido declarada");
        } else {

            Valor valor = this.visit(ctx.expr());
            memoria.put(id, valor);
            return visitChildren(ctx);
        }
    }

    @Override public Valor visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        String id= ctx.ID().getText();
        Valor valor=this.visit(ctx.expr());
        if(memoria.containsKey(id))
        {
            return memoria.replace(id,valor);
        }
        else
        {
            System.out.println("La variable no existe");
            throw  new RuntimeException("La variable no existe");
        }
    }
    @Override public Valor visitInt(LenguajeParser.IntContext ctx)
    {

        return new Valor(Integer.valueOf(ctx.INT().getText())); }

    @Override public Valor visitFloat(LenguajeParser.FloatContext ctx) {
        return new Valor(Double.valueOf(ctx.FLOTA().getText())); }




    @Override public Valor visitId(LenguajeParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memoria.containsKey(id)){
            return memoria.get(id);
        }
        return null;
    }

    @Override public Valor visitImprimir(LenguajeParser.ImprimirContext ctx) {
        String str= ctx.STRING().getText();
        str=str.substring(1,str.length()-1);
        System.out.println(str);
        return  null; }

    @Override public Valor visitImprimir2(LenguajeParser.Imprimir2Context ctx) {
     Valor valor= this.visit(ctx.expr());
    if (valor == null){
        System.out.println("Error en la declaracion");
        throw new RuntimeException();
    }
        System.out.println(valor);
        return valor;
    }


        @Override public Valor visitParentesisExpr(LenguajeParser.ParentesisExprContext ctx) {
        return this.visit(ctx.expr());
    }
    @Override public Valor visitExpresion_negativa(LenguajeParser.Expresion_negativaContext ctx) {
        Valor valor=this.visit(ctx.expr());
        return new Valor(valor.como_doble());
    }
    @Override public Valor visitExprNot(LenguajeParser.ExprNotContext ctx) {
        Valor valor=this.visit(ctx.expr());
        return new Valor(!valor.booleano());
    }

    @Override public Valor visitMulDiv( LenguajeParser.MulDivContext ctx) {
        Valor izq=this.visit(ctx.expr(0));
        Valor der=this.visit(ctx.expr(1));
        switch (ctx.op.getType()){
            case LenguajeParser.POR:
                if(izq.es_doble() && der.es_doble())
                {
                    return new Valor(izq.como_doble()* der.como_doble());
                }else if(izq.es_Int() && der.es_Int())
                {
                    return new Valor(izq.valorInteger()* der.valorInteger());
                }else if(izq.es_Int() && der.es_doble())
                {
                    return new Valor(izq.valorInteger().doubleValue()* der.como_doble());
                }else if(izq.es_doble() && der.es_Int())
                {
                    return new Valor(izq.como_doble()* der.valorInteger().doubleValue());
                }


                    //return new Valor(izq.valorInteger()* der.valorInteger());
            case LenguajeParser.DIV:
                if (izq.es_doble() && der.es_doble())
                {
                    return new Valor(izq.como_doble()/der.como_doble());

                }
                else if(izq.es_Int() && der.es_Int())
                {
                    return new Valor(izq.valorInteger()/der.valorInteger());

                }else if(izq.es_Int() && der.es_doble())
                {
                    return new Valor(izq.valorInteger().doubleValue()/der.como_doble());

                }else if(izq.es_doble() && der.es_Int())
                {
                    return new Valor(izq.como_doble()/der.valorInteger().doubleValue());

                }
                //return new Valor(izq.valorInteger()/der.valorInteger());
            default:
                throw new RuntimeException("Operador desconocido");
        }
    }

    @Override public Valor visitSumRes( LenguajeParser.SumResContext ctx) {
        Valor izq = this.visit(ctx.expr(0));
        Valor der = this.visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case LenguajeParser.MAS:
                if (izq.es_doble() && der.es_doble()){
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.como_doble() + der.como_doble()) :
                            new Valor(izq.como_doble() + der.como_doble());
                }
                else if(izq.es_Int() && der.es_Int()){
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.valorInteger() + der.valorInteger()) :
                            new Valor(izq.valorInteger() + der.valorInteger());
                }else if(izq.es_Int() && der.es_doble()){
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.valorInteger().doubleValue() + der.como_doble()) :
                            new Valor(izq.valorInteger().doubleValue() + der.como_doble());
                }else if(izq.es_doble() && der.es_Int()) {
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.como_doble() + der.valorInteger().doubleValue()) :
                            new Valor(izq.como_doble() + der.valorInteger().doubleValue());
                }

                /*return izq.es_doble() && der.es_doble() ?
                        new Valor(izq.valorInteger() + der.valorInteger()) :
                        new Valor(izq.valorInteger() + der.valorInteger());*/
            case LenguajeParser.MENOS:
                if (izq.es_doble() && der.es_doble()){
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.como_doble() - der.como_doble()) :
                            new Valor(izq.como_doble() - der.como_doble());
                }
                else if(izq.es_Int() && der.es_Int()){
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.valorInteger() - der.valorInteger()) :
                            new Valor(izq.valorInteger() - der.valorInteger());
                }else if(izq.es_Int() && der.es_doble()) {
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.valorInteger().doubleValue() - der.como_doble()) :
                            new Valor(izq.valorInteger().doubleValue() - der.como_doble());
                }else if(izq.es_doble() && der.es_Int()) {
                    return izq.es_doble() && der.es_doble() ?
                            new Valor(izq.como_doble() - der.valorInteger().doubleValue()) :
                            new Valor(izq.como_doble() - der.valorInteger().doubleValue());
                }
                //return new Valor(izq.valorInteger() - der.valorInteger());
            default:
                throw new RuntimeException("Operador Desconocido: " + LenguajeParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Valor visitExpresion_Relacional( LenguajeParser.Expresion_RelacionalContext ctx) {
        Valor left = this.visit(ctx.expr(0));
        Valor right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LenguajeParser.MENOR_QUE:
                if (left.es_doble() && right.es_doble())
                {
                    return new Valor(left.como_doble() < right.como_doble());

                }else if(left.es_Int() && right.es_Int()){
                    return new Valor(left.valorInteger() < right.valorInteger());
                }else if (left.es_Int() && right.es_doble())
                {
                    return new Valor(left.valorInteger().doubleValue() < right.como_doble());

                }else if (left.es_doble() && right.es_Int())
                {
                    return new Valor(left.como_doble() < right.valorInteger().doubleValue());

                }
                //return new Valor(left.valorInteger() < right.valorInteger());
            case LenguajeParser.MENOR_IGUAL:
                if (left.es_doble() && right.es_doble())
                {
                    return new Valor(left.como_doble() <= right.como_doble());

                }else if(left.es_Int() && right.es_Int()){
                    return new Valor(left.valorInteger() <= right.valorInteger());
                } else if (left.es_doble()&& right.es_Int()) {
                    return new Valor(left.como_doble() <= right.valorInteger().doubleValue());

                } else if (left.es_Int()&& right.es_doble()) {
                    return new Valor(left.valorInteger().doubleValue() <= right.como_doble());
                }

                //return new Valor(left.valorInteger() <= right.valorInteger());
            case LenguajeParser.MAYOR_QUE:
                if (left.es_doble() && right.es_doble())
                {
                    return new Valor(left.como_doble() > right.como_doble());

                }else if(left.es_Int() && right.es_Int()){
                    return new Valor(left.valorInteger() > right.valorInteger());
                } else if (left.es_doble()&& right.es_Int()) {
                    return new Valor(left.como_doble() > right.valorInteger().doubleValue());

                } else if (left.es_Int()&& right.es_doble()) {
                    return new Valor(left.valorInteger().doubleValue() > right.como_doble());
                }
                //return new Valor(left.valorInteger() > right.valorInteger());
            case LenguajeParser.MAYOR_IGUAL:
                if (left.es_doble() && right.es_doble())
                {
                    return new Valor(left.como_doble() >= right.como_doble());

                }else if(left.es_Int() && right.es_Int()){
                    return new Valor(left.valorInteger() >= right.valorInteger());
                } else if (left.es_doble()&& right.es_Int()) {
                    return new Valor(left.como_doble() >= right.valorInteger().doubleValue());

                } else if (left.es_Int()&& right.es_doble()) {
                    return new Valor(left.valorInteger().doubleValue() >= right.como_doble());

                }
                //return new Valor(left.valorInteger() >= right.valorInteger());
            default:
                throw new RuntimeException(" Operador Descoonocido: " + LenguajeParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Valor visitExpresion_igual( LenguajeParser.Expresion_igualContext ctx) {

        Valor left = this.visit(ctx.expr(0));
        Valor right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LenguajeParser.IGUAL_IGUAL:
                if (left.es_doble() && right.es_doble())
                {
                    return left.es_doble() && right.es_doble() ?
                            new Valor(Math.abs(left.como_doble() - right.como_doble()) < VALOR_MINI) :
                            new Valor(left.equals(right));
                }else if(left.es_Int() && right.es_Int()){
                    return left.es_Int() && right.es_Int() ?
                            new Valor(Math.abs(left.valorInteger() - right.valorInteger()) < VALOR_MINI) :
                            new Valor(left.equals(right));
                }else if(left.es_Int() && right.es_doble()){
                    return left.es_Int() && right.es_doble() ?
                            new Valor(Math.abs(left.valorInteger().doubleValue() - right.como_doble()) < VALOR_MINI) :
                            new Valor(left.equals(right));}
                else if(left.es_doble() && right.es_Int()){
                    return left.es_doble() && right.es_Int() ?
                            new Valor(Math.abs(left.como_doble() - right.valorInteger().doubleValue()) < VALOR_MINI) :
                            new Valor(left.equals(right));}

                /*return left.es_doble() && right.es_doble() ?
                        new Valor(Math.abs(left.valorInteger() - right.valorInteger()) < VALOR_MINI) :
                        new Valor(left.equals(right));*/
            case LenguajeParser.DIFERENTE_QUE:
                if (left.es_doble() && right.es_doble())
                {
                    return left.es_doble() && right.es_doble() ?
                            new Valor(Math.abs(left.como_doble() - right.como_doble()) >= VALOR_MINI) :
                            new Valor(!left.equals(right));
                }else if(left.es_Int() && right.es_Int()){
                    return left.es_Int() && right.es_Int() ?
                            new Valor(Math.abs(left.valorInteger() - right.valorInteger()) >= VALOR_MINI) :
                            new Valor(!left.equals(right));
                }else if(left.es_Int() && right.es_doble()) {
                    return left.es_Int() && right.es_doble() ?
                            new Valor(Math.abs(left.valorInteger().doubleValue() - right.como_doble()) >= VALOR_MINI) :
                            new Valor(!left.equals(right));
                }else if(left.es_doble() && right.es_Int()) {
            return left.es_doble() && right.es_Int() ?
                    new Valor(Math.abs(left.como_doble()- right.valorInteger().doubleValue()) >= VALOR_MINI) :
                    new Valor(!left.equals(right));
                }
                /*return left.es_doble() && right.es_doble() ?
                        new Valor(Math.abs(left.valorInteger() - right.valorInteger()) >= VALOR_MINI) :
                        new Valor(!left.equals(right));*/
            default:
                throw new RuntimeException(" Operador Desconocido: " + LenguajeParser.tokenNames[ctx.op.getType()]);
        }
    }
    @Override public Valor visitExprAnd(LenguajeParser.ExprAndContext ctx) {
        Valor izq = this.visit(ctx.expr(0));
        Valor der = this.visit(ctx.expr(1));
        return new Valor(izq.booleano() && der.booleano());
    }

    @Override public Valor visitExprOr(LenguajeParser.ExprOrContext ctx) {
        Valor izq = this.visit(ctx.expr(0));
        Valor der = this.visit(ctx.expr(1));
        return new Valor(izq.booleano()|| der.booleano());
    }


    @Override public Valor visitIf_condicion(LenguajeParser.If_condicionContext ctx) {
        memoria_size.putAll(memoria);
        List<LenguajeParser.CondicionContext> conditions =  ctx.condicion();

        boolean bloqueEvaluado = false;

        for(LenguajeParser.CondicionContext condition : conditions) {

            Valor evaluated = this.visit(condition.expr());

            if(evaluated.booleano()) {
                bloqueEvaluado = true;
                this.visit(condition.bloque_condicion());
                break;
            }
        }
        if(!bloqueEvaluado && ctx.bloque_condicion() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.bloque_condicion());
        }


        return Valor.VOID;
    }

    @Override public Valor visitCiclo_while(LenguajeParser.Ciclo_whileContext ctx)
    {
        Valor valor = this.visit(ctx.expr());
        while (valor.booleano()){
            this.visit(ctx.bloque_condicion());

            valor=this.visit(ctx.expr());
        }
        return Valor.VOID;
    }

    @Override public Valor visitFake(LenguajeParser.FakeContext ctx)
    {
        return new Valor(false); }

    @Override public Valor visitVerdad(LenguajeParser.VerdadContext ctx)
    {
        return new Valor(true); }

    @Override public Valor visitIncremento(LenguajeParser.IncrementoContext ctx) {
        String id= ctx.ID().getText();
        Valor valor = this.visit(ctx.expr());
        Integer nuevo= valor.valorInteger()+1;
        memoria.put(id,new Valor(nuevo));

        return new Valor(nuevo); }

    @Override public Valor visitLlave_A(LenguajeParser.Llave_AContext ctx) {
        memoria_size = clonar(memoria);
        int size_bloque = memoria_size.size();
        pila.push(size_bloque);
        memoria_memorias.put(level,memoria);
        level++;

        return Valor.VOID; }
    @Override public Valor visitLlave_C(LenguajeParser.Llave_CContext ctx) {

        int size_actual = memoria.size();
        int size = size_actual - pila.pop();
        Set<Map.Entry<String, Valor>> entradas = memoria.entrySet();
        Iterator<Map.Entry<String, Valor>> iterator = entradas.iterator();
        Map.Entry<String, Valor> entry, lastEntry =
                null;
        for (int i = 0; i< size; i++){
            while(iterator.hasNext()){

                entry = iterator.next();
                lastEntry = entry;
            }
            memoria.remove(lastEntry.getKey());
        }


        level--;

        return Valor.VOID; }


    public static <K, V> LinkedHashMap<String,Valor> clonar(Map<String,Valor> original){
        return new LinkedHashMap<>(original);
    }




}


