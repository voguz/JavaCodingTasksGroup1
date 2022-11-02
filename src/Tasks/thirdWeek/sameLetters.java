package Tasks.thirdWeek;

import java.util.Arrays;

public class sameLetters {
    public static boolean sameLettersCheck(String str1, String  str2){
        char[] first = str1.toCharArray(); //changing String to array
        char[] second = str2.toCharArray();
        Arrays.sort(first); //sort the first array
        Arrays.sort(second); // sort second array
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        System.out.println(sameLettersCheck("abs", "sbc"));
    }

}

