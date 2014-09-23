////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 22nd, 2014
//Homework 04 #4
//Time Padding Java Program

//The purpose of this homework is, given a number of seconds, outputs the minutes/hours that have passed throughout the day up until that point
    //first, write the code
    //second, compile the code
    //thrid, run the code
    //upload to github

import java.util.Scanner;
    //importing the data from the scanner
public class TimePadding{
        //define the class
        public static void main (String [] args){
            //define the main method necessary for every java program
            
        //import data
            int nTime=0;
            Scanner myScanner;
                //listing the scanner as the object
            myScanner = new Scanner(System.in);
                //call the scanner a constructor
            System.out.print("Enter the time in seconds: ");
                //prompting the user to enter time in seconds
            nTime=myScanner.nextInt();
            int nMinutes;
            int nHours;
            int nSeconds;
            int secondsPerHour=3600;
            int secondsPerMinute=60;
            
            nHours=nTime/secondsPerHour;
            nSeconds=(nTime)-(nHours*3600);
            nMinutes=nSeconds/secondsPerMinute;
            nSeconds=(nSeconds)-(nMinutes*60);
     
            System.out.printf("The time is %d :%02d: %02d", nHours, nMinutes, nSeconds);    
            
            
        }   //end main method
}   //end class