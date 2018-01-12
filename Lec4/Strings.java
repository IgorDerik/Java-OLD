package Lec4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Strings {

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

    private static void readPrintText(boolean printRight, int spaces) {
        readPrintText(false, printRight, spaces);
    }

    private static void readPrintText(boolean printNoDupText, boolean printRight, int spaces) {

        System.out.println("Write/Paste a text and print q letter to end a program!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("q")) break;

            if(printNoDupText && !printRight) {
                System.out.println(getNoDupLettersLine(input));
            }
            else if(printRight && !printNoDupText) {
                System.out.println(getRightLine(input,spaces));
            }
            else if (printNoDupText) {
                String toBePrinted = getRightLine(getNoDupLettersLine(input), spaces);
                System.out.println(toBePrinted);
            }
            else {
                System.out.println(input);
            }
        }
    }

    private static String getRightLine (String string, int numberOfSpaces) {

        StringBuilder spaces = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(string);

        for(int i=0; i<numberOfSpaces; i++) {
            spaces.append(" ");
        }

        return spaces.append(stringBuilder).toString();
    }

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose an operation: \n" +
                "0 Just read and print a text; \n" +
                "1 Print the text without the duplicates letters; \n" +
                "2 Print and align the text to the right edge; \n" +
                "3 Print and align the text to the right edge without the duplicates letters \n");

        String choose = reader.readLine();

        int spaces = 0;
        if(choose.equals("2") || choose.equals("3")) {
            System.out.println("Enter number of spaces: ");
            spaces = Integer.parseInt(reader.readLine());
        }

        switch (choose) {
            case "0": readPrintText();
            break;
            case "1": readPrintText(true);
            break;
            case "2": readPrintText(true,spaces);
            break;
            case "3": readPrintText(true,true,spaces);
            break;
            default:
                System.out.println("Your choose is invalid.");
        }
    }

}

