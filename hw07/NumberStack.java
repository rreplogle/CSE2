import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class NumberStack{
    
    public static void main(String[] args){//creates the main program (method)
    
    int x;

    x = inputInt("What number would you like to use?(1-9)");
    
    System.out.println();
    
    System.out.println("For Loops");
    
    System.out.println();
    
    for (int q = 0;q<x+1;q++){
    
        for (int i = 0;i<q;i++){
            
            
            
            for (int y = 0;y<((2*q)-1);y++){
            
                System.out.print(q);
            
            }
            
            System.out.println();
            
        }
    
        for (int f = 0;f<((2*q)-1);f++){
    
        System.out.print("-");
    
        }
        
        System.out.println();
        
    }
    
    System.out.println();
    
    System.out.println("While Loops");
    
    System.out.println();
    
    int q=0;
    int i=0;
    int y=0;
    int f=0;
    
    while (q<x+1){
    //for (int q = 0;q<x+1;q++){
        
        while (i<q){
        //for (int i = 0;i<q;i++){
            
            while (y<((2*q)-1)){
            //for (int y = 0;y<((2*q)-1);y++){
            
                System.out.print(q);
            
            y++;
            
            }
            
            y = 0;
            
            System.out.println();
        
        i++;
        
        }
        
        i = 0;
    
        while (f<((2*q)-1)){
        //for (int f = 0;f<((2*q)-1);f++){
    
        System.out.print("-");
        
        f++;
        
        }
        
        f = 0;
        
        System.out.println();
    
    q++;
    
    }
    
    System.out.println();
    
    System.out.println("Do-While Loops");
    
    System.out.println();
    
    q=1;
    i=0;
    y=0;
    f=0;
    
    do{
    //while (q<x+1){
    //for (int q = 0;q<x+1;q++){
        
        do{
        //while (i<q){
        //for (int i = 0;i<q;i++){
            
            do{
            //while (y<((2*q)-1)){
            //for (int y = 0;y<((2*q)-1);y++){
            
                System.out.print(q);
            
            y++;
            
            }while (y<((2*q)-1));
            
            y = 0;
            
            System.out.println();
        
        i++;
        
        }while (i<q);
        
        i = 0;
    
        do{
        //while (f<((2*q)-1)){
        //for (int f = 0;f<((2*q)-1);f++){
    
        System.out.print("-");
        
        f++;
        
        }while (f<((2*q)-1));
        
        f = 0;
        
        System.out.println();
    
    q++;
    
    }while (q<x+1);
    
    
    
    
    
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
