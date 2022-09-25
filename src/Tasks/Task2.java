package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Write a method that can divide two numbers without using division operator
         */
        int num1,num2,div,result=0;
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the value to num1: ");
        num1= input.nextInt();

        System.out.print("Enter the value to num2: ");
        num2= input.nextInt();

        div=num1+num2;
        while(div>num2){
            div=div-num2;
            result++;

        }
        System.out.println("Division of " +num1+ " and " +num2+ ":" +result);

    }
}
