package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenScoreCount = 0;
        double sumOfEvenScores = 0;
        double average = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a scores: ");
            double scores = input.nextInt();

            if (scores % 2 == 0) {

                evenScoreCount++;
                sumOfEvenScores = sumOfEvenScores + scores;
                average = sumOfEvenScores / evenScoreCount;

            }

        }
        System.out.println("Sum of even scores is: " + sumOfEvenScores);
        System.out.println("The average of the sum of even numbers is: " + average);
    }
}
