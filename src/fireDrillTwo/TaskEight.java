package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            double sum = 0;

            for (int count = 1; count <= 10; count++) {
                System.out.println("Enter a valid score: ");
                double scores = input.nextInt();
                if (scores < 0 || scores > 100) {
                    System.out.println("Invalid score input! Please, " +
                                "Enter a score between 0 to 100");
                }
                else {
                    sum += scores;
                }

            }
            System.out.println("Sum of score is: " + sum);

    }
}