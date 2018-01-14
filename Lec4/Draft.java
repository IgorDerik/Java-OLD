package Lec4;

/*
This code in process
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private static StringBuilder readText() {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Write/Paste a text (and press ENTER), after that print q (and press ENTER again) to end a program!");

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("q")) {
            input = scanner.nextLine();

            stringBuilder.append(input);
            stringBuilder.append("\n");
        }

        return stringBuilder.deleteCharAt(stringBuilder.length()-2);
    }

    private static StringBuilder getNoDupLettersLine (StringBuilder stringBuilder) {

//        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if ( stringBuilder.charAt(i) == stringBuilder.charAt(i + 1) ) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }

        return stringBuilder;
    }

    private static String getNoDupLettersLine (String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if ( stringBuilder.charAt(i) == stringBuilder.charAt(i + 1) ) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }

        return stringBuilder.toString();
    }

    private static void readPrintText() {
        readPrintText(false,false,0);
    }

    private static void readPrintText(boolean printNoDupText) {
        readPrintText(printNoDupText, false, 0);
    }

    private static void readPrintText(boolean printRight, int lineLen) {
        readPrintText(false, printRight, lineLen);
    }

    private static void readPrintText(boolean printNoDupText, boolean printRight, int lineLen) {

        System.out.println("Write/Paste a text and print q letter to end a program!");

        Scanner scanner = new Scanner(System.in);

//        boolean running = true;
//        String input = "";

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("q")) {
//                System.out.println(input);
                break;
            }

            if(printNoDupText && !printRight) {
                System.out.println(getNoDupLettersLine(input));
            }
            else if(printRight && !printNoDupText) {
                System.out.println(getRightLine(input,lineLen));
            }
            else if (printNoDupText) {
                String toBePrinted = getRightLine(getNoDupLettersLine(input), lineLen);
                System.out.println(toBePrinted);
            }
            else {
                System.out.println(input);
            }
        }
    }

    private static StringBuilder getRightLine (StringBuilder stringBuilder, int lineLength) {
/*
        int newLineIndex = 0;
        while (newLineIndex!=stringBuilder.lastIndexOf("\n")) {
            newLineIndex = stringBuilder.indexOf("\n",newLineIndex+1);
            System.out.println(newLineIndex);
        }
*/
        StringBuilder builder = new StringBuilder();
        String[] inputStrings = stringBuilder.toString().split("\n");

        for (String string : inputStrings) {

            if (string.length() < lineLength) {
                builder.append(string);
                builder.append("\n");
            }

            if (string.length() > lineLength) {
                StringBuilder newLineBuilder = new StringBuilder(string);
                newLineBuilder.insert(lineLength-1,"\n");
                builder.append(newLineBuilder);
                builder.append("\n");
            }

        }

        return builder;
        /*
        String[] inputStrings = stringBuilder.toString().split("\n");

//        String[] outputStrings = new String[inputStrings.length];

        for (int i=0; i<inputStrings.length; i++) {
            //outputStrings[i] = getRightLine(inputStrings[i],lineLength);
            inputStrings[i] = getRightLine(inputStrings[i],lineLength);
        }

  //      return outputStrings;
        return inputStrings;
        */
//        return null;
    }

    private static String getRightLine (String string, int lineLength) {

        StringBuilder stringBuilder = new StringBuilder(string);

        if (string.length() < lineLength) {

            StringBuilder spaces = new StringBuilder();

            for (int i = 0; i < (lineLength - string.length()); i++) {
                spaces.append(" ");
            }

            return spaces.append(stringBuilder).toString();
        }
        else if (string.length() > lineLength) {

            stringBuilder.insert(lineLength-1,"\n");
            stringBuilder.insert(string.length()-1,"\n");
/*
            for(int i = lineLength-1; i < (string.length() / lineLength); i=i+lineLength) {
                stringBuilder.insert(i,"\n");
            }
*/
            return stringBuilder.toString();
        }
        else {
            return string;
        }
    }

    public static void main(String[] args) throws IOException {

        StringBuilder text = readText();

        System.out.println(getRightLine(text,100));
        /*
        StringBuilder text = readText();

        String[] strings = getRightLine(text,100);

        for (String s : strings) {
            System.out.println(s);
        }
        */

//        System.out.println( getNoDupLettersLine( readText() ));
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose an operation: \n" +
                "0 Just read and print a text; \n" +
                "1 Print the text without the duplicates letters; \n" +
                "2 Print and align the text to the right edge; \n" +
                "3 Print and align the text to the right edge without the duplicates letters \n");

        String choose = reader.readLine();

        int lineLen = 0;
        if(choose.equals("2") || choose.equals("3")) {
            System.out.println("Please enter a number of characters in line: ");
            lineLen = Integer.parseInt(reader.readLine());
        }

        switch (choose) {
            case "0": readPrintText();
            break;
            case "1": readPrintText(true);
            break;
            case "2": readPrintText(true,lineLen);
            break;
            case "3": readPrintText(true,true,lineLen);
            break;
            default:
                System.out.println("Your choose is invalid.");
        }
        */
    }


}

