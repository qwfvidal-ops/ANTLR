// Generated from BasicLex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BasicLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, IF=2, ELSE=3, ID=4, NUMBER=5, ASSIGN=6, SEMI=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, WS=12, ERROR_TOKEN=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "IF", "ELSE", "ID", "NUMBER", "ASSIGN", "SEMI", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "WS", "ERROR_TOKEN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'if'", "'else'", null, null, "'='", "';'", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "IF", "ELSE", "ID", "NUMBER", "ASSIGN", "SEMI", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "WS", "ERROR_TOKEN"
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


	public BasicLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BasicLex.g4"; }

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
		case 12:
			ERROR_TOKEN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.err.println("Skipping invalid character: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\rK\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003*\b"+
		"\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0004\u0004\u00040\b\u0004\u000b"+
		"\u0004\f\u00041\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bA\b\u000b\u000b\u000b\f\u000bB\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0004\u0003\u0000A"+
		"Z__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  M\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000"+
		"\u0000\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"@\u0001\u0000\u0000\u0000\u0019F\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"i\u0000\u0000\u001c\u001d\u0005n\u0000\u0000\u001d\u001e\u0005t\u0000"+
		"\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 "+
		"!\u0005f\u0000\u0000!\u0004\u0001\u0000\u0000\u0000\"#\u0005e\u0000\u0000"+
		"#$\u0005l\u0000\u0000$%\u0005s\u0000\u0000%&\u0005e\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'+\u0007\u0000\u0000\u0000(*\u0007\u0001\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,\b\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000.0\u0007\u0002\u0000\u0000/.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\n\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\f\u0001\u0000"+
		"\u0000\u000056\u0005;\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005"+
		"(\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\u0012"+
		"\u0001\u0000\u0000\u0000;<\u0005{\u0000\u0000<\u0014\u0001\u0000\u0000"+
		"\u0000=>\u0005}\u0000\u0000>\u0016\u0001\u0000\u0000\u0000?A\u0007\u0003"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0006\u000b\u0000\u0000E\u0018\u0001\u0000\u0000\u0000FG\t\u0000\u0000"+
		"\u0000GH\u0006\f\u0001\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\f\u0000"+
		"\u0000J\u001a\u0001\u0000\u0000\u0000\u0004\u0000+1B\u0002\u0006\u0000"+
		"\u0000\u0001\f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}