package group19_1;

public class OddEven {

    public static String oddEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else if (num % 2 == 1) {


            System.out.println("this num is odd:" + num);
            return "Odd";
        } else if (num == 0) {


            return "zero";
        } else
            return "negative";

    }
}