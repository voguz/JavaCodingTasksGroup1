package JavaProjectTasks.nadire_Project3;
// prime number is whole number greater than 1 and that has only1 and number itself,
// two factors elf
//divisible by 1 and itSelf
public class PrimeNumbers {
    public static void main(String[] args) {


      primeNumbers(1);


    }




 public static void primeNumbers (int num){
        if(num<1){
            System.out.println("invalid ");
        }
        int count=0;
   for(int i=1;i<=num;i++){
       if(num%i==0){
           count++;
       }
   }
   if(count==2){
       System.out.println(num+ " Prime Number");
   }else{
       System.out.println(num+ " Not Prime Number");
   }

 }








}
/*
Write a method that can check if a number is prime or not.
 */