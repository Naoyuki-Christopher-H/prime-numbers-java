package Solution;

import java.math.BigInteger;

/**
 * Utility class containing prime number checking methods.
 * This class should not be instantiated.
 */
public final class Math
{
    // Private constructor to prevent instantiation
    private Math()
    {
        throw new AssertionError("Math utility class cannot be instantiated");
    }

    /**
     * Checks whether the given integer is a prime number.
     *
     * @param number the number to test (treated as absolute value)
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number)
    {
        // Handle trivial cases
        if (number <= 1)
        {
            return false;
        }

        if (number == 2 || number == 3)
        {
            return true;
        }

        // Eliminate even numbers and multiples of 3 early
        if (number % 2 == 0 || number % 3 == 0)
        {
            return false;
        }

        // Check odd divisors up to sqrt(number)
        for (int i = 5; i * i <= number; i += 6)
        {
            if (number % i == 0 || number % (i + 2) == 0)
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks whether the given BigInteger is a prime number.
     * Uses a combination of probabilistic and deterministic checks.
     *
     * @param number the BigInteger to test
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(BigInteger number)
    {
        // Handle small and trivial cases
        if (number == null || number.compareTo(BigInteger.ONE) <= 0)
        {
            return false;
        }

        if (number.equals(BigInteger.TWO) || number.equals(BigInteger.valueOf(3)))
        {
            return true;
        }

        // Quick even check (except 2)
        if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO))
        {
            return false;
        }

        // Fast probabilistic filter (very high certainty)
        if (!number.isProbablePrime(10))
        {
            return false;
        }

        // Deterministic check up to sqrt(n) using 6k±1 optimization
        BigInteger limit = number.sqrt().add(BigInteger.ONE);

        for (BigInteger i = BigInteger.valueOf(5); i.compareTo(limit) < 0; i = i.add(BigInteger.valueOf(6)))
        {
            if (number.mod(i).equals(BigInteger.ZERO) ||
                number.mod(i.add(BigInteger.TWO)).equals(BigInteger.ZERO))
            {
                return false;
            }
        }

        return true;
    }
}