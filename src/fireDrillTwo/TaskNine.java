package fireDrillTwo;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;

        for (int count = 1; count <= 10; count++) {

            System.out.println("Enter a valid score: ");
            double score = input.nextDouble();

            if (score >= 0 && score <= 100) {

                sum += score;

            }

        }
        System.out.print("The sum of valid scores is: " + sum);
    }
}
