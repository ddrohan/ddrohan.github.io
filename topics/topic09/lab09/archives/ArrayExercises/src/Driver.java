import java.util.*;

public class Driver {

    private Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        new Driver();
    }

    public Driver(){
        //Uncomment the line with the method you want to run.
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();
        //exercise11();
        //exercise12();
        //exercise13();
        //exercise14();
        //exercise15();
        exercise16();
    }

    private void exercise1() {
        System.out.println("Exercise 1: reads in 6 integers into an integer array and prints the values to the screen.");

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("value " + (i+1)  + " is: " + numbers[i]);
        }
    }


    private void exercise2() {
        System.out.println("Exercise 2: read in 6 integers into an integer array and  print the values out backwards.");

        int[] numbers = new int[6];

        for (int i = 0; i<6 ; i++) {
            System.out.print("Enter value :");
            numbers[i] = input.nextInt();
        }

        for (int i = 5; i>=0 ; i--) {
            System.out.println("value " + i  + " is: " + numbers[i]);
        }
    }

    private void exercise3() {
        System.out.println("Exercise 3: Write a method to read in 6 values into an integer array.");
        System.out.println("\t\tThen add one to each value in the array.");
        System.out.println("\t\tFinally, print out the resultant values in the array.");
        int[] numbers = new int[6];

        for (int i = 0; i<6 ; i++) {
            System.out.print("Enter value :");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i<6 ; i++) {
            numbers[i]++ ;
        }

        for (int i = 0; i<6 ; i++) {
            System.out.println("value " + i  + " is: " + numbers[i]);
        }
    }

    private void exercise4() {
        System.out.println("Exercise 4: Write a method to read in 10 ‘wages’ into a ‘double’ array");
        System.out.println("\t\ti.e. an array where each element is a double, for instance 2.33");
        System.out.println("\t\tFinally print out these values.");

        double[] numbers = new double[10];

        for (int i = 0; i<10 ; i++) {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++) {
            System.out.println("Wage at index " + i  + " is: " + numbers[i]);
        }
    }

    private void exercise5() {
        System.out.println("Exercise 5: read in 10 ‘wages’ into a ‘double’ array.  Print out any wages over 100");

        double[] numbers = new double[10];

        for (int i = 0; i<10 ; i++)
        {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++)
        {
            if (numbers[i] > 100 ) {
                System.out.println("Wage at index " + i  + " is: " + numbers[i]);
            }
        }
    }

    private void exercise6() {

        System.out.println("Exercise 6: read in 10 ‘wages’ into a ‘double’ array.");
        System.out.println("\t\tAnyone who earns over 1000 will have a wage reduction of 10%. Make this reduction. ");
        System.out.println("\t\tFinally print out all the values.");

        double[] numbers = new double[10];
        double limit = 1000.0 ;
        double reduction = 0.1 ;

        for (int i = 0; i<10 ; i++) {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<10 ; i++) {
            if (numbers[i] > limit ) {
                numbers[i] = numbers[i] - (numbers[i] * reduction ) ;
            }
        }

        for (int i = 0; i<10 ; i++) {
            System.out.println("Wage at index " + i  + " is: " + numbers[i]);
        }
    }

    private void exercise7() {
        System.out.println("Exercise 7: read in 10 'wages' into a 'double' array as above. ");
        System.out.println("\t\tCalculate and print the average of the inputted wages");

        int size = 10 ;
        double[] numbers = new double[size];
        double total = 0.0 ;

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<size ; i++) {
            total += numbers[i]  ;
        }
        System.out.println("Average Wage = " + (total / numbers.length) );
    }

    private void exercise8() {
        System.out.println("Exercise 8: read in 6 'wages' into a 'double' array as above. ");
        System.out.println("\t\tPrint out the largest wage.");

        int size = 6 ;
        double[] numbers = new double[size];
        double largestWage = Integer.MIN_VALUE;

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<size ; i++) {
            if (numbers[i] > largestWage){
                largestWage = numbers[i];
            }
        }
        System.out.println("Largest Wage = " + largestWage );
    }

    private void exercise9() {
        System.out.println("Exercise 9: read in 6 'wages' into a 'double' array as above. ");
        System.out.println("\t\tPrint out the largest wage AND the index this wage is stored at in the array.");

        int size = 6 ;
        double[] numbers = new double[size];
        int largestWageIndex = 0;

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter wage (" + (i+1) + "): ");
            numbers[i] = input.nextDouble() ;
        }

        for (int i = 0; i<size ; i++) {
            if (numbers[i] > numbers[largestWageIndex]){
                largestWageIndex = i;
            }
        }
        System.out.println("Largest Wage = " + numbers[largestWageIndex]
                + " and is stored in index " + largestWageIndex);
    }

    private void exercise10() {
        System.out.println("Exercise 10: read in 5 names into a `String` array. ");
        System.out.println("\t\tEach name should then be printed out to the console");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i  + " is: " + names[i]);
        }

    }


    private void exercise11() {
        System.out.println("Exercise 11: read in 5 names into a `String` array. ");
        System.out.println("\t\tEach name should then be printed out in UPPERCASE to the console");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i  + " is: " + names[i].toUpperCase());
        }
    }

    private void exercise12() {
        System.out.println("Exercise 12: read in 5 names into a `String` array. ");
        System.out.println("\t\tEach name should then be printed out in lowercase to the console");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i  + " is: " + names[i].toLowerCase());
        }
    }

    private void exercise13() {
        System.out.println("Exercise 13: read in 5 names into a `String` array. ");
        System.out.println("\t\tOnly print out the names that are at least 7 chars long");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            if (names[i].length() >= 7) {
                System.out.println("Name at index " + i + " is: " + names[i].toLowerCase());
            }
        }
    }

    private void exercise14() {
        System.out.println("Exercise 14: read in 5 names into a `String` array. ");
        System.out.println("\t\tOnly print out the first three characters of each name.");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i + " is: " + names[i].substring(0,3));
        }
    }

    private void exercise15() {
        System.out.println("Exercise 15: read in 5 names into a `String` array. ");
        System.out.println("\t\tOnly print out the first three characters in UPPERCASE of each name.");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            System.out.println("Name at index " + i + " is: " + names[i].substring(0,3).toUpperCase());
        }
    }

    private void exercise16() {
        System.out.println("Exercise 16: read in 5 names into a `String` array. ");
        System.out.println("\t\tOnly print out the names that contain 'ann'.");

        int size = 5 ;
        String[] names = new String[size];

        for (int i = 0; i<size ; i++) {
            System.out.print("Enter name (" + (i+1) + "): ");
            names[i] = input.next();
        }

        for (int i = 0; i<size ; i++) {
            if (names[i].toLowerCase().contains("ann")) {
                System.out.println("Name at index " + i + " is: " + names[i]);
            }
        }
    }

}

