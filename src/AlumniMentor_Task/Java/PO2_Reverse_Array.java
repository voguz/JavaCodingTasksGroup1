package AlumniMentor_Task.Java;

import java.util.Arrays;

public class PO2_Reverse_Array {
    public static void main(String[] args) {
        reverseArray();
    }

        public static void reverseArray(){

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];

        for(int i = arr.length - 1, y = 0; i >= 0; i--, y++){ // i goes backwards
            reverse[y] = arr[i];
        }

        // use i variable that is going backwards to read from the original array - index for arr array
        // use y variable that is going forwards to store into the reverse array - index for reverse array

        System.out.println(Arrays.toString(reverse));
    }
}

