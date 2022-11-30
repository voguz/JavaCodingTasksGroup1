package JavaProjectTasks.nadire_Project4;

public class String_FindUnique {
    public static void main(String[] args) {
        System.out.println("findUnique(\"aaassscdffghhwkkkllpv\") = " + findUnique("aaassscdffghhwkkkllpv"));
    }



public static String findUnique(String str){
    String result="";
    for(int i=0;i<=str.length()-1;i++){
        char ch=str.charAt(i);
        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            result+=ch;
        }
    }

    return result;








}





}
