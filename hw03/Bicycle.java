import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Bicycle{
     
     
    
    public static void main(String[] args){//creates the main program (method)
    
        int Stime = inputInt("How long was the trip in seconds?");//user inputs the time in seconds
        
        double Mtime = Stime/60;//creates variable for time in minutes
        
        double Htime = Mtime/60;//creates variable for time in hours
        
        int count = inputInt("How many counts were there?");//user inputs the number of counts
        
        double lengthIN = count*3.1415*27;//creates variable for the length of the trip in inches
        
        double lengthMI = lengthIN/(5280*12);//creates variable for the mileage of the trip
        
        System.out.println("The trip was " + lengthMI + " miles long, and took " + Mtime + " minutes.");//outputs all relevant data
        
        double mph = (lengthMI/Htime);//creates variable for the miles per hour of the trip
        
        System.out.println("The average mph of the trip was " + mph + ".");//outputs the miles per hour
    
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