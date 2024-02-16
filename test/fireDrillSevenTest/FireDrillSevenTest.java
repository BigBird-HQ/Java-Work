package fireDrillSevenTest;

import fireDrillSeven.FireDrillSeven;
import fireDrillSix.FireDrillSix;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillSevenTest {
    @Test
    public void returnFalseForEvenAndTrueForOddTest() {
        FireDrillSeven fireDrill = new FireDrillSeven();

        int [] numbers = {4, 5, 8, 8, 8, 2, 9};
        boolean [] output = {false, true, false, false, false, false, true};
        assertArrayEquals(output, fireDrill.returnTrueAndFalse(numbers));

    }
}
