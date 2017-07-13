package kz.epam.thirdtask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Splitter splitter = new Splitter();

        String text = new InboundStream().txtReader();

        String[] paragraphs = splitter.splitToParagraphs(text);

        List<String> allSentences = new ArrayList<>();
        for (String paragraph : paragraphs) {
            String[] sentences = splitter.splitToSentences(paragraph);
            allSentences.addAll(Arrays.asList(sentences));
        }

        List<String> allWords = new ArrayList<>();
        for (String sentence : allSentences) {
            String[] words = splitter.splitToWords(sentence);
            allWords.addAll(Arrays.asList(words));
        }

        List<Character> allSymbols = new ArrayList<>();
        for (String word : allWords) {
            char symbol = splitter.splitToSymbols(word);
            allSymbols.addAll(Arrays.asList(symbol));
        }

        StringBuilder builder = new StringBuilder();
        for (String textresult : paragraphs) {
            builder.append(textresult);
        }

        new OutboundStream().txtWriter(builder.toString());
    }
}