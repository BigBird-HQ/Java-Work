package turtleGraphics;

public class TurtleGraphics {
    private boolean isPenUp = true;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void PenUp() {
        isPenUp = true;
    }
}
