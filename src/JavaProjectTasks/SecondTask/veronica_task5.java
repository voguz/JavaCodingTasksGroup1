package JavaProjectTasks.SecondTask;

import java.util.ArrayList;

public class veronica_task5 {
    public static void Divisible(){

        ArrayList<Integer> resultBy15=new ArrayList<Integer>();
        ArrayList<Integer> resultBy5=new ArrayList<Integer>();
        ArrayList<Integer> resultBy3=new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {


            if (i % 15 == 0 ) {

                resultBy15.add(i);
            }  if (i % 5 == 0) {

                resultBy5.add(i);
            }  if (i % 3 == 0) {

                resultBy3.add(i);
            }
        }

        System.out.println("Divisible By 15: " + resultBy15 + ", ");
        System.out.println("Divisible By 5: " + resultBy5 + ", ");
        System.out.println("Divisible By 3: " + resultBy3 + ", ");
    }
    public static void main(String[] args) {
        Divisible();
    }
}
