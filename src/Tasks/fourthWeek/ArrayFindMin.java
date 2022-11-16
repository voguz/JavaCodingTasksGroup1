package Tasks.fourthWeek;

public class ArrayFindMin {
    /*
     *Array -- Find Minimum
Write a method that can find the maximum number from an int Array

     */
    public static int minNumber (int[] num){
        int min = Integer.MAX_VALUE;
        for (int each : num) {
            if(each < min){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] number = {21,55,63,44,63,1};
        System.out.println("minNumber(number) = " + minNumber(number));
    }
}
