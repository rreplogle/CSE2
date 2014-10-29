import java.util.Scanner;

public class HW08{
    
  public static void main(String []arg){
      
	char input;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	
	input=getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){
	    
   	System.out.println("You entered '"+input+"'");
   	
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	
	System.out.println("You entered '"+input+"'");
	
  }  
  
  public static char getInput(Scanner p, String q){
      
    p = new Scanner(System.in);
    
    if (p.next().equalsp.next().charAt(0)){
        
        return (char)p.next();
        
    } else if (Character.isLetter(p.next()) == false){
        
        System.out.println("You did not enter a character from the list 'Cc', try again.");
        
        return getInput(p,q);
        
    } else if (Character.isLetter(p.next()) == true && p.next() != p.next().charAt(0)){
        
        System.out.println("You should enter exactly one character.");
        
        return getInput(p,q);
        
    }
      
  }
  
  
  
}



/*CANNOT GET THE CODE TO COMPILE, I AM SEVERELY CONFUSED ABOUT HOW TO WORK WITH THESE SCANNERS
TO GET THE PROGRAM TO RUN DIFFERENT METHODS, YOU JUST HAVE TO SET THE REQUIREMENTS FOR THE METHOD TO BE DIFFERENT
LIKE CHANGING

      public static char getInput(Scanner p, String q){

TO

      public static char getInput(Scanner p, String q, int x){

THIS WOULD RUN THE SECOND METHOD, BECAUSE THE SECOND METHOD CALLS UPON getInput WITH THE 5 AT THE END


      public static char getInput(Scanner p, String q, String Y){

THIS WOULD BE THE METHOD FOR THE THIRD getInput
THIS IS THE SAME THING AS THE SECOND ONE, HOWEBER THIS ONE HAS A STRING AS A THIRD REQUIREMENT
e.g. - "0123456789"
*/