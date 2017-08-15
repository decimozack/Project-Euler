// Project Euler Question 10

import java.util.*;
import java.math.BigInteger;

public class SummationPrime {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of the primes below? :");

        int end = sc.nextInt();

        System.out.println(sumAllPrime(end));

    }

    public static BigInteger sumAllPrime(int end) {

        boolean[] allNum = new boolean[end + 1];

        BigInteger sum = new BigInteger("0");

        Arrays.fill(allNum, true);


        for (int i = 2; i < allNum.length; i++) {

            if (allNum[i] == true) {

                sum = sum.add(new BigInteger(i + ""));

                for (int a = 2; i * a < end + 1; a++)
                    allNum[i * a] = false;
            }
        }

        return sum;
    }
}
