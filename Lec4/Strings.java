package Lec4;

import java.util.Arrays;
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

            if(input.equals("q")) break; // breaking program if user entered a q letter

            stringBuilder.append(input);
            stringBuilder.append("\n");
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1); //delete last new line char

        return stringBuilder.toString();
    }

    private static String addSpaces(String string, int lineLen) { //adding spaces for future aligning to the right

        int stringLen = string.length();

        StringBuilder spaceBuilder = new StringBuilder();

        if (stringLen < lineLen) {
            for (int i = 0; i < (lineLen - stringLen); i++) {
                spaceBuilder.append(" ");
            }
        }

        return spaceBuilder.append(string).toString();
    }

    private static String[] alignToRightEdge(String string, int lineLen) { //aligning method

        StringBuilder builder = new StringBuilder(string);

        /*
        First we should cut a string based on line length given by user
         */

        int newLineIndex = lineLen;

        while ( (string.length()-newLineIndex) > 0 ) { //while we have lines to cut

            /*
            if we have a space before line should finish, it better to cut there, to avoid cutting words
             */
            if (builder.substring(newLineIndex-lineLen,newLineIndex).contains(" ")) {
                while (builder.charAt(newLineIndex) != ' ') { //looking for a space
                    newLineIndex--;
                }
            }

            builder.replace(newLineIndex,newLineIndex+1,"\n"); //replacing a space to a new line

            newLineIndex = newLineIndex+lineLen;

//            System.out.println(string.length()-newLineIndex);
        }

        String[] strings = builder.toString().split("\n"); //splitting our big line to an array

        for(int i=0; i<strings.length; i++) {
            strings[i] = addSpaces(strings[i],lineLen); //adding spaces to finish aligning
        }

        return strings;
    }

    private static String getNoDupLettersLine (String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if ( stringBuilder.charAt(i) == stringBuilder.charAt(i + 1) ) { //looking for same chars
                stringBuilder.deleteCharAt(i); //if found, delete
                i--; //backing to look for one more time and avoid 3 or more dup letters
            }
        }

        return stringBuilder.toString();
    }

    private static String getBWT(String string) { //Burrows–Wheeler transforming method
//        String string = "java";
        StringBuilder stringBuilder = new StringBuilder(string);

        char[] chars = string.toCharArray();

        String[] strings = new String[chars.length];

        int i=0;
        for (char c : chars) { //looping chars
            stringBuilder.append(c); //appending first char to the end
            stringBuilder.deleteCharAt(0); //delete first char
            strings[i] = stringBuilder.toString(); //saving result in string array
            i++;
        }

        Arrays.sort(strings); //sorting

        StringBuilder builderResult = new StringBuilder();

        for (String s : strings) {
            builderResult.append(s.charAt(s.length()-1)); //taking last chars of every string from strings array
        }

        return builderResult.toString();
    }

    public static void main(String[] args) {
        /*
        You can run a program to be sure everything is working...)
        Please use text tips to choose.
         */
        System.out.println("Print number and press ENTER to choose an operation: \n" +
                "0 Just read and print a text; \n" +
                "1 Print the text without the duplicates letters; \n" +
                "2 Print and align the text to the right edge; \n" +
                "3 Print and align the text to the right edge without the duplicates letters; \n" +
                "4 Print Burrows–Wheeler transformed line using your text \n");

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
            case 4:
                System.out.println(getBWT(readText()));
                break;
            default:
                System.out.println("Your choose is invalid.");
        }

    }

}
