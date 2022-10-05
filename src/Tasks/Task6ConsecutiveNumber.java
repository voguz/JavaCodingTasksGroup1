package Tasks;

import java.util.Scanner;

public class Task6ConsecutiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter positive number: ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            if ((i % 2== 0 ) &&  (i % 3== 0) && (i % 5== 0) ) {
                System.out.println("CodilityTestCoders");

            } else if ((i % 2== 0) && (i % 3== 0)) {
                System.out.println("CodilityTest");
            } else if ((i % 3== 0) && (i % 5== 0)) {
                System.out.println("TestCoders");
            } else if ((i % 2== 0) && (i % 5== 0)) {
                System.out.println("CodilityCoders");

            } else if ((i % 3== 0 ) &&  (i % 2!= 0) && (i % 5!= 0)) {
                System.out.println("Test");
            } else if ((i % 2== 0) && (i % 3!= 0) && (i % 5!= 0)) {
                System.out.println("Codility");
            } else if ((i % 5== 0) && (i % 2!= 0) && (i % 3!= 0)) {
                System.out.println("Coders");
            }else{
                System.out.println(i);
            }

        }








    }
}
