package JavaProjectTasks;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(EvenOddNum(0));
    }

    public static String EvenOddNum(int num) {
        if (num == 0) {
            return "Zero";
        }
        if (num % 2 == 0) {
            return "Even";
        }
         else if (num < 0) {
            return "negative";

        }
        return "Odd";
    }
}

