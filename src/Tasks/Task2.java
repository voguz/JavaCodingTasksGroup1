package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Write a method that can divide two numbers without using division operator
         */
        System.out.println(divide(3,1));
    }

    public static int divide(int a, int b){

        if(b==0) {
            System.out.println("Can not be divided by zero");
            System.exit(0);


        }

        int count = 0;

        while(a >= b){
            a = a - b;

            count++;
        }
        return count;



    }
}
