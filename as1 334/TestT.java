import org.antlr.runtime.*;

public class TestT {
    public static void main(String[] args) throws Exception {

        // Create an TLexer that feeds from that stream
        //TLexer lexer = new TLexer(new ANTLRInputStream(System.in));
        T_semanticsLexer lexer = new T_semanticsLexer(new ANTLRFileStream("input.txt"));

        // Create a stream of tokens fed by the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the token stream
        T_semanticsParser parser = new T_semanticsParser(tokens);

        // Begin parsing at rule prog
        parser.prog();
    }
}
