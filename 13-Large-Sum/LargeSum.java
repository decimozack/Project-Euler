// Project Euler Question 13
// Large Sum
// Done by: Zack Chua 

import java.util.*;
import java.math.BigInteger;

public class LargeSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lines = 100;
        
        BigInteger total = new BigInteger(sc.nextLine());

        for(int i= 1; i < 100; i++){
        
            
            BigInteger curr = new BigInteger(sc.nextLine());

            total = total.add(curr);
        }
        
        System.out.println(total.toString().substring(0,10));
    }
}
