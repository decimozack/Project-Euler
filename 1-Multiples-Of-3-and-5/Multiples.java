// Project Euler Question 1
// Multiples of 3 and 5
// Done By Zack Chua

import java.util.*;

public class Multiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBelow = sc.nextInt();

        System.out.println(findSumOfMultiples(numBelow));
    }

    public static int findSumOfMultiples(int numBelow) {

        int multiThree = 1;

        int multiFive = 1;

        int counter = 1;
        int sum = 0;

        while ( multiThree < numBelow || multiFive < numBelow) {

            multiThree = 3 * counter;
            multiFive = 5 * counter;
            counter++;


            if (multiThree < numBelow) {

                if (multiThree % 5 != 0)
                    sum += multiThree;
            }
            if (multiFive < numBelow)
                sum += multiFive;
        }

        return sum;
    }
}
