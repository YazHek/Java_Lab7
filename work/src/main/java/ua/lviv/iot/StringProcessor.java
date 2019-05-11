package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    private String text;
    private int num;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }




    public StringProcessor() {

    }

    public StringProcessor(final String textObj, final int numObj) {

        this.text = textObj;
        this.num = numObj;
    }

    public final void readInputText() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in, StandardCharsets.UTF_8));
        System.out.print("Write your string: ");
        this.text = br.readLine();
        System.out.print("Write your number");
        this.num = Integer.parseInt(br.readLine());
    }

    public final String formattingText() {

        StringBuffer sBuffer = new StringBuffer();
        String[] sentences = text.split("\\s+");
        String regex = String.format("\\d{%d}(.docx|.doc|.txt|.odb)$", num);
        Pattern pattern = Pattern.compile(regex);

        for (String sentence : sentences) {

            Matcher matcher = pattern.matcher(sentence);
            if (matcher.find()) {

                sBuffer.append(sentence);
                sBuffer.append(" ");
            }
        }

        return sBuffer.toString().trim();
    }

    public final String showText(){

        if (text != " "){

            return this.text;
        } else {

            return "text empty";
        }


    }
}
