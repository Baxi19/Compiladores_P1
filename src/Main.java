import generated.MonkeyParser;
import generated.MonkeyScanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MonkeyParser parser = null;
        MonkeyScanner scanner = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        ParseTree tree;
        try {
            input = CharStreams.fromFileName("test.txt");
            scanner = new generated.MonkeyScanner(input);
            tokens = new CommonTokenStream(scanner);
            parser = new MonkeyParser(tokens);

            MonkeyErrorListener errorListener = new MonkeyErrorListener();
            scanner.removeErrorListeners();
            parser.removeErrorListeners();
            scanner.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);
            tree = parser.program();

            if(errorListener.hasErrors()){
                System.out.println("Compilation: Failed");
                System.out.println(errorListener.toString());
            }
            else{
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
                System.out.println("Compilation: Successful");
            }
        }catch(Exception e){
            System.out.println("The file doesn't exist!");e.printStackTrace();
        }
    }
}


