package group19_4;

public class Tc2_RemoveDuplicate {

        /*
         String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
         */

    public static String removeDup(String str) {

        String dup = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (!dup.contains(str.charAt(i) + "")) {
                dup += str.charAt(i);
            }
        }
        return dup;
    }
}









