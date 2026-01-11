package Solution;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

/**
 * Simple console application for checking whether a number is prime.
 * Supports both regular integers and very large numbers (via BigInteger).
 */
public class Solution
{
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Main application loop that asks user for input repeatedly
     * until the user types "quit".
     */
    private static void runPrimeChecker()
    {
        System.out.println();
        System.out.println("Enter a number to check if it is prime");
        System.out.println("or type 'quit' to exit the application:");
        System.out.print("> ");

        String input = scanner.next().trim();

        // Case-insensitive quit command
        if ("quit".equals(input.toLowerCase(Locale.ROOT)))
        {
            System.out.println("Thank you for using the Prime Checker. Goodbye!");
            return;
        }

        try
        {
            // For very large numbers we use BigInteger
            if (input.length() > 10 || input.startsWith("-"))
            {
                BigInteger bigNumber = new BigInteger(input);
                boolean result = Math.isPrime(bigNumber);
                System.out.printf("%,d is %sprime%n", bigNumber, result ? "" : "not ");
            }
            else
            {
                int number = Integer.parseInt(input);
                boolean result = Math.isPrime(number);
                System.out.printf("%d is %sprime%n", number, result ? "" : "not ");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Please enter a valid integer number or 'quit'");
        }
        catch (Exception e)
        {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        // Recursive call → continues the loop
        runPrimeChecker();
    }

    public static void main(String[] args)
    {
        System.out.println("=====================================");
        System.out.println("      Prime Number Checker  v1.0     ");
        System.out.println("=====================================");
        System.out.println("Supports very large numbers!");

        runPrimeChecker();

        scanner.close();
    }
}