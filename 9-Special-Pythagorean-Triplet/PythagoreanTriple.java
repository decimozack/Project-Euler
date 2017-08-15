// Project Euler Problem 9

import java.util.*;

public class PythagoreanTriple{

    public static void main(String[] args){

        int total = 1000;
        System.out.println(findProduct(total));
    }
   
   
    public static int findProduct(int total){  
        
        

        for(int a = 1; a * 3 < 1000; a++){
            
            for(int b = a + 1; a + b * 2 < 1000; b++){
            
                int cSqr = (int)Math.pow(a,2) + (int)Math.pow(b,2);

                if(perfectSquare(cSqr)){
                    
                    int c =(int) Math.sqrt(cSqr);

                    if(a + b + c  == total){
                        
                        return a * b * c; 
                    }
                }
            
            }
            
        }
        
        return -1; //cannot find stub
    }


    public static boolean perfectSquare(int num){

        int result = (int) Math.sqrt(num);

        return num == (result * result);
    }
}
