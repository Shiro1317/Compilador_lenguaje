// Generated from Lenguaje.g4 by ANTLR 4.8
package isidro.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(LenguajeParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(LenguajeParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#llave_A}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave_A(LenguajeParser.Llave_AContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#llave_C}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave_C(LenguajeParser.Llave_CContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(LenguajeParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#if_condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condicion(LenguajeParser.If_condicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LenguajeParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#bloque_condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicion(LenguajeParser.Bloque_condicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(LenguajeParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#declarar_y_asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_y_asignar(LenguajeParser.Declarar_y_asignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(LenguajeParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LenguajeParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimir}
	 * labeled alternative in {@link LenguajeParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(LenguajeParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimir2}
	 * labeled alternative in {@link LenguajeParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir2(LenguajeParser.Imprimir2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(LenguajeParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdad}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdad(LenguajeParser.VerdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion_Relacional}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_Relacional(LenguajeParser.Expresion_RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LenguajeParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion_igual}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_igual(LenguajeParser.Expresion_igualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesisExpr}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExpr(LenguajeParser.ParentesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajeParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LenguajeParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(LenguajeParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(LenguajeParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(LenguajeParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion_negativa}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_negativa(LenguajeParser.Expresion_negativaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fake}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFake(LenguajeParser.FakeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajeParser.IdContext ctx);
}