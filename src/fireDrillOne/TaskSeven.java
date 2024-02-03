package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {

        int result = 1;
        int total = 0;

        for (int count = 1; count <= 10; count++) {
            for (int counter = 1; counter <= 5; counter++) {
                if (count % 4 == 0) {
                    result *= count;

                    System.out.print(result + " ");
                }
            }
            System.out.print(" ");
            result = 1;
        }

    }
}
