/* Project Euler Question 8 */

import java.util.*;

public class LargestProductSeries{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numOfAdj = sc.nextInt();
        int row = sc.nextInt();

        sc.nextLine();
        
        char[] digitData = readDigits(sc,row); 
    
        long largest = checkRowLargest(digitData, numOfAdj);
        
        System.out.println(largest);

    }
    
    public static long checkRowLargest(char[] digitData, int numOfAdj){
    
        long largest = 0;
        
        long before = 1;
        long after = 1;
        long currDigit = 1;

        long currProduct = 0;
        
        for(int col = 0; col + numOfAdj <= digitData.length; col++){
        
            if(col - 1 >= 0)
                before = Character.getNumericValue(digitData[col - 1]);
            after = Character.getNumericValue(digitData[col + numOfAdj -1]);
            
            if(currProduct == 0){
            
                for(int innerCol = col; innerCol < col + numOfAdj; innerCol++){
                    
                    currDigit = Character.getNumericValue(digitData[innerCol]);
                    
                    if(innerCol == col){
                        currProduct = currDigit;
                        continue;
                    }

                    if(currDigit != 0){
                
                        currProduct *= currDigit;

                    } else {

                        currProduct = 0;
                        col  = innerCol;
                        break;
                    }
                }
            
            } else if(after == 0){
               
                currProduct = 0;
                col = col + numOfAdj - 1;
                continue;
            
            } else {
                
                if(before != 0)
                    currProduct /= before;
                
                currProduct *= after;
            }

            largest = Math.max(largest,currProduct);
        }

        return largest;
    }

    public static char[] readDigits(Scanner sc, int row){
       
        char[] digitData;
        String currLine = "";
        String finalStr = "";

        for(int i=0; i < row; i++){
        
            currLine = sc.nextLine();
            finalStr += currLine;
        }
        
        digitData = finalStr.toCharArray();

        return digitData;
    }
    
}

