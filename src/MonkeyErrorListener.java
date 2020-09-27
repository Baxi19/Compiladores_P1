import org.antlr.v4.runtime.*;
import generated.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class MonkeyErrorListener extends BaseErrorListener {
    public static void main(String[] args){
        MonkeyGrammar scanner;
        MonkeyParser parser;
        CharStream input;
        CommonTokenStream tokens;
        ParseTree tree;
        try {
            input = CharStreams.fromFileName("test.txt");
            scanner = new MonkeyGrammar(input);
            tokens = new CommonTokenStream(scanner);
            parser = new MonkeyParser(tokens);
            MonkeyErrorListener errorListener = new MonkeyErrorListener();
            scanner.removeErrorListeners();
            parser.removeErrorListeners();
            scanner.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);
            tree = parser.program();



            /*
            ContextAnalisys checkerVisistor = new ContextAnalisys();
            checkerVisistor.visit(tree);
            if(errorListener.hasErrors() | checkerVisistor.hasErrors()){
                System.out.println("Compilation: Failed");
                System.out.println(errorListener.toString());
                checkerVisistor.printErrors();
            }
            else{
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
                checkerVisistor.printErrors();
                System.out.println("Compilation: Successful");
            }

             */
        }
        catch(Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}