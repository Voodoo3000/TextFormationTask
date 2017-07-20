package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 18.07.2017.
 */
public class Sentence {

    private List<Word> words = new ArrayList<>();

    public Sentence(String stringOfSentences) {
        for (String stringOfWord : Splitter.splitToWords(stringOfSentences)) {
            Word word = new Word(stringOfWord);
            words.add(word);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Word w : words) {
            builder.append(w);
        }
        return builder.toString();
    }
}
