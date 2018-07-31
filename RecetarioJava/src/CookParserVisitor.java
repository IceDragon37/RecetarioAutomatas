// Generated from CookParser.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link CookParserParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(CookParserParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#iniciar_cocina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIniciar_cocina(CookParserParser.Iniciar_cocinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#finalizar_cocina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar_cocina(CookParserParser.Finalizar_cocinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tiempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiempo(CookParserParser.TiempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#porciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorciones(CookParserParser.PorcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(CookParserParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#tipo_ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_ingrediente(CookParserParser.Tipo_ingredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#aparato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparato(CookParserParser.AparatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#recipiente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipiente(CookParserParser.RecipienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#utencilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtencilio(CookParserParser.UtencilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(CookParserParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(CookParserParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#mezclar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMezclar(CookParserParser.MezclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#moler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoler(CookParserParser.MolerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#pelar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPelar(CookParserParser.PelarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#servir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServir(CookParserParser.ServirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#hervir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHervir(CookParserParser.HervirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#declararcorte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararcorte(CookParserParser.DeclararcorteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#cortar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCortar(CookParserParser.CortarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#yo_creo_que_van_a_pelear_con_cuchillos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYo_creo_que_van_a_pelear_con_cuchillos(CookParserParser.Yo_creo_que_van_a_pelear_con_cuchillosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(CookParserParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#quehacersi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuehacersi(CookParserParser.QuehacersiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookParserParser#ciclosinfin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclosinfin(CookParserParser.CiclosinfinContext ctx);
}