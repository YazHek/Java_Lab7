package ua.lviv.iot;

import java.io.IOException;

public class Main {


    public static void main(String... args) throws IOException {

        StringProcessor stringProcessor = new StringProcessor();
        stringProcessor.readInputText();
        String test = stringProcessor.formattingText();
        System.out.print(test);

    }
}
