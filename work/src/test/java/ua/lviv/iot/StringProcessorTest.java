package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringProcessorTest {

    private String realText, expectedText;
    private StringProcessor sProcessor;


    @Test
    void formattingText() {

        realText = "dfskjfdhsjfk123.doc fwfdwfwf wdfwfefew fewewf.txt";

        sProcessor = new StringProcessor(realText, 3);
        expectedText = sProcessor.formattingText();
        sProcessor.formattingText();

        assertEquals(expectedText, expectedText);

    }
}