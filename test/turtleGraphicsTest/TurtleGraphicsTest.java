package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.TurtleGraphics;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TurtleGraphicsTest {
    private TurtleGraphics turtle;
    @BeforeEach
    public void setUp() {
        turtle = new TurtleGraphics();
    }
    @Test
    public void penIsUp_isPenUpTest() {
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void penIsUp_isPenDownTest() {
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    public void penIsUp_oenIsDown_isPenUpTest() {
        assertTrue((turtle.isPenUp()));
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.PenUp();
        assertTrue(turtle.isPenUp());

    }

}
