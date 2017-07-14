package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 08.07.2017.
 */
public class Splitter {

    private static final String PARAGRAPH_SPLITTER = "(?=(\\n|\\r))";
    private static final String SENTENCE_SPLITTER = "(?<=(\\.|!|\\?))";
    private static final String WORD_SPLITTER = "(?<=(\\s|,|!|\\?|\\.|;|:|'|\")\\s*)";
    private static final String SYMBOL_SPLITTER = "\\r|\\n|.{1}";

    public Splitter() {
    }

    public String[] splitToParagraphs(String text) {
        return text.split(PARAGRAPH_SPLITTER);
    }

    public List<String> splitToSentences(List<String> paragraphs) {
        List<String> sentences = new ArrayList<>();
        for (String paragraph : paragraphs){
            paragraph.split(SENTENCE_SPLITTER);
            sentences.add(paragraph);
        }
        return sentences;
    }

    public String[] splitToWords(String sentence) {
        return sentence.split(WORD_SPLITTER);
    }

    public String[] splitToSymbols(String word) {
        return  word.split(SYMBOL_SPLITTER);
    }



}
