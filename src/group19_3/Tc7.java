package group19_3;

public class Tc7 {
    public static void main(String[] args) {

        System.out.println(isArmStrong(153));
    }

    //  Numbers -- Armstrong numbers
    //Write a method that can check if a number is an Armstrong number.
    public static boolean isArmStrong(int num) {
int last=num%10;//give us last digit
int n=num/10;
int second=n%10;
int third=num/100;

int result= (int) (Math.pow(last,3)+Math.pow(second,3)+Math.pow(third,3));

 if(result==num)
  return true;
   else
return false;
    }
    }