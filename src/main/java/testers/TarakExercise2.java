package testers;

import java.util.Scanner;

public class TarakExercise2 {

    public static void main(String[] args) {

        System.out.println("Enter A Number: ");
        Scanner number = new Scanner(System.in);
        int EO = number.nextInt();

        if (EO % 2==0) {
            System.out.print("Even");
        }
        else
            System.out.print("Odd");

    }
}
