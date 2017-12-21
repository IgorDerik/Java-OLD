package Lec1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Derik on 20-Dec-17.
 */
public class Numbers {

    public static void sortNums(int[] nums) { //sorting array using bubble sort

        boolean swapped = true;
        int z = 0;
        while (swapped){
            swapped = false;
            for (int i = 0; i < nums.length - 1 - z; i++) {
                if (nums[i] > nums[i + 1]) {
                    int a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                    swapped = true;
                }
            }
            z++;
        }

    }

    public static void printNumsAscenOrderDigs(int[] givenArr) { //print numbers have ascending order digits only

        for (int i : givenArr) {

            int iCopy = i;

            boolean isAscenOrder = true;

            int lastDig = i % 10;
            i = i / 10;

            while (i!=0) {
                int currLast = i % 10;

                if (lastDig<=currLast) {
                    isAscenOrder = false;
                    break;
                }

                lastDig = currLast;
                i = i / 10;
            }

            if (isAscenOrder) System.out.println(iCopy);
        }

    }

    public static void printNumsPrimeDigs(int[] givenArr) { //print numbers have prime digits

        for (int i : givenArr) {

            int iCopy = i;

            while (i!=0) {
                int currLast = i % 10;
                i = i / 10;

                if (currLast==2 || currLast==3 || currLast==5 || currLast==7) { //as every our digit is less than 10

                    System.out.println(iCopy);
                    break;
                }
            }

        }

    }

    public static void printNumsDivByPrevNum(int[] givenArr) { //print numbers can be divided by the previous number

        for (int i = 1; i < givenArr.length; i++) {
            if((givenArr[i] % givenArr[i-1]) == 0) {
                System.out.println(givenArr[i]);
            }
        }
    }

    public static void main(String...arg) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("You should enter numbers with 5 or more digits.");
        System.out.print("How many numbers do you want to enter? ");

        int[] nums = null;

        try {
            int quantity = Integer.parseInt(reader.readLine());
            nums = new int[quantity];

            for (int i = 0; i < nums.length; i++) {
                Integer number = Integer.parseInt(reader.readLine());
                if (number.toString().length() > 4) {
                    nums[i] = number;
                } else {
                    System.out.println("This number contains less than 5 digits, try again.");
                    i--;
                }
            }

        }
        catch (Throwable t) {
            System.out.println("Something bad happened:( Please restart the program.");
            System.exit(1);
        }

        System.out.println("Ok, sorting...");
        sortNums(nums);
        System.out.println("Here are what you have entered:");
        for (int i : nums) System.out.println(i);
        System.out.println();

        System.out.println("Try to print numbers have ascending order digits only...");
        printNumsAscenOrderDigs(nums);
        System.out.println();

        System.out.println("Try to print numbers have prime digits...");
        printNumsPrimeDigs(nums);
        System.out.println();

        System.out.println("Try to print numbers can be divided by the previous number...");
        printNumsDivByPrevNum(nums);
    }

}
