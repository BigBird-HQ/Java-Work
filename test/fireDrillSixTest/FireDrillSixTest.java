package fireDrillSixTest;

import fireDrillSix.FireDrillSix;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillSixTest {
    @Test
    public void turnEvenElementsToZeroAndOddElementsToOnesTest() {
        FireDrillSix drill = new FireDrillSix();

        List<Integer> numbers = List.of(4, 5, 6, 8, 8, 8, 9);
        List<Integer> outputArrays = List.of(0, 1, 0, 0, 0, 0, 1);

        assertEquals(outputArrays, drill.returnEvenAndOdd(numbers));


    }

}
