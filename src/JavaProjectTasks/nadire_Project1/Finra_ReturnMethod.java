package JavaProjectTasks.nadire_Project1;

public class Finra_ReturnMethod {
    public static void main(String[] args) {


        Finra();
    }

    public static void Finra() {

        for (int i = 1; i <= 30; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }
        }
    }
}