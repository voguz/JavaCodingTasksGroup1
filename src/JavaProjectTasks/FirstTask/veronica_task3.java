package JavaProjectTasks.FirstTask;

public class veronica_task3 {
    public static void main(String[] args) {
     Divide(150, 5);

    }
    /*
       Write a method that can divide two numbers without using division operator
        */
    public static void Divide(int a, int b){

        int count = 0;
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println(count);
    }
}
