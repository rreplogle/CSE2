import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class IncomeTax{
     
     
    
    public static void main(String[] args){//creates the main program (method)    
    
    int inc = inputInt("How many thousands of $'s do you make? (Positive Integer please)");//user inputs how many thousands of dollars  they would like to use
    
    double tax = 0;//creates variable tax to be used later
    
    if (inc == (int) inc) {//only runs program if the user inputs an integer
    
    if (inc < 20) {//if the user input less than 20
        tax = .05;//sets tax = 5%
    }
    
    else if (inc >= 20 && inc < 40) {//if the user input bewteen 20 and 40
        tax = .07;//sets tax = 7%
    }
    
    else if (inc >= 40 && inc < 78) {//if the user input between 40 and 78
        tax = .12;//sets tax = 12%
    }
    
    else if (inc >= 78) {//if the user input more thn 78
        tax = .14;//sets tax = 14%
    }
    
    int sal = (int)(inc*tax);//forces tax x income into an integer to avoid huge decimals
    
    System.out.println("The tax rate on $" + inc + ",000 is " + tax + "%, and the tax is about $" + sal + ",000.");//prints all wanted information
    
    }
    
    else if (inc < 0 || inc != (int) inc) {
        System.out.println("You cannot follow directions. You did not enter a positive integer.");//this line only runs if the user does not input a positive integer
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