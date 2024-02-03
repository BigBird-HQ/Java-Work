package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double sumOfEvenScores = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a scores: ");
            double scores = input.nextInt();

            if (scores % 2 == 0) {

                sumOfEvenScores = sumOfEvenScores + scores;

            }

        }
        System.out.println("Sum of even scores is: " + sumOfEvenScores);
    }
}
