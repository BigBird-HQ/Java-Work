package javaScriptTest;

import javaScript.JsFireDrill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsFireDrillTest {
    @Test
    public void addNumberToLastIndexTest() {
    int [] input = {5,2,3,1,2};
    int [] output = {5,2,3,1,3};
    assertArrayEquals(output, JsFireDrill.addOneToLastIndexOf(input));
    }
    @Test
    public void addNumberToLastIndexTest2() {
        int [] input = {9,9,9,9,9,};
        int [] output = {1,0,0,0,0,0};
        assertArrayEquals(output, JsFireDrill.addOneToLastIndexOf(input));
    }

}
