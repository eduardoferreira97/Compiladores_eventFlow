// Generated from /home/eduardoferreira/IdeaProjects/EventFlowProject/EventFlow.g4 by ANTLR 4.13.2
package br.com.poli.eventflow;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EventFlowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
			T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
			T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24,
			ID=25, STRING=26, INT=27, BOOL=28, WS=29, COMMENT=30;
	public static final int
			RULE_programa = 0, RULE_definicao = 1, RULE_config_def = 2, RULE_event_def = 3,
			RULE_platform_def = 4, RULE_platform_stmt = 5, RULE_pipeline_def = 6,
			RULE_stage_def = 7, RULE_command = 8, RULE_run_stmt = 9, RULE_if_stmt = 10,
			RULE_condition = 11, RULE_prop_list = 12, RULE_prop_stmt = 13, RULE_value = 14,
			RULE_literal = 15, RULE_func_call = 16, RULE_env_var = 17;
	private static String[] makeRuleNames() {
		return new String[] {
				"programa", "definicao", "config_def", "event_def", "platform_def", "platform_stmt",
				"pipeline_def", "stage_def", "command", "run_stmt", "if_stmt", "condition",
				"prop_list", "prop_stmt", "value", "literal", "func_call", "env_var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'config'", "'{'", "'}'", "'EVENT'", "'PLATFORM'", "'generate'",
				"'file'", "'from_template'", "'('", "')'", "'to'", "'json'", "'with'",
				"'PIPELINE'", "'stage'", "'run'", "';'", "'if'", "'else'", "'=='", "':'",
				"'.'", "'${'", "'env.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, "ID", "STRING", "INT", "BOOL", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EventFlow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EventFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EventFlowParser.EOF, 0); }
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(36);
							definicao();
						}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16434L) != 0) );
				setState(41);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicaoContext extends ParserRuleContext {
		public Config_defContext config_def() {
			return getRuleContext(Config_defContext.class,0);
		}
		public Event_defContext event_def() {
			return getRuleContext(Event_defContext.class,0);
		}
		public Platform_defContext platform_def() {
			return getRuleContext(Platform_defContext.class,0);
		}
		public Pipeline_defContext pipeline_def() {
			return getRuleContext(Pipeline_defContext.class,0);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitDefinicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicao);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__0:
					enterOuterAlt(_localctx, 1);
				{
					setState(43);
					config_def();
				}
				break;
				case T__3:
					enterOuterAlt(_localctx, 2);
				{
					setState(44);
					event_def();
				}
				break;
				case T__4:
					enterOuterAlt(_localctx, 3);
				{
					setState(45);
					platform_def();
				}
				break;
				case T__13:
					enterOuterAlt(_localctx, 4);
				{
					setState(46);
					pipeline_def();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Config_defContext extends ParserRuleContext {
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Config_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitConfig_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_defContext config_def() throws RecognitionException {
		Config_defContext _localctx = new Config_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_config_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(49);
				match(T__0);
				setState(50);
				match(T__1);
				setState(51);
				prop_list();
				setState(52);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Event_defContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EventFlowParser.STRING, 0); }
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Event_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitEvent_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_defContext event_def() throws RecognitionException {
		Event_defContext _localctx = new Event_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_event_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(54);
				match(T__3);
				setState(55);
				match(STRING);
				setState(56);
				match(T__1);
				setState(57);
				prop_list();
				setState(58);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Platform_defContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EventFlowParser.STRING, 0); }
		public List<Platform_stmtContext> platform_stmt() {
			return getRuleContexts(Platform_stmtContext.class);
		}
		public Platform_stmtContext platform_stmt(int i) {
			return getRuleContext(Platform_stmtContext.class,i);
		}
		public Platform_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitPlatform_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_defContext platform_def() throws RecognitionException {
		Platform_defContext _localctx = new Platform_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_platform_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(60);
				match(T__4);
				setState(61);
				match(STRING);
				setState(62);
				match(T__1);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(63);
							platform_stmt();
						}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(68);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Platform_stmtContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Platform_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitPlatform_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_stmtContext platform_stmt() throws RecognitionException {
		Platform_stmtContext _localctx = new Platform_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_platform_stmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(70);
					match(T__5);
					setState(71);
					match(T__6);
					setState(72);
					match(T__7);
					setState(73);
					match(T__8);
					setState(74);
					value();
					setState(75);
					match(T__9);
					setState(76);
					match(T__10);
					setState(77);
					value();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(79);
					match(T__5);
					setState(80);
					match(T__11);
					setState(81);
					value();
					setState(82);
					match(T__12);
					setState(83);
					match(T__1);
					setState(84);
					prop_list();
					setState(85);
					match(T__2);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pipeline_defContext extends ParserRuleContext {
		public List<Stage_defContext> stage_def() {
			return getRuleContexts(Stage_defContext.class);
		}
		public Stage_defContext stage_def(int i) {
			return getRuleContext(Stage_defContext.class,i);
		}
		public Pipeline_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitPipeline_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pipeline_defContext pipeline_def() throws RecognitionException {
		Pipeline_defContext _localctx = new Pipeline_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pipeline_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(89);
				match(T__13);
				setState(90);
				match(T__1);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(91);
							stage_def();
						}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__14 );
				setState(96);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stage_defContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EventFlowParser.STRING, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Stage_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stage_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitStage_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stage_defContext stage_def() throws RecognitionException {
		Stage_defContext _localctx = new Stage_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stage_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(98);
				match(T__14);
				setState(99);
				match(STRING);
				setState(100);
				match(T__1);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(101);
							command();
						}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__15 || _la==T__17 );
				setState(106);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public Run_stmtContext run_stmt() {
			return getRuleContext(Run_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__15:
					enterOuterAlt(_localctx, 1);
				{
					setState(108);
					run_stmt();
				}
				break;
				case T__17:
					enterOuterAlt(_localctx, 2);
				{
					setState(109);
					if_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Run_stmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Run_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitRun_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Run_stmtContext run_stmt() throws RecognitionException {
		Run_stmtContext _localctx = new Run_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_run_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				match(T__15);
				setState(113);
				value();
				setState(114);
				match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				match(T__17);
				setState(117);
				match(T__8);
				setState(118);
				condition();
				setState(119);
				match(T__9);
				setState(120);
				match(T__1);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(121);
							command();
						}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__15 || _la==T__17 );
				setState(126);
				match(T__2);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
						setState(127);
						match(T__18);
						setState(128);
						match(T__1);
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(129);
									command();
								}
							}
							setState(132);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__15 || _la==T__17 );
						setState(134);
						match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				value();
				setState(139);
				match(T__19);
				setState(140);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prop_listContext extends ParserRuleContext {
		public List<Prop_stmtContext> prop_stmt() {
			return getRuleContexts(Prop_stmtContext.class);
		}
		public Prop_stmtContext prop_stmt(int i) {
			return getRuleContext(Prop_stmtContext.class,i);
		}
		public Prop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitProp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_listContext prop_list() throws RecognitionException {
		Prop_listContext _localctx = new Prop_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prop_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
						{
							setState(142);
							prop_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prop_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EventFlowParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Prop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitProp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_stmtContext prop_stmt() throws RecognitionException {
		Prop_stmtContext _localctx = new Prop_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(148);
				match(ID);
				setState(149);
				match(T__20);
				setState(150);
				value();
				setState(151);
				match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(EventFlowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EventFlowParser.ID, i);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Env_varContext env_var() {
			return getRuleContext(Env_varContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(153);
					literal();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(154);
					match(ID);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
							{
								setState(155);
								match(T__21);
								setState(156);
								match(ID);
							}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(162);
					func_call();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(163);
					env_var();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EventFlowParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EventFlowParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(EventFlowParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(166);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EventFlowParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(168);
				match(ID);
				setState(169);
				match(T__8);
				setState(170);
				value();
				setState(171);
				match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Env_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EventFlowParser.ID, 0); }
		public Env_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_env_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EventFlowVisitor ) return ((EventFlowVisitor<? extends T>)visitor).visitEnv_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Env_varContext env_var() throws RecognitionException {
		Env_varContext _localctx = new Env_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_env_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				match(T__22);
				setState(174);
				match(T__23);
				setState(175);
				match(ID);
				setState(176);
				match(T__2);
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
			"\u0004\u0001\u001e\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
					"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
					"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
					"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
					"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
					"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004"+
					"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0002"+
					"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
					"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
					"\u0001\u0004\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004\f\u0004B\u0001"+
					"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
					"\u0005\u0003\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
					"\u0006]\b\u0006\u000b\u0006\f\u0006^\u0001\u0006\u0001\u0006\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007g\b\u0007\u000b\u0007"+
					"\f\u0007h\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\bo\b\b\u0001\t"+
					"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
					"\n\u0004\n{\b\n\u000b\n\f\n|\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0083"+
					"\b\n\u000b\n\f\n\u0084\u0001\n\u0001\n\u0003\n\u0089\b\n\u0001\u000b\u0001"+
					"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0090\b\f\n\f\f\f\u0093"+
					"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
					"\u000e\u0001\u000e\u0005\u000e\u009e\b\u000e\n\u000e\f\u000e\u00a1\t\u000e"+
					"\u0001\u000e\u0001\u000e\u0003\u000e\u00a5\b\u000e\u0001\u000f\u0001\u000f"+
					"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
					"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000"+
					"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
					"\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u001a\u001c\u00b1\u0000"+
					"%\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00041\u0001"+
					"\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000"+
					"\u0000\nW\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000eb\u0001"+
					"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
					"\u0000\u0014t\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000"+
					"\u0018\u0091\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000"+
					"\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00a6\u0001\u0000\u0000\u0000"+
					" \u00a8\u0001\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$&\u0003"+
					"\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
					"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
					"\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+0\u0003"+
					"\u0004\u0002\u0000,0\u0003\u0006\u0003\u0000-0\u0003\b\u0004\u0000.0\u0003"+
					"\f\u0006\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u0000/-\u0001"+
					"\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000"+
					"\u000012\u0005\u0001\u0000\u000023\u0005\u0002\u0000\u000034\u0003\u0018"+
					"\f\u000045\u0005\u0003\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0005"+
					"\u0004\u0000\u000078\u0005\u001a\u0000\u000089\u0005\u0002\u0000\u0000"+
					"9:\u0003\u0018\f\u0000:;\u0005\u0003\u0000\u0000;\u0007\u0001\u0000\u0000"+
					"\u0000<=\u0005\u0005\u0000\u0000=>\u0005\u001a\u0000\u0000>@\u0005\u0002"+
					"\u0000\u0000?A\u0003\n\u0005\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
					"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
					"\u0000\u0000\u0000DE\u0005\u0003\u0000\u0000E\t\u0001\u0000\u0000\u0000"+
					"FG\u0005\u0006\u0000\u0000GH\u0005\u0007\u0000\u0000HI\u0005\b\u0000\u0000"+
					"IJ\u0005\t\u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0005\n\u0000\u0000"+
					"LM\u0005\u000b\u0000\u0000MN\u0003\u001c\u000e\u0000NX\u0001\u0000\u0000"+
					"\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\f\u0000\u0000QR\u0003\u001c\u000e"+
					"\u0000RS\u0005\r\u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0003\u0018\f"+
					"\u0000UV\u0005\u0003\u0000\u0000VX\u0001\u0000\u0000\u0000WF\u0001\u0000"+
					"\u0000\u0000WO\u0001\u0000\u0000\u0000X\u000b\u0001\u0000\u0000\u0000"+
					"YZ\u0005\u000e\u0000\u0000Z\\\u0005\u0002\u0000\u0000[]\u0003\u000e\u0007"+
					"\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
					"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005"+
					"\u0003\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u000f\u0000\u0000"+
					"cd\u0005\u001a\u0000\u0000df\u0005\u0002\u0000\u0000eg\u0003\u0010\b\u0000"+
					"fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
					"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0003"+
					"\u0000\u0000k\u000f\u0001\u0000\u0000\u0000lo\u0003\u0012\t\u0000mo\u0003"+
					"\u0014\n\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0011"+
					"\u0001\u0000\u0000\u0000pq\u0005\u0010\u0000\u0000qr\u0003\u001c\u000e"+
					"\u0000rs\u0005\u0011\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005"+
					"\u0012\u0000\u0000uv\u0005\t\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0005"+
					"\n\u0000\u0000xz\u0005\u0002\u0000\u0000y{\u0003\u0010\b\u0000zy\u0001"+
					"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
					"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0088\u0005\u0003"+
					"\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u0082\u0005\u0002"+
					"\u0000\u0000\u0081\u0083\u0003\u0010\b\u0000\u0082\u0081\u0001\u0000\u0000"+
					"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
					"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
					"\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
					"\u0000\u0088\u007f\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
					"\u0000\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u001c\u000e"+
					"\u0000\u008b\u008c\u0005\u0014\u0000\u0000\u008c\u008d\u0003\u001c\u000e"+
					"\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u001a\r\u0000"+
					"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
					"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
					"\u0092\u0019\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
					"\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0005\u0015\u0000\u0000"+
					"\u0096\u0097\u0003\u001c\u000e\u0000\u0097\u0098\u0005\u0011\u0000\u0000"+
					"\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u00a5\u0003\u001e\u000f\u0000"+
					"\u009a\u009f\u0005\u0019\u0000\u0000\u009b\u009c\u0005\u0016\u0000\u0000"+
					"\u009c\u009e\u0005\u0019\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
					"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
					"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a5\u0001\u0000\u0000\u0000"+
					"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003 \u0010\u0000\u00a3"+
					"\u00a5\u0003\"\u0011\u0000\u00a4\u0099\u0001\u0000\u0000\u0000\u00a4\u009a"+
					"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3"+
					"\u0001\u0000\u0000\u0000\u00a5\u001d\u0001\u0000\u0000\u0000\u00a6\u00a7"+
					"\u0007\u0000\u0000\u0000\u00a7\u001f\u0001\u0000\u0000\u0000\u00a8\u00a9"+
					"\u0005\u0019\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ab\u0003"+
					"\u001c\u000e\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac!\u0001\u0000"+
					"\u0000\u0000\u00ad\u00ae\u0005\u0017\u0000\u0000\u00ae\u00af\u0005\u0018"+
					"\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00b1\u0005\u0003"+
					"\u0000\u0000\u00b1#\u0001\u0000\u0000\u0000\r\'/BW^hn|\u0084\u0088\u0091"+
					"\u009f\u00a4";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}