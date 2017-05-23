// Generated from Diunisio.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiunisioParser}.
 */
public interface DiunisioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 */
	void enterLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 */
	void exitLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 */
	void enterExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 */
	void exitExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 */
	void enterLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 */
	void exitLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#tipoclase}.
	 * @param ctx the parse tree
	 */
	void enterTipoclase(DiunisioParser.TipoclaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#tipoclase}.
	 * @param ctx the parse tree
	 */
	void exitTipoclase(DiunisioParser.TipoclaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#decl_clases}.
	 * @param ctx the parse tree
	 */
	void enterDecl_clases(DiunisioParser.Decl_clasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#decl_clases}.
	 * @param ctx the parse tree
	 */
	void exitDecl_clases(DiunisioParser.Decl_clasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#metodos}.
	 * @param ctx the parse tree
	 */
	void enterMetodos(DiunisioParser.MetodosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#metodos}.
	 * @param ctx the parse tree
	 */
	void exitMetodos(DiunisioParser.MetodosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 */
	void enterSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 */
	void exitSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void enterProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void exitProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 */
	void enterSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 */
	void exitSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 */
	void enterMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 */
	void exitMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 */
	void enterHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 */
	void exitHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 */
	void enterPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 */
	void exitPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#estruc_control}.
	 * @param ctx the parse tree
	 */
	void enterEstruc_control(DiunisioParser.Estruc_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#estruc_control}.
	 * @param ctx the parse tree
	 */
	void exitEstruc_control(DiunisioParser.Estruc_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 */
	void enterFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 */
	void exitFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 */
	void enterProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 */
	void exitProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(DiunisioParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(DiunisioParser.FuncionContext ctx);
}