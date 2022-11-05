package group19_3;

public class IQ {
    public static void main(String[] args) {
        int n = -35;
        if (n < 0) {
            n = n * -1;
        }
        String str = String.valueOf((n));
        String reverse = "";
int num=0;
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);//+str.charAt(i-1);


             num = Integer.valueOf((reverse));
            num = num * (-1);



        }
        System.out.println(num);
    }
}