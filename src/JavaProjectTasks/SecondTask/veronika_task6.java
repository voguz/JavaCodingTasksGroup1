package JavaProjectTasks.SecondTask;

public class veronika_task6 {
    public static void main(String[] args) {
        Codility();
    }
    public static void Codility() {

        for (int i = 1; i <= 24; i++) {

            if(i % 3 == 0 && i % 2 == 0){
                System.out.println("CodilityTest");
            }else if (i % 5 == 0 && i % 3 == 0){
                System.out.println("TestCoders ");
            } else if(i % 5 == 0 && i % 3 == 0 && i % 2 == 0){
                System.out.println("CodilityTestCoders");
        }else if (i % 5 == 0 ) {
                System.out.println("Coders ");
            } else if (i % 3 == 0) {
                System.out.println("Test ");
            } else if (i % 2 == 0) {
                System.out.println("Codility ");
            } else {
                System.out.println(i + "  ");
            }
        }
    }


}
