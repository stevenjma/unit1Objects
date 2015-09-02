import java.awt.Color;
import javax.swing.JFrame;

public class TurtleLab
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
        Color color = new Color(25, 25, 25);
        johncena.setShellColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.turnLeft();
        johncena.forward(250);
        johncena.penDown();
        johncena.turnRight();
        johncena.turnRight();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
       johncena.setPenColor(color);
       Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        color = color.brighter();
        johncena.setPenColor(color);
        Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
        johncena.forward(50);
        
       johncena.setPenColor(Color.BLUE);
       johncena.penUp();
       johncena.turnRight();
       johncena.turnRight();
       johncena.forward(200);
       johncena.turnLeft();
       johncena.penDown();
       int num = 1;
       while (num < 500)
       {
           johncena.forward(num);
           johncena.turnRight();
           Thread.sleep(100);
           num += 1;
        }
    }
}
