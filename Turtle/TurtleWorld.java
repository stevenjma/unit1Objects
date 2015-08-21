import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException

    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle johncena = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penUp();
        turtle.setShellColor(Color.RED);
        turtle.turnLeft();
        turtle.forward(250);
        turtle.turnRight();
        turtle.forward(150);
        turtle.penDown();
        turtle.turnRight();
        turtle.setPenColor(Color.BLACK);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.BLUE);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.CYAN);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.GRAY);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.MAGENTA);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.ORANGE);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.PINK);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.RED);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50);
        turtle.setPenColor(Color.YELLOW);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        turtle.forward(50); 
        johncena.setPenColor(Color.BLUE);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.penUp();
        johncena.setShellColor(Color.RED);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.turnLeft();
        johncena.forward(250);
        johncena.penDown();
        johncena.turnRight();
        johncena.turnRight();
        johncena.setPenColor(Color.BLACK);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.BLUE);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.CYAN);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.GRAY);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
       johncena.setPenColor(Color.MAGENTA);
       Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.ORANGE);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.PINK);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.RED);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        johncena.setPenColor(Color.YELLOW);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        
       
    }
}
