package group19_3;

public class Tc8 {
    // Numbers -- Reverse negative number.
    //Write a return method that can reverse a negative number and return it as int.
    public static void main(String[] args) {
        System.out.println(reverseNum(-51));
    }
public static int reverseNum(int num){

    if(num<0){
        num=num*-1;//work with positive num
    }
  int reminder=0;
    int reverse=0;
    while (num>0){
      reminder  = num%10;// give us last digit
    reverse=reverse*10+reminder;

     num=num/10;//remove the last digit
    }

    //make num neg again
    return reverse*-1;
}










}
