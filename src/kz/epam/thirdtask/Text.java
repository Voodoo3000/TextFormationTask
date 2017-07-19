package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 13.07.2017.
 */
public class Text {
    private List<Paragraph> paragraphs = new ArrayList<>();

    public Text(String initializedText) {
        String[] txt = Splitter.splitToParagraphs(initializedText);
        for (String stringOfParagraph : txt) {
            Paragraph paragraph = new Paragraph(stringOfParagraph);
            paragraphs.add(paragraph);
        }
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public String toString() {
        String string = "";
        for (Paragraph p : paragraphs) {
            string += p;
        }
        return string;
    }

}
