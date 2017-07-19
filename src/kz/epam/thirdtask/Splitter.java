package kz.epam.thirdtask;

/**
 * Created by Voodoo3000 on 08.07.2017.
 */
public class Splitter {

    private static final String PARAGRAPH_SPLITTER = "(?=(\\n|\\r))";
    private static final String SENTENCE_SPLITTER = "(?<=(\\.|!|\\?))";
    private static final String WORD_SPLITTER = "(?<=(\\s|,|!|\\?|\\.|;|:|'|\")\\s*)";
    private static final String SYMBOL_SPLITTER = "\\r|\\n|.{1}";

    public static String[] splitToParagraphs(String txt) {

        return txt.split(PARAGRAPH_SPLITTER);
    }

    public static String[] splitToSentences(String stringOfParagraph) {

        return stringOfParagraph.split(SENTENCE_SPLITTER);
    }

    public static String[] splitToWords(String stringOfSentences) {

        return stringOfSentences.split(WORD_SPLITTER);
    }

    public static char splitToSymbols(String word) {
        return  word.charAt(0);
    }



}
