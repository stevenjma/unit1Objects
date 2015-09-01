import java.util.Random;

public class DieSimulator
{
    public static void main(String [] args)
    {
        Random die = new Random();
        int one = die.nextInt(6);
        int two = die.nextInt(6);
        int three = die.nextInt(6);
        int four = die.nextInt(6);
        int five = die.nextInt(6);
        int six = die.nextInt(6);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}