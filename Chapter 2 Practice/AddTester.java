import java.awt.Rectangle;

public class AddTester
{
    public static void main(String [] args)
    {
        Rectangle rectangle = new Rectangle(0, 5, 10, 15);
        rectangle.add(0,0);
        System.out.println(rectangle);
    }
}