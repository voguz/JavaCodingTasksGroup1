package group19_1;

public class Task1 {
    public static void main(String[] args) {



        System.out.println(div(24, 0));

    }



    public static int div(int num, int num2) {
        int count = 1;
        if (num2 == 0) {
            System.out.println("cann't div zero");
            return 0;
        }else if (num == num2) {
            return 1;
        } else if (num <= num2) {
            return 0;
        } else {
            while (num > num2) {


                num -= num2;
                count++;
            }

            return count;
        }

        //
    }
}












