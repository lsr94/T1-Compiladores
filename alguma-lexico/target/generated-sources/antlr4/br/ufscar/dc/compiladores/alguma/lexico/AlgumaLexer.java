// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "ESC_SEQ", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\f\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000R\b\u0000\u0001\u0001\u0003"+
		"\u0001U\b\u0001\u0001\u0001\u0004\u0001X\b\u0001\u000b\u0001\f\u0001Y"+
		"\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0002\u0004\u0002`\b\u0002\u000b"+
		"\u0002\f\u0002a\u0001\u0002\u0001\u0002\u0004\u0002f\b\u0002\u000b\u0002"+
		"\f\u0002g\u0003\u0002j\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003n\b"+
		"\u0003\n\u0003\f\u0003q\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004v\b\u0004\n\u0004\f\u0004y\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0082"+
		"\b\u0006\n\u0006\f\u0006\u0085\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\u0083\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0000\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019"+
		"\f\u0001\u0000\u0006\u0002\u0000++--\u0002\u0000AZaz\u0003\u000009AZa"+
		"z\u0002\u0000\'\'\\\\\u0003\u0000\t\n\r\r  \u0003\u0000*+--//\u00b3\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001Q\u0001"+
		"\u0000\u0000\u0000\u0003T\u0001\u0000\u0000\u0000\u0005\\\u0001\u0000"+
		"\u0000\u0000\u0007k\u0001\u0000\u0000\u0000\tr\u0001\u0000\u0000\u0000"+
		"\u000b|\u0001\u0000\u0000\u0000\r\u007f\u0001\u0000\u0000\u0000\u000f"+
		"\u008a\u0001\u0000\u0000\u0000\u0011\u0096\u0001\u0000\u0000\u0000\u0013"+
		"\u0098\u0001\u0000\u0000\u0000\u0015\u009a\u0001\u0000\u0000\u0000\u0017"+
		"\u009c\u0001\u0000\u0000\u0000\u0019\u009e\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005d\u0000\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u001e\u0005"+
		"c\u0000\u0000\u001e\u001f\u0005l\u0000\u0000\u001f \u0005a\u0000\u0000"+
		" !\u0005r\u0000\u0000!R\u0005e\u0000\u0000\"#\u0005a\u0000\u0000#$\u0005"+
		"l\u0000\u0000$%\u0005g\u0000\u0000%&\u0005o\u0000\u0000&\'\u0005r\u0000"+
		"\u0000\'(\u0005i\u0000\u0000()\u0005t\u0000\u0000)*\u0005m\u0000\u0000"+
		"*R\u0005o\u0000\u0000+,\u0005i\u0000\u0000,-\u0005n\u0000\u0000-.\u0005"+
		"t\u0000\u0000./\u0005e\u0000\u0000/0\u0005i\u0000\u000001\u0005r\u0000"+
		"\u00001R\u0005o\u0000\u000023\u0005l\u0000\u000034\u0005i\u0000\u0000"+
		"45\u0005t\u0000\u000056\u0005e\u0000\u000067\u0005r\u0000\u000078\u0005"+
		"a\u0000\u00008R\u0005l\u0000\u00009:\u0005l\u0000\u0000:;\u0005e\u0000"+
		"\u0000;<\u0005i\u0000\u0000<R\u0005a\u0000\u0000=>\u0005e\u0000\u0000"+
		">?\u0005s\u0000\u0000?@\u0005c\u0000\u0000@A\u0005r\u0000\u0000AB\u0005"+
		"e\u0000\u0000BC\u0005v\u0000\u0000CR\u0005a\u0000\u0000DE\u0005f\u0000"+
		"\u0000EF\u0005i\u0000\u0000FG\u0005m\u0000\u0000GH\u0005_\u0000\u0000"+
		"HI\u0005a\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005g\u0000\u0000KL\u0005"+
		"o\u0000\u0000LM\u0005r\u0000\u0000MN\u0005i\u0000\u0000NO\u0005t\u0000"+
		"\u0000OP\u0005m\u0000\u0000PR\u0005o\u0000\u0000Q\u001b\u0001\u0000\u0000"+
		"\u0000Q\"\u0001\u0000\u0000\u0000Q+\u0001\u0000\u0000\u0000Q2\u0001\u0000"+
		"\u0000\u0000Q9\u0001\u0000\u0000\u0000Q=\u0001\u0000\u0000\u0000QD\u0001"+
		"\u0000\u0000\u0000R\u0002\u0001\u0000\u0000\u0000SU\u0007\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000VX\u000209\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0004\u0001"+
		"\u0000\u0000\u0000[]\u0007\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u000209\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bi\u0001\u0000\u0000\u0000ce\u0005.\u0000"+
		"\u0000df\u000209\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000"+
		"\u0000ic\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0006\u0001"+
		"\u0000\u0000\u0000ko\u0007\u0001\u0000\u0000ln\u0007\u0002\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\b\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rw\u0005\'\u0000\u0000sv\u0003\u000b\u0005\u0000tv\b\u0003"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\'\u0000\u0000"+
		"{\n\u0001\u0000\u0000\u0000|}\u0005\\\u0000\u0000}~\u0005\'\u0000\u0000"+
		"~\f\u0001\u0000\u0000\u0000\u007f\u0083\u0005{\u0000\u0000\u0080\u0082"+
		"\t\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005}\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0006\u0006\u0000\u0000\u0089\u000e\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0007\u0004\u0000\u0000\u008b\u008c\u0006\u0007"+
		"\u0001\u0000\u008c\u0010\u0001\u0000\u0000\u0000\u008d\u0097\u0005>\u0000"+
		"\u0000\u008e\u008f\u0005>\u0000\u0000\u008f\u0097\u0005=\u0000\u0000\u0090"+
		"\u0097\u0005<\u0000\u0000\u0091\u0092\u0005<\u0000\u0000\u0092\u0097\u0005"+
		"=\u0000\u0000\u0093\u0094\u0005<\u0000\u0000\u0094\u0097\u0005>\u0000"+
		"\u0000\u0095\u0097\u0005=\u0000\u0000\u0096\u008d\u0001\u0000\u0000\u0000"+
		"\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000"+
		"\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0012\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0007\u0005\u0000\u0000\u0099\u0014\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005:\u0000\u0000\u009b\u0016\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005(\u0000\u0000\u009d\u0018\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005)\u0000\u0000\u009f\u001a\u0001\u0000\u0000\u0000\r\u0000QTY\\a"+
		"giouw\u0083\u0096\u0002\u0006\u0000\u0000\u0001\u0007\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}