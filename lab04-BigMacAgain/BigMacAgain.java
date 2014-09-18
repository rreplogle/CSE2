import java.util.Scanner;
public class BigMacAgain{
     
     
    
    public static void main(String[] args){//creates the main program (method)
        
        System.out.println("How many Big Macs would you like?");
        
        Scanner scanner1 = new Scanner(System.in);
        
        int nBigMacs;
        
        nBigMacs = scanner1.nextInt();
        
        if(nBigMacs>0){
            
            System.out.println("You odered " + nBigMacs + " Big Mac(s) at $2.22 each, for a cost of $" + nBigMacs*2.22 + ".");
            
            }
        
        else{
            
            if(nBigMacs<0){
                
                System.out.println("You entered a negative number.");
                
            }
            
            else{
                
                System.out.println("You did not enter a interger.");
                
            }
            
            return;
            
        }
        
        Scanner scanner2 = new Scanner(System.in);
        
        char fries;
        
        System.out.println("Would you like fries?(y/n)");
        
        fries = scanner2.next().charAt(0);
        
        if(fries=='y'){
            
            System.out.println("You odered fries at a price of $2.15.");
            
            System.out.println("The total cost of your meal is $" + (2.15+(2.22*nBigMacs)) + ".");
            
        }
        
        else if(fries=='Y'){
            
            System.out.println("You odered fries at a price of $2.15.");
            
            System.out.println("The total cost of your meal is $" + (2.15+(2.22*nBigMacs)) + ".");
            
        }
        
        else if(fries=='n'){
         
            System.out.println("The total cost of your meal is $" + (2.22*nBigMacs) + ".");
            
        }
        
        else if(fries=='N'){
            
            System.out.println("The total cost of your meal is $" + (2.22*nBigMacs) + ".");
            
        }
            
        else{

                System.out.println("You did not type 'y' or 'n'.");
                
            }
            
            return;
            
        }
        
    
}