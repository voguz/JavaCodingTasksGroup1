package Tasks.fourthWeek;

import java.util.Scanner;

public class SumOfDigits {
    /*
      * String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    private static int sumOfdigits(String number) {

        int sum = 0; // storing sum of digits
        char ch ; //  hold character
        int n; // hold numeric value of ch

        for(int i=0; i<number.length(); i++) {
            ch = number.charAt(i);// we are finding character
            if(Character.isDigit(ch)) { //checking character is digit or not
                n = Character. getNumericValue(ch); // getting numeric value
                sum += n; // then add it to sum variable
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        // declare variables
        String str = "";
        int summary = 0;

        Scanner scan =  new Scanner(System.in);

        // read inputs
        System.out.print("Give a number : ");
        str = scan.next();

        // find sum of digits in the String
        summary = sumOfdigits(str);

        System.out.println("The sum of digits in the string " +str+" = "+ summary);


    }
}

