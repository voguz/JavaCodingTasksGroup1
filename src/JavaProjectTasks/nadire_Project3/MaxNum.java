package JavaProjectTasks.nadire_Project3;

import java.util.Arrays;

public class MaxNum {

    public static void main(String[] args) {
        System.out.println("maxNum(new int[]{12,33,66,77}) = " + maxNum(new int[]{12, 33, 66, 77}));
        System.out.println("maxNumber(new int[]{100,200,50,77}) = " + maxNumber(new int[]{100, 200, 50, 77}));
    }


    public static int maxNum(int num[]) {
        Arrays.sort(num);
        return num[num.length - 1];
    }
    public static int maxNumber(int numbers[]){
        int max=numbers[0];
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]>max){
                max=numbers[i];

            }
        }

        return max;
    }


}
