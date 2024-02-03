package fireDrillTwo;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        int validScoreCount = 0;
        double average = 0;

        for (int count = 1; count <= 10; count++) {

            System.out.println("Enter a valid score: ");
            double score = input.nextDouble();

            if (score >= 0 && score <= 100) {

                validScoreCount++;
                sum += score;
                average = sum / validScoreCount;

            }

        }
        System.out.print("The average of valid scores is: " + average);
    }
}
