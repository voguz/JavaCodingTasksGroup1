package group19_4;

import java.util.Arrays;



public class Tc1_SameLetter {
    public static void main(String[] args) {


        System.out.println(sameLetter("baf", "cba"));

    }

public static String sameLetter(String s,String z){

   String[]arr1=s.split("");
    String[]arr2=z.split("");
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    if(Arrays.equals(arr1,arr2)) {
        return "True";
    }else
            return "False";

}




}
