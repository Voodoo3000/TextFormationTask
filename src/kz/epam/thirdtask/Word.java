package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 18.07.2017.
 */
public class Word {

    private List<Symbol> symbols = new ArrayList<>();

    public Word(String stringOfWord) {
        for (char charOfSymbol : stringOfWord.toCharArray()) {
            Symbol symbol = new Symbol(charOfSymbol);
            symbols.add(symbol);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Symbol s : symbols) {
            builder.append(s);
        }
        return builder.toString();
    }
}
