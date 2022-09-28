package Group19;

public class Task1 {
    public static void main(String[] args) {
        int nums = 5;
        int num2 = 6;
        System.out.println(OddEven.oddEven(5));
        System.out.println(div(25, 5));
       Finra .finra();
    }



    public static int div(int num, int num2) {
        int count = 1;
        if (num == num2) {
            return 1;
        } else if (num < num2) {
            return 0;
        } else {
            while (num > num2) {


                num -= num2;
                count++;
            }

            return count;
        }

    }
}












