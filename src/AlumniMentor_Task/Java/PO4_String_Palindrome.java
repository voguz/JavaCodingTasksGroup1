package AlumniMentor_Task.Java;

public class PO4_String_Palindrome {
    public static void main(String[] args) {
        palindrome("");
    }
    public static void palindrome(String s){

    String reverse = "";
// revverse my String, read it back from last index to first, backwards
        for(int i = s.length()-1; i>=0; i--){
        reverse+= s.charAt(i); // reverse = reverse + s.charAt(i)
    }
        System.out.println(reverse);
        if (s.equals(reverse)) {
        System.out.println("Palindrome");
    }else {
        System.out.println("Not Palindrome");
    }
        System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");
}
}
