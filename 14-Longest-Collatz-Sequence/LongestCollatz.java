// Project Euler Problem 14
// Longest Collatz Sequence
// Done By : Zack Chua

import java.util.*;

public class LongestCollatz {

    public static void main(String[] args) {

        HashMap<Integer, Integer> seqList = new HashMap<Integer, Integer>();

        seqList.put(1, 1);

        int count = 1;
        long currCollatz = 0;
        int maxCount = 0;
        int end = 1000000;
        int maxNum = 1;

        for (int i = 2; i < end; i++) {

            count = 1;
            currCollatz = i;

            while (currCollatz != 1) {

                if (currCollatz % 2 == 0)
                    currCollatz = currCollatz / 2;
                else
                    currCollatz = 3 * currCollatz + 1;

                if (seqList.containsKey(currCollatz)) {

                    count += seqList.get(currCollatz);
                    break;

                } else {

                    count++;
                }

            }

            if (count > maxCount) {

                maxCount = count;
                maxNum = i;
            }
            seqList.put(i, count);
        }

        System.out.println(maxNum);
    }

}
