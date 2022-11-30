package JavaProjectTasks.nadire_Project5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveValues {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(50,95,105,120,55,120,75,309));
        list.removeIf(p->p>100);
        System.out.println(list);




    }
}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
Remove all values greater than 100.
 */