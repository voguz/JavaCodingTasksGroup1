package JavaProjectTasks.ThirdTask;

public class veronika_task7 {
    public static void main(String[] args) {
        isPrime(20);
    }
    public static void isPrime(double price){


        boolean isPrime = true;
        if (isPrime) {
            System.out.println("Free 2-3 days shipping");
        } else {
            if (price >= 25) {

                System.out.println("Free shipping is available");
            } else {
                System.out.println("Shipping cost is $2.99");
            }
        }

}
}
