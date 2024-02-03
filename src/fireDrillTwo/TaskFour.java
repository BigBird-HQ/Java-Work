package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfEvenIndices = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a scores: ");
            double scores = input.nextInt();

            if (count % 2 == 0) {
                sumOfEvenIndices += scores;
            }
        }
        System.out.println("Sum of score is: " + sumOfEvenIndices);
    }
}
