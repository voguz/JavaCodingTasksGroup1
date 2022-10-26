package JavaProjectTasks.nadire_Project3;

import java.util.Scanner;

public class ReverseNegativeNumbers {
    private static int reverseNegativeNum(int num){
        if(num<0){
            num=num*-1;
        }
        String str=String.valueOf(num);
        String[]numArray=str.split("");
        String reverse="";
        int reverseNew=0;
        for(int i=numArray.length-1;i>=0;i--){
            reverse+=numArray[i];
            reverseNew=Integer.parseInt(reverse);
        }


        return reverseNew*-1;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-84659));
    }









}
/*
Write a return method that can reverse a negative number and return it as int.

 */