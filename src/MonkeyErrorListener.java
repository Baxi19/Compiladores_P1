import org.antlr.v4.runtime.*;
import generated.*;

import java.util.ArrayList;

public class MonkeyErrorListener extends BaseErrorListener {
    public ArrayList<String> errorMsgs = new ArrayList<String>();

    public MonkeyErrorListener( )
    {
        this.errorMsgs = new ArrayList<String>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException re) {
        if (recognizer instanceof MonkeyScanner){
            errorMsgs.add(new String("SCANNER ERROR -> ("+line+", "+charPositionInLine + ") " + msg));
        }else{
            errorMsgs.add(new String("ERROR -> ("+line+", "+charPositionInLine + ") " + msg));
        }
    }

    public boolean hasErrors (){
        return this.errorMsgs.size() > 0;
    }

    @Override
    public String toString (){
        if (!hasErrors()) {
            return "0 ERRORS";
        }
        StringBuilder builder = new StringBuilder();
        for ( String s : errorMsgs ){
            builder.append(String.format( "%s\n", s ));
        }
        return builder.toString();
    }
}