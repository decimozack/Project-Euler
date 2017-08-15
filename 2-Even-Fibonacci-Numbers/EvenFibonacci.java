// Project Euler Problem 2
// Even Fibonacci numbers
// Done by: Zack Chua

import java.util.*;

public class EvenFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("limit:");
        int upperLimit = sc.nextInt();
        System.out.println(getSum(upperLimit));
    }

    public static long getSum(int upper) {

        long sum = 2;

        int[] num = new int[2];
        num[0] = 1;
        num[1] = 2;

        int currFib = 0;

        while (num[1] < upper) {

            currFib = num[0] + num[1];

            if (currFib % 2 == 0) {

                sum += currFib;
            }

            num[0] = num[1];
            num[1] = currFib;
        }

        return sum;
    }

}
