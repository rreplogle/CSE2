import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class CourseNumber{
     
     
    
    public static void main(String[] args){//creates the main program (method)    
    
        int code = inputInt("What is the six digit code for the course semester?");
        
        if (code == (int) code){
        
            int year = code/100;
            
            int sem = code % 100;
            
            if (sem == 10){
                
                System.out.println("That corresponds to the Spring Semester of " + year + "." );
            }
        
            else if (sem == 20){
                
                System.out.println("That corresponds to the Summer 1 Semester of " + year + "." );
            }
            
            else if (sem == 30){
                
                System.out.println("That corresponds to the Summer 2 Semester of " + year + "." );
            }
            
            else if (sem == 40){
                
                System.out.println("That corresponds to the Fall Semester of " + year + "." );
            }
        }
        
        else {
            
            System.out.println("You did not enter a valid code.");//prints that the user improperly followed directions
        }
    
    }
    
    
    //Everything below here is code that I have used before to make user-inputted data easier to use
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    static char inputChar(String prompt){

        char result = (char)0;

        try{

            result = input (prompt).charAt(0);

        }

        catch (Exception e){

            result = 0;

        }

        return result;

    }

    static String input (String prompt){

        String iput = null;

        System.out.print(prompt + ": ");

        try{

            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            iput = is.readLine();

            if (iput.length() == 0) return null;

        }

        catch (IOException e){

            System.out.println("IO Exception: " + e);

        }

        return iput.toLowerCase();

    }

    static double inputDouble(String prompt){

        double result = 0;

        try{

            result=Double.parseDouble (input(prompt));

        }

        catch (Exception e){

            result = 0;

        }

        return result;

    }

    static int inputInt(String prompt){

        int result = 0;

        try{

            result = Integer.parseInt(input(prompt));

        }

        catch (Exception e){

            result = 0;

        }

        return result;

    }
    
}