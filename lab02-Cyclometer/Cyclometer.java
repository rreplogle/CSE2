//Lab 02 - Ryan Replogle - CSE2 - 9/3/2014

//creates a class
//input java.io.*;
public class Cyclometer{
     
     
    //creates the main program (method)
    public static void main(String[] args){
        
        
        //THIS WAS MY FIRST IDEA ON HOW TO WRITE THE PROGRAM (I HAVE THE INPUT STATEMENTS I NEEDED FOR THIS TO WORK ON A USB, BUT I FIGURED I SHOULDN'T USE THEM).
        
        
        
        /*for (int x = 1;x<3;x++){
        int rot = inputInt("How many rotations has the front wheel completed during Trip " + x + "?");//allows the user to set the variable 'rot'
        int sec = inputInt("How many seconds have gone by during Trip " + x + "?");//allows the user to set the variable 'sec'
        double diameter = input("What is the diameter of the front wheel?");//allows the user to set how large the front bycicle tire is
        double pi = 3.14159;
        System.out.println("Trip " + x + " took " + sec*60 + "minutes, and was " + pi*diameter*rot + "miles long.");
        */
        
        
        
        
        
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        double wheelDiameter=27.0 , PI=3.14159 , feetPerMile=5280 , inchesPerFoot=12 , secondsPerMinute=60;
        double distanceTrip1 , distanceTrip2 , totalDistance;
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches(for each count, a rotation of the wheel travels the diameter in inches times PI)distanceTrip1/=inchesPerFoot*feetPerMile;
        //Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
        
        
        }
        
        
    }