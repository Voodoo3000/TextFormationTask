package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 13.07.2017.
 */
public class Paragraph {
    private List<String> paragraphs = new ArrayList<>();

    public Paragraph(String[] text) {
        for (String txt : text) {
            this.paragraphs.add(txt);
        }
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

}
