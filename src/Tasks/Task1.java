package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

       /*
       Write a method which can identifies given number is even or odd
       identify(5) --> "Odd"
       identify(2) --> "Even"
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }


    }

}
