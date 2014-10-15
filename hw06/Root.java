import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Root{
    
    public static void main(String[] args){//creates the main program (method)
   
    double x;//initializes variable x as a double
    
    x=inputDouble("What number would you like to find the square root of?");//asks the user what number to set 'x' equal to
 
    double low;//initializes variable low as a double
 
    low=0;//sets low equal to 0
  
    double high;//initializes variable high as a double
  
    high=x+1;//sets high equal to the user's input plus 1
    
    double middle;//initializes variable middle as a double
    
    for (int y=0;y<100;y++){//runs the contents of the loop 100 times
  
        middle=(low+high)/2;//sets middle equal to the average between high and low
  
        if ((middle*middle)>x){//if the middle squared is above x, then high becomes the value of middle
 
            high=middle;
  
        } else {//if the middle squared is below x, then low becomes the value of middle
   
            low=middle;
  
        }
    
    }
  
    middle=(low+high)/2;//redefines middle as the average of the most recent high and low values

    System.out.println("The square root of " + x + " is " + middle + ".");//prints the estimated square root
    
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