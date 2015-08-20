import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(250);
        turtle.turnRight();
        turtle.forward(150);
        turtle.penDown();
        int i = 1;
        while (i !=300)
            turtle.forward(i);
            turtle.turnRight();
            i = i+1;
    }
}
