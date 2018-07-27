// Generated from CookParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CookParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CookParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CookParserParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(@NotNull CookParserParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#finalizar_cocina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar_cocina(@NotNull CookParserParser.Finalizar_cocinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull CookParserParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#ciclosinfin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclosinfin(@NotNull CookParserParser.CiclosinfinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#porciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorciones(@NotNull CookParserParser.PorcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(@NotNull CookParserParser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(@NotNull CookParserParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tipo_utencilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_utencilio(@NotNull CookParserParser.Tipo_utencilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#operacion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_logica(@NotNull CookParserParser.Operacion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(@NotNull CookParserParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tipo_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_variable(@NotNull CookParserParser.Tipo_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull CookParserParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#cicloconfin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloconfin(@NotNull CookParserParser.CicloconfinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#escribe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribe(@NotNull CookParserParser.EscribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tiempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiempo(@NotNull CookParserParser.TiempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#quehacersi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuehacersi(@NotNull CookParserParser.QuehacersiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(@NotNull CookParserParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#iniciar_cocina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciar_cocina(@NotNull CookParserParser.Iniciar_cocinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(@NotNull CookParserParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(@NotNull CookParserParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#condicionfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionfor(@NotNull CookParserParser.CondicionforContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(@NotNull CookParserParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tipo_ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_ingrediente(@NotNull CookParserParser.Tipo_ingredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(@NotNull CookParserParser.LecturaContext ctx);
}