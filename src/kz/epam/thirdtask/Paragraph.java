package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 13.07.2017.
 */
public class Paragraph {

    private List<Sentence> sentences = new ArrayList<>();

    public Paragraph(String stringOfParagraph){
        for (String stringOfSentences: Splitter.splitToSentences(stringOfParagraph)) {
            Sentence sentence = new Sentence(stringOfSentences);
            sentences.add(sentence);
        }
    }

    public List<Sentence> getListOfSentences() {
        return sentences;
    }
/*
    @Override
    public String toString() {
        String string = "";
        for (Sentence s: listOfSentences) {
            string += s;
        }
        return string;
    }*/
}
