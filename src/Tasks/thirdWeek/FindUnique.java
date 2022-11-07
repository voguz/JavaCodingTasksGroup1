package Tasks.thirdWeek;

public class FindUnique {
    public static void main(String[] args) {
        Unique("volvoredcar");

    }
    public static String Unique(String string){


        for (int i = 0; i < string.length(); i++) {
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            // if the counter is 1 it means found only one letter
            if (count == 1) {
                System.out.println(string.charAt(i));
            }
        }

        return string;
    }
}



