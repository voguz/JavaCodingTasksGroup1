package group19_4;

public class Tc3_FrequncyOfChar {


        /*
         String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

    public static String frequency(String str) {
        int count;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
           if (!result.contains(str.charAt(i)+"")) {
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(frequency("AAABBCDDDD"));
    }
}