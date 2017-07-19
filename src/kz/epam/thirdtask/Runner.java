package kz.epam.thirdtask;


public class Runner {

    public static void main(String[] args) {

        String initializedText = new InboundStream().txtReader();

        //String[] paragraphs = splitter.splitToParagraphs(text);

        Text text = new Text(initializedText);

       // Paragraph sentence = new Paragraph(splitter.splitToSentences(paragraph.getParagraphs()));
       /* List<String> allSentences = new ArrayList<>();
        for (String paragraph : paragraphs) {
            String[] sentences = splitter.splitToSentences(paragraph);
            allSentences.addAll(Arrays.asList(sentences));
        }

        List<String> allWords = new ArrayList<>();
        for (String sentence : allSentences) {
            String[] words = splitter.splitToWords(sentence);
            allWords.addAll(Arrays.asList(words));
        }

        char allSymbols;
        for (String word : allWords) {
            char symbol = splitter.splitToSymbols(word);
            allSymbols.addAll(Arrays.asList(symbol));
        }

        StringBuilder builder = new StringBuilder();
        for (String textresult : text.toString()) {
            builder.append(textresult);
        }
*/
        new OutboundStream().txtWriter(text.toString());
    }
}