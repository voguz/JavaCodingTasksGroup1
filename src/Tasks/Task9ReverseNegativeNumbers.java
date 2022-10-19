package Tasks;

public class Task9ReverseNegativeNumbers {
    private static int reverseNegativeNum(int num){
        if(num<0){
            num=num*-1;
        }
        String temp=String.valueOf(num);
        String[]numArr=temp.split("");
        String reverseS="";
        int reverse=0;
        for(int i=numArr.length-1;i>=0;i--){
            reverseS+=numArr[i];
            reverse=Integer.parseInt(reverseS);
        }


        return reverse*-1;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-876533));
    }




}
