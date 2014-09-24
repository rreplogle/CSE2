import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class TimePadding{
     
     
    
    public static void main(String[] args){//creates the main program (method)    
    
    int sec = inputInt("How many seconds have pased so far this day?");
    
    int hours = sec/3600;
    
    int mins = (sec-(hours*3600))/60;
    
    int secrem = (sec-(hours*3600)-(mins*60));
    
    if (hours<10&&mins<10&&secrem<10){
        System.out.println("The time is 0" + hours + ":0" + mins + ":0" + secrem);
    }
    
    if (hours<10&&mins>10&&secrem>10){
        System.out.println("The time is 0" + hours + ":" + mins + ":" + secrem);
    }
    
    if (hours<10&&mins<10&&secrem>10){
        System.out.println("The time is 0" + hours + ":0" + mins + ":" + secrem);
    }
    
    if (hours<10&&mins>10&&secrem<10){
        System.out.println("The time is 0" + hours + ":" + mins + ":0" + secrem);
    }
    
    if (hours>10&&mins<10&&secrem>10){
        System.out.println("The time is " + hours + ":0" + mins + ":" + secrem);
    }
    
    if (hours>10&&mins<10&&secrem<10){
        System.out.println("The time is " + hours + ":0" + mins + ":0" + secrem);
    }
    
    if (hours>10&&mins>10&&secrem<10){
        System.out.println("The time is " + hours + ":" + mins + ":0" + secrem);
    }
    if (hours>10&&mins>10&&secrem>10){
        System.out.println("The time is " + hours + ":" + mins + ":" + secrem);
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