package Tasks.thirdWeek;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Frequency("volvolkankaoguz");

    }
        public static String Frequency(String string){
            String checked = "";

        for (int i = 0; i < string.length(); i++) { // outer: iterating one character at a time --> charAt(i)

            int count = 0; // the counter should reset back to 0 for every character
            if (!checked.contains("" + string.charAt(i))) { // only run the counting and inner loop if the character has not already been checked
                for (int j = 0; j < string.length(); j++) { // inner: compare the character we are looking at( i ) with each other character in the String --> string.charAt(j)
                    if (string.charAt(i) == string.charAt(j)) {
                        count++;
                    }
                } // inner loop ends
                System.out.println(string.charAt(i) + " - " + count);
                checked += string.charAt(i); // adds to the checked String
            } // if statement ends
        } // outer loop ends


            return string;
        }

}