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

    @Override
    public String toString() {
        String string = "";
        StringBuilder builder = new StringBuilder();
        for (Paragraph p : paragraphs) {
            builder.append(p);
        }
        return builder.toString();
    }

}
