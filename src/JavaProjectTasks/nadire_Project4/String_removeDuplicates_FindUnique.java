package JavaProjectTasks.nadire_Project4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_removeDuplicates_FindUnique {

    public static void main(String[] args) {

        System.out.println("findUniqueChar(\"bbccdddfffniikkaaz\") = " + findUniqueChar("bbccdddfffniikkaaz"));
    }








    public static String findUniqueChar(String str){

        String array[]=str.split("");//str.split returns array
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList(array));// return arrayList

        String unique="";
        for(String each : list){
            int frequency= Collections.frequency(list,each);
            if(frequency==1){
                unique+=each;
            }
        }



        return unique;


    }





}
