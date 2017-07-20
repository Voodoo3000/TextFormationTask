package kz.epam.thirdtask;

public class Runner {

    public static void main(String[] args) {

        String initializedText = new InboundStream().txtReader();

        Text text = new Text(initializedText);

        new OutboundStream().txtWriter(text.toString());
    }
}