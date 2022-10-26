package JavaProjectTasks.nadire_Project3;
//
public class ArmStrongNumbers {

  /*
    1*1*1=1
    5*5*5=125
    3*3*3=27
    125+27+1=153
     */


    public static boolean isArmstrong(int num) {
        // logic is to split num into separate digits  567 -- 5 6 7 so I could work with each number
        int sum = 0;
        String str = Integer.toString(num);// converting int into String


        //looping through the String and converting each char into int
        // Math.pow function multiplies each int by the str.length(): a*a*a ( 3 times because str.length=3) and adds to the sum
        // iterates through each number and ads to the sum

        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += Math.pow(a, str.length());
        }

        return sum == num;

    }

    public static void main(String[] args) {

        int a = 222;
        int b = 370; // Armstrong number
        int c = 371; // Armstrong number
        int d = 1634; //Armstrong number
        int e = 250;

        System.out.println("a = " + isArmstrong(a));
        System.out.println("b = " + isArmstrong(b));
        System.out.println("c = " + isArmstrong(c));
        System.out.println("d = " + isArmstrong(d));
        System.out.println("e = " + isArmstrong(e));

    }





}
/*
Write a method that can check if a number is an Armstrong number.
 */