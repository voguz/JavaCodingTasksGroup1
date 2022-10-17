package JavaProjectTasks.SecondTask;

public class veronica_task4 {
public static void swap(){

        int x = 100, y = 30;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    x = x + y;  // a = 130
    y = x - y;  // b = 100
    x = x - y;  // a = 30

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


    public static void main(String[] args) {
        swap();
    }
}
