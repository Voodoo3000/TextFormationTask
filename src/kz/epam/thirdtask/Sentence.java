package kz.epam.thirdtask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voodoo3000 on 13.07.2017.
 */
public class Sentence {

    private List<String> listOfSentences = new ArrayList<>();

    public Sentence(List<String> sentences){
            this.listOfSentences=sentences;
    }

    public List<String> getListOfSentences() {
        return listOfSentences;
    }

}
