import static org.junit.Assert.*;

public class FanTest
{
    public static void main(String[] args)
    {
        Fan fanone=new Fan();
        Fan fantwo=new Fan();

        fanone.setSpeed(10);
        fanone.setRadius(10);
        fanone.setColor("Yellow");
        fanone.setOn(true);
        fantwo.setSpeed(5);
        fantwo.setRadius(5);
        fantwo.setColor("blue");
        fantwo.setOn(false);

        fanone.toString();


    }

}