import java.util.*;

public class SumSquareDiff{

    public static void main(String[] args){
    
        Scanner sc  = new Scanner(System.in);

        int limit = sc.nextInt();

        int sumSquare = (int)(limit * (limit + 1) * (2 * limit + 1) * (1/6.0));
        int squareSum = (limit * (limit + 1)) / 2;
        
        squareSum  = (int) Math.pow(squareSum,2);

    
        System.out.println(squareSum - sumSquare);
        


    }
}
