///////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 3rd, 2014
//Lab02
//Cyclometer Lab Java Program

//The point of this lab is to create a program, given the inputs, which calucluates the distance of each trip, the minutes of each trip, and the distance and count of the two trips combined.
//  First, compile the data
//      javac Cyclometer.java
//  Second, run the program
//      java Cyclometer//
//  Third, upload and push to Github
//      git add *, git committ -m 'Cyclometer', git push, Yes

    //Define the class
    public class Cyclometer{
        //main method is required for every java program
        public static void main(String[] args) {
     
    //input the data for the 2 bike trips
        int secsTrip1=480; //stating that the time varible for Trip 1 is 480 seconds
        int secsTrip2=3220; //stating that the time varible for Trip 2 is 3220 seconds
        int countsTrip1=1561; //stating that the count varible for Trip 1 is 1561 counts
        int countsTrip2=9037; //stating that the count varible for Trip 2 is 9037 counts
    
    //intermedate and output data
        double wheelDiameter=27.0, //the diameter of the wheel is 14 inches and there are 2 wheels on a bike
        PI=3.14159, //
        feetPerMile=5280, //there are 5280 feet in one mile
        inchesPerFoot=12, //there are 12 inches in one foot
        secondsPerMinute=60; //there are 60 seconds in one minute
        double distanceTrip1, distanceTrip2, totalDistance; //double the \ndistance for each trip to get the total distances then double the total to find the complete number of minutes and counts
        
    //print out the data and numbers that are being collected
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts."); //the print statement documenting Trip 1
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts."); //the print statemnet documenting Trip 2
        
    //compute the values for the distance
        //run the calculations; 
        //store the values
        //document the calculations here
        //what are you calculating?
    distanceTrip1=countsTrip1*wheelDiameter*PI;
        //the equation above gives the distance for the trip in inches
        //one count, the rotation of the wheel and its diameter, and the PI
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //repeating steps in line 46 through 49 to calculate the same for Trip 2
    totalDistance=distanceTrip1+distanceTrip2; //total distance for the two trips combined
        
    //Print the putput data
        System.out.println("Trip 1 was " +distanceTrip1+ " miles"); //Trip 1 print
        System.out.println("Trip 2 was " +distanceTrip2+ " miles"); //Trip 2 print
        System.out.println("The total distance was "+totalDistance+" miles");
            //total of trips print
        
        } //end main method
    } //end class