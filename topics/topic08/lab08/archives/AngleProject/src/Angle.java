import java.util.Scanner;
/**
 * This class asks the user to enter an angle.  If the angle is:
 *     less than 90, print out acute angle
 *     exactly 90, print out right angle
 *     more than 90 but less than 180, print out obtuse angle
 *     exactly 180, print out straight angle
 *     otherwise, print out reflex angle
 *
 * @version (1.0)
 */

public class Angle
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Angle angle = new Angle();

        System.out.print("Enter the size of the angle: ");
        int enteredAngle = input.nextInt();
        angle.processAngle(enteredAngle);
    }

    private void processAngle(int angle)
    {
        //determines whether the angle is acute, right, obtuse, straight or reflex.
        if (angle < 90)
        {
            System.out.println("The angle " + angle + " is an acute angle!");
        }
        else if (angle == 90)
        {
            System.out.println("The angle " + angle + " is a right angle!");
        }
        else if ((angle > 90) && (angle < 180))
        {
            System.out.println("The angle " + angle + " is an obtuse angle!");
        }
        else if (angle == 180)
        {
            System.out.println("The angle " + angle + " is a straight angle!");
        }
        else
        {
            System.out.println("The angle " + angle + " is a reflex angle!");
        }
    }

}
