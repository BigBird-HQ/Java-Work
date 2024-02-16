package fireDrillSeven;

import java.util.ArrayList;

public class FireDrillSeven {
    public boolean[] returnTrueAndFalse(int [] numbers) {
        boolean [] elements = new boolean [numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            elements[index] = numbers[index] % 2 != 0;

        }

        return elements;

    }
}




