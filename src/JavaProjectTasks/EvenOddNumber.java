package JavaProjectTasks;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println(EvenNum(5));
    }

    public static String EvenNum(int num){
        if(num%2 == 0){
            return "Even Number";
        }
        return "Odd Number";




    }
}
