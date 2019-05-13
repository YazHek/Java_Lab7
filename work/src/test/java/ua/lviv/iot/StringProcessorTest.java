package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private String realText, expectedText;
    private StringProcessor sProcessor;


    @Test
    void formattingText() {

        realText = "dfskjfdhsjfk123.doc fwfdwfwf wdfwfefew fewewf.txt";
        expectedText = "dfskjfdhsjfk123.doc";

        sProcessor = new StringProcessor(realText, 3);
        String newText = sProcessor.formattingText();

        assertEquals(expectedText, newText);

    }
}