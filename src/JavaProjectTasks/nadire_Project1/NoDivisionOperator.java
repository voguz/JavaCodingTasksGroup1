package JavaProjectTasks.nadire_Project1;

public class NoDivisionOperator {
    public static void main(String[] args) {
        System.out.println(divide(100,2));
    }

    public static int divide(int a, int b){
        if (b==0){
            System.exit(0);
        }
        int result=0;
        while(a>=b){
            a=a-b;

            result++;
        }
        return result;




    }
}
/*
devide two numbers without using devision operator
 */
