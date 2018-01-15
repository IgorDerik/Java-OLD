package Lec4;

import java.util.Scanner;

/*
Program gives you an interactive choose what to do, just run main method and fun)
 */

public class Strings {

    private static String readText() {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Write/Paste a text (and press ENTER), after that print q (and press ENTER again) to end a program!");

        Scanner scanner = new Scanner(System.in);

        String input;

        while (true) {
            input = scanner.nextLine();

            if(input.equals("q")) break;

            stringBuilder.append(input);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    private static String addSpaces(String string, int lineLen) {

        int stringLen = string.length();

        StringBuilder spaceBuilder = new StringBuilder();

        if (stringLen < lineLen) {
            for (int i = 0; i < (lineLen - stringLen); i++) {
                spaceBuilder.append(" ");
            }
        }

        return spaceBuilder.append(string).toString();
    }

    private static String[] alignToRightEdge(String string, int lineLen) {

        StringBuilder builder = new StringBuilder(string);

        int newLineIndex = lineLen;

        while ( (string.length()-newLineIndex) > 0 ) {

            if (builder.substring(newLineIndex-lineLen,newLineIndex).contains(" ")) {
                while (builder.charAt(newLineIndex) != ' ') {
                    newLineIndex--;
                }
            }

            builder.replace(newLineIndex,newLineIndex+1,"\n");

            newLineIndex = newLineIndex+lineLen;

//            System.out.println(string.length()-newLineIndex);
        }

        String[] strings = builder.toString().split("\n");

        for(int i=0; i<strings.length; i++) {
            strings[i] = addSpaces(strings[i],lineLen);
        }

        return strings;
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

    public static void main(String[] args) {

        System.out.println("Choose an operation: \n" +
                "0 Just read and print a text; \n" +
                "1 Print the text without the duplicates letters; \n" +
                "2 Print and align the text to the right edge; \n" +
                "3 Print and align the text to the right edge without the duplicates letters \n");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        int lineLen = 0;
        if(choose==2 || choose==3) {
            System.out.println("Please enter a number of characters in line: ");
            lineLen = scanner.nextInt();
        }

        switch (choose) {
            case 0:
                System.out.println(readText());
                break;
            case 1:
                System.out.println(getNoDupLettersLine(readText()));
                break;
            case 2:
                String[] strings = alignToRightEdge(readText(),lineLen);
                for (String string : strings) {
                    System.out.println(string);
                }
                break;
            case 3:
                String[] noDupLetterStrings = alignToRightEdge(getNoDupLettersLine(readText()),lineLen);
                for (String string : noDupLetterStrings) {
                    System.out.println(string);
                }
                break;
            default:
                System.out.println("Your choose is invalid.");
        }
    }

}
