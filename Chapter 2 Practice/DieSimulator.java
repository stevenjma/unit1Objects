import java.util.Random;

public class DieSimulator
{
    public static void main(String [] args)
    {
        //Creates Random
        Random die = new Random();
        //Assigns Six Different Numerical Values Randomly
        int one = die.nextInt(6);
        one += 1;
        int two = die.nextInt(6);
        two += 1;
        int three = die.nextInt(6);
        three +=1 ;
        int four = die.nextInt(6);
        four += 1;
        int five = die.nextInt(6);
        five += 1;
        int six = die.nextInt(6);
        six += 1;
        //Prints out the random numerical values
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        
        //Option B!?
        double dievalue = Math.random(); //returns a double between 0 (inclusive) and 1 (exclusive)
        dievalue *= 6; //range[0,6}
        dievalue += 1;
        System.out.println( (int) dievalue);
    }
}