package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double average = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a score: ");
            double scores = input.nextInt();

            sum += scores;

            average = sum / scores;

        }
        System.out.println("Sum of score is: " + sum);
        System.out.println("The average of scores is: " + average);
    }
}
