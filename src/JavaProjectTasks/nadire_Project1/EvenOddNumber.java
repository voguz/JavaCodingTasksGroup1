package JavaProjectTasks.nadire_Project1;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println(EvenNum(10));
    }

    public static String EvenNum(int num){
        if(num%2 == 0){
            return num+" Even Number";

        }
        return num+" Odd Number";




    }
}
