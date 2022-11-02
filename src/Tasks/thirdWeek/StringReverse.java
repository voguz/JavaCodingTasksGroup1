package Tasks.thirdWeek;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverse("volkanoguz"));
    }
    public static String reverse(String rev) {

        String reverseWord = "";

        for (int i = rev.length() - 1; i >= 0; i--) {
            reverseWord += rev.charAt(i);
        }
        return reverseWord;
    }


}
