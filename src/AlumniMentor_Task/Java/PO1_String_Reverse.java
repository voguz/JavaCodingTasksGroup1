package AlumniMentor_Task.Java;

public class PO1_String_Reverse {
    public static void main(String[] args) {
        reverseIt("hello");
    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
}

