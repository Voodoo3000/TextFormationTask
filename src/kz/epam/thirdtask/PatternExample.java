package kz.epam.thirdtask;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternExample {

    private static final String INPUT_FILE = "text.txt";
    private static final String OUTPUT_FILE = "text1.txt";

    public static void main(String[] args) {
        String s = new InboundStream().txtReader(INPUT_FILE);
        new OutboundStream().txtWriter(s, OUTPUT_FILE);
    }
}