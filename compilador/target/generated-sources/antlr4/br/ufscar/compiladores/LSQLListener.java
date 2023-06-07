// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LSQLParser}.
 */
public interface LSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LSQLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LSQLParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LSQLParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull LSQLParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull LSQLParser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_cria}.
	 * @param ctx the parse tree
	 */
	void enterCmd_cria(@NotNull LSQLParser.Cmd_criaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_cria}.
	 * @param ctx the parse tree
	 */
	void exitCmd_cria(@NotNull LSQLParser.Cmd_criaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LSQLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LSQLParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_var(@NotNull LSQLParser.Declaracao_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_var(@NotNull LSQLParser.Declaracao_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_apaga}.
	 * @param ctx the parse tree
	 */
	void enterCmd_apaga(@NotNull LSQLParser.Cmd_apagaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_apaga}.
	 * @param ctx the parse tree
	 */
	void exitCmd_apaga(@NotNull LSQLParser.Cmd_apagaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LSQLParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LSQLParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(@NotNull LSQLParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(@NotNull LSQLParser.Expressao_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#tipos_basicos}.
	 * @param ctx the parse tree
	 */
	void enterTipos_basicos(@NotNull LSQLParser.Tipos_basicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#tipos_basicos}.
	 * @param ctx the parse tree
	 */
	void exitTipos_basicos(@NotNull LSQLParser.Tipos_basicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_insere}.
	 * @param ctx the parse tree
	 */
	void enterCmd_insere(@NotNull LSQLParser.Cmd_insereContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_insere}.
	 * @param ctx the parse tree
	 */
	void exitCmd_insere(@NotNull LSQLParser.Cmd_insereContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#colunas}.
	 * @param ctx the parse tree
	 */
	void enterColunas(@NotNull LSQLParser.ColunasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#colunas}.
	 * @param ctx the parse tree
	 */
	void exitColunas(@NotNull LSQLParser.ColunasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(@NotNull LSQLParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(@NotNull LSQLParser.Expressao_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_atualiza}.
	 * @param ctx the parse tree
	 */
	void enterCmd_atualiza(@NotNull LSQLParser.Cmd_atualizaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_atualiza}.
	 * @param ctx the parse tree
	 */
	void exitCmd_atualiza(@NotNull LSQLParser.Cmd_atualizaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_mostra}.
	 * @param ctx the parse tree
	 */
	void enterCmd_mostra(@NotNull LSQLParser.Cmd_mostraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_mostra}.
	 * @param ctx the parse tree
	 */
	void exitCmd_mostra(@NotNull LSQLParser.Cmd_mostraContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull LSQLParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull LSQLParser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LSQLParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LSQLParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LSQLParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LSQLParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#parcela_nao_numerica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_numerica(@NotNull LSQLParser.Parcela_nao_numericaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#parcela_nao_numerica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_numerica(@NotNull LSQLParser.Parcela_nao_numericaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LSQLParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LSQLParser.IdentificadorContext ctx);
}