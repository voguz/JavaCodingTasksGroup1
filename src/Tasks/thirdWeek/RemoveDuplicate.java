package Tasks.thirdWeek;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicate("football"));
    }

    public static String RemoveDuplicate(String string){

        String Word = "";

        for (int i =0 ; i < string.length() ; i++){
            if(!Word.contains("" + string.charAt(i))){
                Word += "" + string.charAt(i);
            }
        }
        return Word;
    }
}
