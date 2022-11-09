import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //receives input from the user
        Scanner src = new Scanner(System.in);

        int testScore;
// allows the user to input text score
        System.out.println("Student Test Score: ");
        testScore = src.nextInt();

        //comparing the test score and the accurate grade to be assigned
        if (testScore < 60) {
            System.out.println("Grade F");

        } else if (testScore < 70){
            System.out.println("Grade D");

        } else if (testScore <80) {
            System.out.println("Grade C");

        } else if (testScore < 90) {
            System.out.println("Grade B");

        } else {
            System.out.println("Grade A");
        }

    }
}