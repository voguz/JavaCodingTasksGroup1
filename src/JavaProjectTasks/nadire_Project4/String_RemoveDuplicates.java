package JavaProjectTasks.nadire_Project4;

public class String_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"aaaabbbccddeefffgghh\") = " + removeDuplicates("aaaabbbccddeefffgghh"));
    }




  public static String removeDuplicates(String str){
      String result="";
      for (int i=0;i<str.length();i++){
          char each=str.charAt(i);
          if(!result.contains("" + each)){
             result += each ;
          }
      }
      return result;





  }











}
