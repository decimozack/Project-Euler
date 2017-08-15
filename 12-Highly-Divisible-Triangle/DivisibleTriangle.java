// Project Euler Problem 12
// Highly divisible triangular number
//Done by: Zack Chua

import java.util.*;

public class DivisibleTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        // value = 500;

        System.out.println(findAns(value));
    }

    public static int findAns(int value) {

        int currNum = 1;
        int currTotal = 0;
        int counter = 0;

        while (counter < value) {

            counter = 0;
            currTotal = currNum * (currNum + 1) / 2;
            currNum++;

            int end = currTotal;

            for (int i = 1; i < end; i++) {

                if (currTotal % i == 0) {

                    if (i != (currTotal / i))
                        counter += 2;
                    else
                        counter++;

                    end = (currTotal / i);
                }
            }


        }

        return currTotal;
    }

}
