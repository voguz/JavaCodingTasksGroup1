package Tasks;

import java.util.Scanner;

public class Task4Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Before swapping number " + "x: " + x + " y: " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping number " + "x: " + x + " y: " + y);


    }
}
