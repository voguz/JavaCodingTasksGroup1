package JavaProjectTasks.nadire_Project5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "liya", "Ahmed", "Mara", "Ahmed", "Volkan"));
        System.out.println("Before remove: " + list);
        list.removeIf(p -> p.equals("Ahmed"));
        System.out.println("After remove: " + list);


    }
}
/*
Given a list of people's names: "Ahmed," "John," Eric," "Ahmed,".....
Write a java operation to remove all the names named Ahmed.
 */