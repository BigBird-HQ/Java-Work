package mrFemiTest;

import mrFemi.newFireDrillTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newFireDrillTwoTest {

//    @Test
//    public void emptyStringTest() {
//        String input = "It is still a beautiful world";
//        assertEquals("", mrFemi.newFireDrillTwo.reverseThis(input));
//    }
    @Test
    public void reverseStringTest() {
        String input = "It is still a beautiful world";
        String output = "world beautiful a still is It";
        assertEquals(output, newFireDrillTwo.reverseThis(input));
    }

}