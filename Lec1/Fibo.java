package Lec1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Derik on 20-Dec-17.
 */
public class Fibo {

    /*
    Let's use a BigInteger class, so we would not have any limits for quantity of numbers can be printed correctly.
     */

    public static BigInteger[] fibo(int quantity) { //this method return an array of numbers, require quantity

        BigInteger[] result = new BigInteger[quantity]; //create array with future values

        if (quantity < 3) { //if we need less than 3 numbers, that numbers would be always equal to 1
            for (int i=0; i<quantity; i++) {
                result[i] = BigInteger.valueOf(1);
            }
        }

        else {

            /*
            First 2 numbers = 1 as needed
             */

            result[0] = BigInteger.valueOf(1);
            result[1] = BigInteger.valueOf(1);


            for (int i = 2; i < quantity; i++) {
                result[i] = result[i - 1].add(result[i - 2]); //every next number = sum of the 2 previous
            }

        }

        return result; //return a result array
    }

    public static void main(String...arg) {

        /*
        Let's make our program interactive with user
         */

        System.out.println("How much Fibonacci numbers do you want to print? "); //asking user

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //reading user's answer

        try {

            int fiboQuantityToPrint = Integer.parseInt(reader.readLine()); //parsing answer to integer

            BigInteger[] fiboNums = fibo(fiboQuantityToPrint); //using our method

            for (BigInteger number : fiboNums) System.out.println(number); //printing numbers using foreach

        } catch (Throwable throwable) {
            System.out.println("Something wrong happened:("); //print this if some error occurred
        }

    }

}
