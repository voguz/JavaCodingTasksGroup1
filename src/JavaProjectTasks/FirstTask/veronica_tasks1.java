package JavaProjectTasks.FirstTask;

import java.util.Scanner;

public class veronica_tasks1 {
    public static void main(String[] args) {
        EvenOdd(6);
        /* Write a method which can identifies given number is even or odd
        identify(5) --> "Odd"
        identify(2) --> "Even"
         */
    }

            public static void EvenOdd(int num) {

                    if (num % 2 == 0) {
                        System.out.println(num + " is even");
                    } else if (num % 2 == 1) { // !=0
                        System.out.println(num + " is odd");
                    }
                }
}
