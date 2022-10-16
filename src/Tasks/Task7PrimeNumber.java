package Tasks;

import java.util.Scanner;

public class Task7PrimeNumber {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
    int number= input.nextInt();
        if(isPrime(number)) {
        System.out.println(number + " is prime number");
    }
        else{
        System.out.println(number + " is a non-prime number");
    }
}
    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i = 2; i<= num/2; i++)
        {
            if(num%i==0)
                return  false;
        }
        return true;
    }


}

