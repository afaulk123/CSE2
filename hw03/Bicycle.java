////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 15th, 2014
//Homework 03 #1
//Bicycle Java Program

//This homework is designed to output the miles per hour based on the users input of counts and seconds
    //First, write the code
    //Second, compile the code
    //Third, run the code
    //Fourth, upload to Github
    //import scanner
    import java.util.Scanner;
        //importing the scanner data from java
    //Define the class
    public class Bicycle{
        //main method, which is required for every java program
        public static void main (String[] args){
            
    //input data
        Scanner myScanner;  //declaring the scanner an object
        myScanner=new Scanner(System.in); //call the scanner the constructor
        System.out.print("enter the number of seconds (integer > 0): "); 
            //prompts user to input number of seconds
        int nSeconds = myScanner.nextInt();
            //inputs the number of seconds
            
        System.out.print("Enter the number of counts that appears on the cyclometer: ");
            //prompts user to enter the counts on the cyclometer
        int nCounts = myScanner.nextInt();
            //user enters counts here
        double wheelDiameter = 27.0;
            //the diameter of the wheel is 14 inches and there are 2 wheels
        double PI=3.14159;
        double feetPerMile=5280; 
            //there are 5280 feet in one mile
        double inchesPerFoot=12;
            //there are 12 inches in one foot
        double secondsPerMinute=60; 
            //there are 60 seconds in one minute
        double minutesPerHour=60;
            //there are 60 minutes in one hour
        double tripDistance;    //stating the varible for the trip distance
        double tripTime;    //stating the varible for the trip time
        double tripTimeInHours; //stating the varible for trip time in hours
        double avgMph;  //stating the average miles per hour varible
        
        
        tripDistance=nCounts*wheelDiameter*PI;
            //finding the trip distance by taking the counts and multipling it by the wheel diameter and PI
    
        tripDistance/=inchesPerFoot*feetPerMile;
            //finding the trip distance in miles
        tripTimeInHours=(nSeconds/secondsPerMinute)/minutesPerHour;
            //fidning thr trip time in hours
        avgMph=tripDistance/(tripTimeInHours);
            //calculating the miles per hour for the trip
        
        tripDistance=((int) (tripDistance*100))/100.0;
            //puts the trip distance in miles
        tripTime=nSeconds/secondsPerMinute;
            //calculating time in minutes
      
        avgMph=((int)(avgMph*100))/100.0;
            //casting into an integer
    
        System.out.println("The distance of the trip was " +(tripDistance)+ " miles and it took "+(tripTime) + " minutes");
            //distance and time of the trip
        System.out.println("The average mph was "+(avgMph)+ ".");  
            //printing the average miles per hour
        
        }   //end main method
    }   //end class