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
	 * Visit a parse tree produced by {@link CookParserParser#recipiente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipiente(@NotNull CookParserParser.RecipienteContext ctx);
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
	 * Visit a parse tree produced by {@link CookParserParser#moler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoler(@NotNull CookParserParser.MolerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(@NotNull CookParserParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull CookParserParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(@NotNull CookParserParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#pelar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPelar(@NotNull CookParserParser.PelarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#yo_creo_que_van_a_pelear_con_cuchillos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYo_creo_que_van_a_pelear_con_cuchillos(@NotNull CookParserParser.Yo_creo_que_van_a_pelear_con_cuchillosContext ctx);
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
	 * Visit a parse tree produced by {@link CookParserParser#hervir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHervir(@NotNull CookParserParser.HervirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#utencilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtencilio(@NotNull CookParserParser.UtencilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#iniciar_cocina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciar_cocina(@NotNull CookParserParser.Iniciar_cocinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#mezclar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMezclar(@NotNull CookParserParser.MezclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#aparato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparato(@NotNull CookParserParser.AparatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#servir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServir(@NotNull CookParserParser.ServirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tipo_ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_ingrediente(@NotNull CookParserParser.Tipo_ingredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(@NotNull CookParserParser.OperacionesContext ctx);
}