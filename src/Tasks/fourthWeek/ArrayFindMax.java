package Tasks.fourthWeek;

public class ArrayFindMax {
    /*
      *Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static int maxNumber(int [] num){

        int max = Integer.MIN_VALUE;
        for (int each : num) {
            if(each > max){
                max = each;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        int [] number ={5,8,7,99,63};
        System.out.println("maxNumber(number) = " + maxNumber(number));
    }

}
