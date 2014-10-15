import java.util.Scanner;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Roulette{
    
    public static void main(String[] args){//creates the main program (method)
    
    int q;//initializes variable named q
    
    int makemoney;//initializes variable named "makemoney"
    makemoney=0;//sets it equal to 0
    
    int lose;//initializes variable named "lose"
    lose=0;//sets it to 0
    
    int y;//initializes variable named y
    int x;//initializes variable named x
    int z;//initializes variable named z
    int k;//initializes variable named k
    k=0;//sets k equal to 0
    int p;//initializes variable named p
    p=0;//sets p equal to 0
    
    
    for (x = 0;x<=1000;x++){//runs the contents of the loop 1000 times
        q=(int)(Math.ceil(38*Math.random()));//sets q equal to random number between 1 and 38
        
        k=0;//resets k equal to 0
        for (y=0;y<=100;y++){//runs the contents of the loop 100 times. represents each time the player visits the table.
            z = (int)(Math.ceil(38*Math.random()));//sets  equal to random number between 1 and 38
            if (z==q){//if the random number that z is equals the random number that q is, then:
                k=k+36;// k is set to be the winnings for each time the table is visited
            }
            
            
        }
        if (k>100){//counter variable, counts number of times a profit is made
            makemoney++;//adds 1 to the variable
        }
        if (k==0){//counter variable, counts the number of times all money is lost
            lose++;//adds 1 to the variable
        }
        p=p+k;//p is equal to the total sum of all "k's" (winnings)
        
        
        
    }
    
    System.out.println("You lost everything " + lose + " times, you made a profit " + makemoney + " times, and your total winnings out of $100,000 are $" + p + ".");
    //prints everything
    
    
    
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
