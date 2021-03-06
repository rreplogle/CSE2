import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Month{
     
     
    
    public static void main(String[] args){//creates the main program (method)    
    
    int month = inputInt("What month is it? (1-12)");//asks for the month
    
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {//if the month is 1 OR 3 OR 5, etc
        
        System.out.println("This month has 31 days.");//prints the days in the month
    }
    
    else if (month == 4 || month == 6 || month == 9 || month == 11) {//if the month is 4 OR 6, etc
        
        System.out.println("This month has 30 days.");//prints the number of days
    }
    
    else if (month == 2) {//if the month is feb
        
        int year = inputInt("What year is it?");//asks for the year
        
        if (year % 4 == 0){//if the year is evenly divisible by 4
            
            System.out.println("This year is a leap year. There are 29 days in this month.");//prints the number of days
        }
        
        else {//if the year is not evenly divisible by 4
            
            System.out.println("This month is not a leap year. There are 28 days in this month.");//prints the number of days
        }
    }
    
    else if (month < 1 || month > 12 || month != (int) month) {//if the user does not input a valid number of if the user does not input an integer
        
        System.out.println("You did not enter a valid number (1-12)");//prints that the user improperly followed directions
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