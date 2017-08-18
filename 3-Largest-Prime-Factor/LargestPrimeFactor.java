// Project Euler Problem 3
// Largest Prime Factor
// Done by: Zack Chua

import java.util.*;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("key in wanted number : ");
        long wanted = sc.nextLong();

        boolean largest = false;

        long newVal = 0;

        for (long i = 2; i < wanted / 2 && !largest; i++ ) {

            newVal = wanted / i;

            if (wanted % i == 0) {

                largest = checkPrime(newVal);
            }
        }


        System.out.println(newVal);

    }

    public static boolean checkPrime(long number) {

        if (number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 == 0)
            return false;

        long i = 5;

        while (i * i <= number) {

            if ( number % i == 0 || number % (i + 2) == 0)
                return false;

            i = i + 6;

        }
        return true;
    }
}
