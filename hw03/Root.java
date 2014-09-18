import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Root{
     
     
    
    public static void main(String[] args){//creates the main program (method)
    
        double original = inputDouble("What number would you like to use?");//sets original value
        
        double crude = 0;//creates variable
        
        double guess = original/3;//defines variable to be used later
        
        for(int x=0;x<5;x++){//repeats process 5 times total
            
            crude = (2*guess*guess*guess+original)/(3*guess*guess);//defines crude each time based on 'guess'
            
            guess = crude;//changes the value of guess each time through the loop to allow for a recurring math function
            
        }
        
        System.out.println("The crude estimation of the cube root of " + original + " is " + crude + ".");//outputs the original value and the estimation of the cube root
        
        System.out.println("The estimation cubed is " + Math.pow(crude,3) + ".");//cubes the rough estimation
        
        double root = Math.pow(original,.33333333333333333333333);//finds the actual cube root of the original number
        
        System.out.println("The cube root of " + original + " is " + root + ".");//outputs the actual cube root
        
        System.out.println(root + " * " + root + " * " + root + " = " + Math.pow(root,3));//cubes the actual cube root to show the full circle correctness of the the math functions
    
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