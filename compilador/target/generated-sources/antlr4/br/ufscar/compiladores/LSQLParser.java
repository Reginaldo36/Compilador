// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIM=2, OP_MAIS=3, OP_MENOS=4, OP_MULT=5, OP_DIV=6, OP_MAIOR=7, 
		OP_MENOR=8, OP_MAIOR_IGUAL=9, OP_MENOR_IGUAL=10, OP_DIFERENTE=11, OP_IGUAL=12, 
		ABRE_PARENTESE=13, FECHA_PARENTESE=14, VIRGULA=15, PONTO=16, ABRE_COLCHETE=17, 
		FECHA_COLCHETE=18, SETA=19, VERDADEIRO=20, FALSO=21, OP_OU=22, OP_E=23, 
		NAO=24, VARCHAR=25, TEXTO=26, INTEIRO=27, REAL=28, LOGICO=29, MOSTRA=30, 
		CRIA=31, ATUALIZA=32, APAGA=33, INSERE=34, TODOS=35, ONDE=36, PARA=37, 
		IDENT=38, COMENTARIO=39, ESC_SEQ=40, CADEIA=41, NUM_INT=42, NUM_REAL=43, 
		WS=44, UNDEFINED_CHAR=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'inicio'", "'fim'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
		"'>='", "'<='", "'<>'", "'='", "'('", "')'", "','", "'.'", "'['", "']'", 
		"'->'", "'verdadeiro'", "'falso'", "'ou'", "'e'", "'não'", "'varchar'", 
		"'texto'", "'inteiro'", "'real'", "'logico'", "'mostra'", "'cria'", "'atualiza'", 
		"'apaga'", "'insere'", "'todos'", "'onde'", "'para'", "IDENT", "COMENTARIO", 
		"'\\\"'", "CADEIA", "NUM_INT", "NUM_REAL", "WS", "UNDEFINED_CHAR"
	};
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_cmd = 2, RULE_cmd_cria = 3, RULE_cmd_mostra = 4, 
		RULE_cmd_insere = 5, RULE_cmd_atualiza = 6, RULE_cmd_apaga = 7, RULE_identificador = 8, 
		RULE_declaracao_var = 9, RULE_tipos_basicos = 10, RULE_expressao = 11, 
		RULE_termo_logico = 12, RULE_fator_logico = 13, RULE_colunas = 14, RULE_expressao_relacional = 15, 
		RULE_op_relacional = 16, RULE_expressao_aritmetica = 17, RULE_parcela_nao_numerica = 18;
	public static final String[] ruleNames = {
		"programa", "corpo", "cmd", "cmd_cria", "cmd_mostra", "cmd_insere", "cmd_atualiza", 
		"cmd_apaga", "identificador", "declaracao_var", "tipos_basicos", "expressao", 
		"termo_logico", "fator_logico", "colunas", "expressao_relacional", "op_relacional", 
		"expressao_aritmetica", "parcela_nao_numerica"
	};

	@Override
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LSQLParser.EOF, 0); }
		public TerminalNode FIM() { return getToken(LSQLParser.FIM, 0); }
		public TerminalNode INICIO() { return getToken(LSQLParser.INICIO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(INICIO);
			setState(39); corpo();
			setState(40); match(FIM);
			setState(41); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOSTRA) | (1L << CRIA) | (1L << ATUALIZA) | (1L << APAGA) | (1L << INSERE))) != 0)) {
				{
				{
				setState(43); cmd();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public Cmd_apagaContext cmd_apaga() {
			return getRuleContext(Cmd_apagaContext.class,0);
		}
		public Cmd_insereContext cmd_insere() {
			return getRuleContext(Cmd_insereContext.class,0);
		}
		public Cmd_criaContext cmd_cria() {
			return getRuleContext(Cmd_criaContext.class,0);
		}
		public Cmd_mostraContext cmd_mostra() {
			return getRuleContext(Cmd_mostraContext.class,0);
		}
		public Cmd_atualizaContext cmd_atualiza() {
			return getRuleContext(Cmd_atualizaContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case MOSTRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); cmd_mostra();
				}
				break;
			case CRIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); cmd_cria();
				}
				break;
			case INSERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); cmd_insere();
				}
				break;
			case ATUALIZA:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); cmd_atualiza();
				}
				break;
			case APAGA:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); cmd_apaga();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_criaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ABRE_COLCHETE() { return getToken(LSQLParser.ABRE_COLCHETE, 0); }
		public TerminalNode CRIA() { return getToken(LSQLParser.CRIA, 0); }
		public Declaracao_varContext declaracao_var(int i) {
			return getRuleContext(Declaracao_varContext.class,i);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(LSQLParser.FECHA_COLCHETE, 0); }
		public List<Declaracao_varContext> declaracao_var() {
			return getRuleContexts(Declaracao_varContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public Cmd_criaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_cria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_cria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_cria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_cria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_criaContext cmd_cria() throws RecognitionException {
		Cmd_criaContext _localctx = new Cmd_criaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_cria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(CRIA);
			setState(57); identificador();
			setState(58); match(ABRE_COLCHETE);
			setState(59); declaracao_var();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(60); match(VIRGULA);
				setState(61); declaracao_var();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(FECHA_COLCHETE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_mostraContext extends ParserRuleContext {
		public TerminalNode MOSTRA() { return getToken(LSQLParser.MOSTRA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode ONDE() { return getToken(LSQLParser.ONDE, 0); }
		public Cmd_mostraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_mostra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_mostra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_mostra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_mostra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_mostraContext cmd_mostra() throws RecognitionException {
		Cmd_mostraContext _localctx = new Cmd_mostraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_mostra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(MOSTRA);
			setState(70); colunas();
			setState(71); identificador();
			setState(74);
			_la = _input.LA(1);
			if (_la==ONDE) {
				{
				setState(72); match(ONDE);
				setState(73); expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_insereContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ABRE_COLCHETE() { return getToken(LSQLParser.ABRE_COLCHETE, 0); }
		public TerminalNode INSERE() { return getToken(LSQLParser.INSERE, 0); }
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(LSQLParser.FECHA_COLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public Cmd_insereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_insere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_insere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_insere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_insere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_insereContext cmd_insere() throws RecognitionException {
		Cmd_insereContext _localctx = new Cmd_insereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_insere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(INSERE);
			setState(77); identificador();
			setState(79);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETE) {
				{
				setState(78); match(ABRE_COLCHETE);
				}
			}

			setState(81); expressao_relacional();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(82); match(VIRGULA);
				setState(83); expressao_relacional();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_la = _input.LA(1);
			if (_la==FECHA_COLCHETE) {
				{
				setState(89); match(FECHA_COLCHETE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_atualizaContext extends ParserRuleContext {
		public TerminalNode ATUALIZA() { return getToken(LSQLParser.ATUALIZA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ONDE() { return getToken(LSQLParser.ONDE, 0); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public TerminalNode PARA() { return getToken(LSQLParser.PARA, 0); }
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public Cmd_atualizaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atualiza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_atualiza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_atualiza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_atualiza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atualizaContext cmd_atualiza() throws RecognitionException {
		Cmd_atualizaContext _localctx = new Cmd_atualizaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_atualiza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(ATUALIZA);
			setState(93); identificador();
			setState(96);
			_la = _input.LA(1);
			if (_la==ONDE) {
				{
				setState(94); match(ONDE);
				setState(95); expressao();
				}
			}

			setState(98); match(PARA);
			setState(99); expressao_relacional();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(100); match(VIRGULA);
				setState(101); expressao_relacional();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_apagaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode APAGA() { return getToken(LSQLParser.APAGA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ONDE() { return getToken(LSQLParser.ONDE, 0); }
		public Cmd_apagaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_apaga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_apaga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_apaga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_apaga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_apagaContext cmd_apaga() throws RecognitionException {
		Cmd_apagaContext _localctx = new Cmd_apagaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd_apaga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(APAGA);
			setState(108); identificador();
			setState(111);
			_la = _input.LA(1);
			if (_la==ONDE) {
				{
				setState(109); match(ONDE);
				setState(110); expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENT(int i) {
			return getToken(LSQLParser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(LSQLParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(LSQLParser.PONTO, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LSQLParser.IDENT); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(IDENT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(114); match(PONTO);
				setState(115); match(IDENT);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_varContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Tipos_basicosContext tipos_basicos() {
			return getRuleContext(Tipos_basicosContext.class,0);
		}
		public TerminalNode SETA() { return getToken(LSQLParser.SETA, 0); }
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDeclaracao_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDeclaracao_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDeclaracao_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); identificador();
			setState(122); match(SETA);
			setState(123); tipos_basicos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_basicosContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode REAL() { return getToken(LSQLParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LSQLParser.INTEIRO, 0); }
		public TerminalNode TEXTO() { return getToken(LSQLParser.TEXTO, 0); }
		public TerminalNode VARCHAR() { return getToken(LSQLParser.VARCHAR, 0); }
		public Tipos_basicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_basicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterTipos_basicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitTipos_basicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitTipos_basicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_basicosContext tipos_basicos() throws RecognitionException {
		Tipos_basicosContext _localctx = new Tipos_basicosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipos_basicos);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(TEXTO);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(127); match(REAL);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(128); match(VARCHAR);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(129); identificador();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode OP_OU(int i) {
			return getToken(LSQLParser.OP_OU, i);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public List<TerminalNode> OP_OU() { return getTokens(LSQLParser.OP_OU); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); termo_logico();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OU) {
				{
				{
				setState(133); match(OP_OU);
				setState(134); termo_logico();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<TerminalNode> OP_E() { return getTokens(LSQLParser.OP_E); }
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public TerminalNode OP_E(int i) {
			return getToken(LSQLParser.OP_E, i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); fator_logico();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_E) {
				{
				{
				setState(141); match(OP_E);
				setState(142); fator_logico();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(LSQLParser.NAO, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(148); match(NAO);
				}
			}

			setState(151); expressao_relacional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColunasContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode TODOS() { return getToken(LSQLParser.TODOS, 0); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public ColunasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterColunas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitColunas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitColunas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColunasContext colunas() throws RecognitionException {
		ColunasContext _localctx = new ColunasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colunas);
		int _la;
		try {
			setState(162);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); identificador();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(154); match(VIRGULA);
					setState(155); identificador();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TODOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(TODOS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpressao_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpressao_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); expressao_aritmetica();
			{
			setState(165); op_relacional();
			setState(166); expressao_aritmetica();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OP_DIFERENTE() { return getToken(LSQLParser.OP_DIFERENTE, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(LSQLParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_MAIOR() { return getToken(LSQLParser.OP_MAIOR, 0); }
		public TerminalNode OP_MAIOR_IGUAL() { return getToken(LSQLParser.OP_MAIOR_IGUAL, 0); }
		public TerminalNode OP_MENOR() { return getToken(LSQLParser.OP_MENOR, 0); }
		public TerminalNode OP_IGUAL() { return getToken(LSQLParser.OP_IGUAL, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAIOR) | (1L << OP_MENOR) | (1L << OP_MAIOR_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_DIFERENTE) | (1L << OP_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(LSQLParser.NUM_REAL, 0); }
		public Parcela_nao_numericaContext parcela_nao_numerica() {
			return getRuleContext(Parcela_nao_numericaContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LSQLParser.NUM_INT, 0); }
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao_aritmetica);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(NUM_REAL);
				}
				break;
			case IDENT:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); parcela_nao_numerica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_numericaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LSQLParser.CADEIA, 0); }
		public Parcela_nao_numericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_numerica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterParcela_nao_numerica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitParcela_nao_numerica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitParcela_nao_numerica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_numericaContext parcela_nao_numerica() throws RecognitionException {
		Parcela_nao_numericaContext _localctx = new Parcela_nao_numericaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parcela_nao_numerica);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\5\7R\n\7\3\7"+
		"\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\5\bc\n\b"+
		"\3\b\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\3\t\5\tr\n\t\3\n"+
		"\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0085\n\f\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\3\16\3"+
		"\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\5\17\u0098\n\17\3"+
		"\17\3\17\3\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\20\5"+
		"\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u00b0"+
		"\n\23\3\24\3\24\5\24\u00b4\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\3\2\t\16\u00bc\2(\3\2\2\2\4\60\3\2\2\2\68\3\2\2"+
		"\2\b:\3\2\2\2\nG\3\2\2\2\fN\3\2\2\2\16^\3\2\2\2\20m\3\2\2\2\22s\3\2\2"+
		"\2\24{\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u008e\3\2\2\2\34\u0097"+
		"\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00aa\3\2\2\2$\u00af\3\2\2"+
		"\2&\u00b3\3\2\2\2()\7\3\2\2)*\5\4\3\2*+\7\4\2\2+,\7\2\2\3,\3\3\2\2\2-"+
		"/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2"+
		"\62\60\3\2\2\2\639\5\n\6\2\649\5\b\5\2\659\5\f\7\2\669\5\16\b\2\679\5"+
		"\20\t\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7"+
		"\3\2\2\2:;\7!\2\2;<\5\22\n\2<=\7\23\2\2=B\5\24\13\2>?\7\21\2\2?A\5\24"+
		"\13\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7"+
		"\24\2\2F\t\3\2\2\2GH\7 \2\2HI\5\36\20\2IL\5\22\n\2JK\7&\2\2KM\5\30\r\2"+
		"LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\7$\2\2OQ\5\22\n\2PR\7\23\2\2QP\3\2"+
		"\2\2QR\3\2\2\2RS\3\2\2\2SX\5 \21\2TU\7\21\2\2UW\5 \21\2VT\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\7\24\2\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]\r\3\2\2\2^_\7\"\2\2_b\5\22\n\2`a\7&\2\2ac\5\30\r\2b`\3\2"+
		"\2\2bc\3\2\2\2cd\3\2\2\2de\7\'\2\2ej\5 \21\2fg\7\21\2\2gi\5 \21\2hf\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2\2mn\7#\2\2nq"+
		"\5\22\n\2op\7&\2\2pr\5\30\r\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sx\7(\2\2"+
		"tu\7\22\2\2uw\7(\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\23\3\2\2"+
		"\2zx\3\2\2\2{|\5\22\n\2|}\7\25\2\2}~\5\26\f\2~\25\3\2\2\2\177\u0085\7"+
		"\34\2\2\u0080\u0085\7\35\2\2\u0081\u0085\7\36\2\2\u0082\u0085\7\33\2\2"+
		"\u0083\u0085\5\22\n\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086"+
		"\u008b\5\32\16\2\u0087\u0088\7\30\2\2\u0088\u008a\5\32\16\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\31\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0093\5\34\17\2\u008f\u0090\7\31"+
		"\2\2\u0090\u0092\5\34\17\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0093\3\2\2"+
		"\2\u0096\u0098\7\32\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\5 \21\2\u009a\35\3\2\2\2\u009b\u00a0\5\22\n"+
		"\2\u009c\u009d\7\21\2\2\u009d\u009f\5\22\n\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7%\2\2\u00a4\u009b\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\5\"\22"+
		"\2\u00a8\u00a9\5$\23\2\u00a9!\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab#\3\2\2"+
		"\2\u00ac\u00b0\7,\2\2\u00ad\u00b0\7-\2\2\u00ae\u00b0\5&\24\2\u00af\u00ac"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0%\3\2\2\2\u00b1"+
		"\u00b4\5\22\n\2\u00b2\u00b4\7+\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\'\3\2\2\2\25\608BLQX\\bjqx\u0084\u008b\u0093\u0097\u00a0\u00a4"+
		"\u00af\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}