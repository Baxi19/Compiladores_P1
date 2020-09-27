import generated.MonkeyGrammar;
import generated.MonkeyParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MonkeyParser instParser = null;
        MonkeyGrammar inst = null;
        CharStream input=null;
        CommonTokenStream tokens = null;

        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new generated.MonkeyGrammar(input);
            tokens = new CommonTokenStream(inst);
            instParser = new MonkeyParser(tokens);
            instParser.program();
            System.out.println("Compilacion Terminada");
        }catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

        List<Token> lista = ( List<Token> ) inst.getAllTokens();

        for (Token t : lista)
            System.out.println(inst.ruleNames[t.getType()-1] + ":" + t.getText() + "\n");

        //inst = new MonkeyGrammar (input);
        //inst.reset();


    }
}


