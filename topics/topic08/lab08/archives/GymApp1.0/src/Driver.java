import java.util.Scanner;

public class Driver {

    /**
     * This class asks the user to enter a gym members details.
     * The entered data is then printed out to the user.
     *
     * @author (SETU)
     * @version (1.0)
     */

        private Scanner input = new Scanner(System.in);
        private GymMember gymMember;

        public static void main(String arg[]) {
            new Driver();
        }

        public Driver() {
            addGymMember();
            printGymMember();
        }

        private void addGymMember() {
            //obtaining the data from the user
            System.out.println("Entering details");
            System.out.println("----------------");

            System.out.print("   Enter your name:             ");
            String name = input.nextLine();

            System.out.print("   Enter your height (meters):  ");
            double height = input.nextDouble();

            System.out.print("   Enter your weight (kgs):     ");
            double weight = input.nextDouble();

            System.out.print("   Enter the membership number: ");
            int membershipNumber = input.nextInt();

            System.out.print("   Is current member (y/n):     ");
            char isCurrentMemberChar = input.next().charAt(0);

            boolean isCurrentMember = false;
            if ((isCurrentMemberChar == 'Y') || (isCurrentMemberChar == 'y')) {
                isCurrentMember = true;
            }

            gymMember = new GymMember(name, height, weight, membershipNumber, isCurrentMember);
        }

        private void printGymMember()
        {
            //printing out the data to the user
            System.out.println("\n\nPrinting details");
            System.out.println("----------------");
            System.out.println(gymMember);
        }

    }
