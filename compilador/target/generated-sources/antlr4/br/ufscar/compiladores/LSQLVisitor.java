// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LSQLParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(@NotNull LSQLParser.CorpoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(@NotNull LSQLParser.Fator_logicoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd_cria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_cria(@NotNull LSQLParser.Cmd_criaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull LSQLParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#declaracao_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_var(@NotNull LSQLParser.Declaracao_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd_apaga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_apaga(@NotNull LSQLParser.Cmd_apagaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(@NotNull LSQLParser.ExpressaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_relacional(@NotNull LSQLParser.Expressao_relacionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#tipos_basicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_basicos(@NotNull LSQLParser.Tipos_basicosContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd_insere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_insere(@NotNull LSQLParser.Cmd_insereContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#colunas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColunas(@NotNull LSQLParser.ColunasContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica(@NotNull LSQLParser.Expressao_aritmeticaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd_atualiza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_atualiza(@NotNull LSQLParser.Cmd_atualizaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd_mostra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_mostra(@NotNull LSQLParser.Cmd_mostraContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(@NotNull LSQLParser.Termo_logicoContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(@NotNull LSQLParser.Op_relacionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(@NotNull LSQLParser.CmdContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#parcela_nao_numerica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_numerica(@NotNull LSQLParser.Parcela_nao_numericaContext ctx);

	/**
	 * Visit a parse tree produced by {@link LSQLParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(@NotNull LSQLParser.IdentificadorContext ctx);
}