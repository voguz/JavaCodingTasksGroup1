package group19_4;

public class Tc4_uniqe {
  /*
  Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

   */

    public static String uniqemeth(String str) {
        String uniq = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
          //  if(!uniq.contains(str.charAt(i)+"")){
            for (int j = 0; j < str.length(); j++) {


                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
          //  }
            }
                if (count == 1)
                    uniq += str.charAt(i);
            }


        return uniq;

    }


    public static void main(String[] args) {

        System.out.println(uniqemeth("AAABBBCCCDEF"));
    }
}