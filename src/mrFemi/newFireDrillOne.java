package mrFemi;

import java.util.Arrays;

public class newFireDrillOne {
    public static int maxProduct(int[] numbers) {
        int maximumProduct = Integer.MIN_VALUE;

        if (numbers.length == 0) return 0;
        if (numbers.length == 2) return numbers[0] * numbers[1];
//        if (numbers[0] < 0) return 0;
        if (numbers.length == 1) return numbers[0];

        for (int index = 0; index < numbers.length -1; index++) {
            for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
                if (numbers[index] * numbers[innerIndex] > maximumProduct) {
                    maximumProduct = numbers[index] * numbers[innerIndex];
//                    System.out.println(maximumProduct);
                }
            }
        }
    return maximumProduct;
    }

    public static int maxProduct2(int[] numbers) {
        if (numbers.length <2) return 0;
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if (num1 > num2) return num1;
        else return num2;
    }

    public static int maxProduct3(int[] numbers) {
        if (numbers.length <2) return 0;
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return Math.max(num1, num2);
    }

}
