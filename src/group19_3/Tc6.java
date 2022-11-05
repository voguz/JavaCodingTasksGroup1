package group19_3;

public class Tc6 {
    public static void main(String[] args) {
        System.out.println( primeNum(11));
        prime(30);
    }

    //Numbers -- Prime Number
    //Write a method that can check if a number is prime or not.
    public  static String primeNum(int num) {
        if(num<=0){
            System.out.println("the number not valid");
        }
        if(num>0){
            for (int i = 2; i <num ; i++) {


            if (num % i == 0) {
                return " not prime";
            } else
                return " prime";

        }
        }
        return "null";
    }


 public static void prime(int n){
        if(n<=0){
            System.out.println("the number is not valid");
        }else
     for (int i = 0; i <=n ; i++) {

         for (int j = 2; j <i ; j++) {

           if(i%j==0){
               System.out.println(i+": not prime");
               break;
           }else{
               System.out.println(i+": prime");
               break;
           }
         }

     }
 }



}
