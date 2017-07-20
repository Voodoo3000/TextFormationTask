package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 13.07.2017.
 */
public class Paragraph {

    private List<Sentence> sentences = new ArrayList<>();

    public Paragraph(String stringOfParagraph) {
        for (String stringOfSentences : Splitter.splitToSentences(stringOfParagraph)) {
            Sentence sentence = new Sentence(stringOfSentences);
            sentences.add(sentence);
        }
    }

    @Override
    public String toString() {
        String string = "";
        StringBuilder builder = new StringBuilder();
        for (Sentence s : sentences) {
            builder.append(s);
        }
        return builder.toString();
    }
}
