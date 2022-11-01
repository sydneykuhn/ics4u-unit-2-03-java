/*
 * The program is the
 * "Mr Coxall Stack"
 *
 * By:      Sydney Kuhn
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.Scanner;

/**
 * This is the main function.
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Set variables
        final int arrayPopped;

        // Set up scanner
        final Scanner userInt = new Scanner(System.in);
        final Scanner removeInt = new Scanner(System.in);
        final SydneyStack stackClass = new SydneyStack();

        // Input
        try {
            while (true) {
                System.out.print("Enter a Number: ");
                final int userInput = userInt.nextInt();
                if (userInput == -1) {
                    break;
                } else {
                    stackClass.push(userInput);
                }
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("[ NaN ]");
        }

        // Process
        System.out.println("\n");
        stackClass.finishedStack();

        // Before pop
        arrayPopped = stackClass.pop();
        System.out.println(arrayPopped + " was removed from the stack.");

        // Shows after pop
        System.out.println("The array after pop method is... ");
        stackClass.finishedStack();

        // Output
        System.out.println("\nDone.");
    }
}
