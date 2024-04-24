package javaScript;

import java.util.Arrays;

public class InputAndOutput2 {
    public static void main(String[] args) {
        int [] elements = {4,2,5,8,1};
        int maximum = 0;
        int minimum = elements[0];
        int [] maxMin = new int[1];

        for (int index = 0; index < elements.length; index++) {
            if (elements[index] > maximum) {
                maximum = elements[index];
            }
            if (elements[index] < maximum) {
                minimum = elements[index];
            }

        }
        int difference = maximum - minimum;
        maxMin[0] = difference;
        System.out.println(Arrays.toString(maxMin));
    }
}
