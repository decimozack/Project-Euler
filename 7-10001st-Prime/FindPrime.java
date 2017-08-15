import java.util.*;

public class FindPrime{

    public static void main(String[] args){
    
        System.out.println("Enter the prime number you want find:");

        Scanner sc = new Scanner(System.in);

        int place = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<Integer>();
        
        primeList.add(2);
        boolean found = false;
        
        int currPlace = 1;
        
        int currNum = 1;

        while(currPlace != place){
            
            currNum += 2;
            found = false;
            
            if(currNum % 10 != 0){
              
                for(int i = 0; i < primeList.size() && !found;i++){
                    
                    if(currNum % primeList.get(i) == 0){
                        found = true;
                    }
                    
                }

            if(!found){
                currPlace++;
                primeList.add(currNum);
            } 
            }
            
            
        }
       
       // System.out.println(primeList);
        System.out.println("The curr Number is " + primeList.get(primeList.size() - 1)); 
    }

    
}
