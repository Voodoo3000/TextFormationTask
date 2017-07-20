package kz.epam.thirdtask;

/**
 * Created by Voodoo3000 on 18.07.2017.
 */
public class Symbol {

    private char symbol;

    public Symbol(char charOfSymbol) {
        symbol = charOfSymbol;
    }

    @Override
    public String toString() {
        return symbol + "";
    }
}
