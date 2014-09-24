import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Month{
     
     
    
    public static void main(String[] args){//creates the main program (method)    
    
    int month = inputInt("What month is it? (1-12)");
    
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        System.out.println("This month has 31 days.");
    }
    
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
        System.out.println("This month has 30 days.");
    }
    
    else if (month == 2) {
        int year = inputInt("What year is it?");
        if (year % 4 == 0){
            System.out.println("This year is a leap year. There are 29 days in this month.");
        }
        else {
            System.out.println("This month is not a leap year. There are 28 days in this month.");
        }
    }
    
    else if (month < 1 || month > 12 || month != (int) month) {
        System.out.println("You did not enter a valid number (1-12)");
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