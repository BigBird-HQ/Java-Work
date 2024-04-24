package mrFemiTest;

import mrFemi.newFireDrillOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newFireDrillOneTest {
    @Test
    public void maximumProductsOfTwoNumbersInAnArray_oneElementTest() {
        int[] numbers = {1};
        assertEquals(1, newFireDrillOne.maxProduct(numbers));
    }
    @Test
    public void maximumProductsOfTwoNumbersInAnArray_moreThanOneElementTest() {
        int[] numbers = {1, 5, 10, 4, 0};
        assertEquals(50, newFireDrillOne.maxProduct(numbers));
    }
    @Test
    public void maximumProductsOfTwoNumbersInAnArray_negativeElementTest() {
        int[] numbers = {-2};
        assertEquals(0, newFireDrillOne.maxProduct(numbers));
    }
    @Test
    public void maximumProductsOfTwoNumbersInAnArray_emptyArrayTest() {
        int[] numbers = {};
        assertEquals(0, newFireDrillOne.maxProduct(numbers));
    }
    @Test
    public void maximumProductsOfTwoNumbersInAnArray_twoElementsTest() {
        int[] numbers = {-1, -2};
        assertEquals(2, newFireDrillOne.maxProduct(numbers));
    }@Test
    public void maximumProductsOfTwoNumbersInAnArray_threeElementsTest() {
        int[] numbers = {-1, -2, 3};
        assertEquals(2, newFireDrillOne.maxProduct(numbers));
    }

}