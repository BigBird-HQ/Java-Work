package fireDrillTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a scores: ");
            double scores = input.nextInt();

            sum += scores;

        }
        System.out.println("Sum of score is: " + sum);
    }
}
