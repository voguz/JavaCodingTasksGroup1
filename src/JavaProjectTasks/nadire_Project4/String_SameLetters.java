package JavaProjectTasks.nadire_Project4;

import java.util.Arrays;

public class String_SameLetters {
    public static void main(String[] args) {
        System.out.println("sameLetters(\"abc\",\"bca\") = " + sameLetters("abc", "bca"));
    }




    public static boolean sameLetters(String str1,String str2){
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }








}
