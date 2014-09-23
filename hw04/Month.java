////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner  
//September 22nd, 2014
//Homework 04 #2
//Month Java Program

//The purpose of this homework is, when given an interger between 1-12, tells the month and number of days in the month
    //first, write the code
    //second, compile the code
    //thrid, run the code
    //fourth, upload to github

import java.util.Scanner;
    //importing the data from the java scanner
public class Month{
    //define the class
    public static void main (String [] args){
        //define the main method necessary for every java program
    //import data
        Scanner myScanner;
            //declaring the scanner an object
        myScanner = new Scanner(System.in);
            //call the scanner a constructor
        int nMonth=0;
            //declaring the month 
        int nYear=0;
            //declaring the year
        System.out.print("Enter the month (in terms of numerical date): ");
            //prompting the user to enter the number of the month
            if (myScanner.hasNextInt()){
                //if statement asking if the user used a positive number
                nMonth=myScanner.nextInt();
                    //declaring month value
                if (nMonth<1||nMonth>12){
                    //if the number month entered is greater than 12 or less than 1
                    System.out.println("You did not enter a value between 1 and 12");
                        //print statement saying you did not enter a proper month
                    return; //terminates the program
                }   //end the if statment
            }   //end the if statement
            
            if ((nMonth==1)||(nMonth==3)||(nMonth==5)||(nMonth==7)||(nMonth==8)||(nMonth==10)||(nMonth==12)){
                //if the month is entered as 1, 3, 5, 7, 8, 10, or 12
                System.out.println("The month is 31 days");
            }   //ends the if statement
            
            if ((nMonth==4)||(nMonth==6)||(nMonth==9)||(nMonth==11)){
                //if statament if the month is 4, 6, 9, or 11
                System.out.println("The month is 30 days");
                    //print that the month is 30 days
            }   //end the if statement
            
            if (nMonth==2){
                //if the month entered is 2
                System.out.print("Enter the year: ");
                    //prompting the user to print the year
                nYear=myScanner.nextInt();
                    //declaring the scanner
                if ((nYear==2008)||(nYear==2012)||(nYear==2016)||(nYear==2000)||(nYear==2004)||(nYear==1900)){
                    System.out.println("The month is 28 days");
                }   //end the if statement
              //end the else if statement
                else{
                    //otherwise if it doesnt follow the terms above
                    System.out.println("The month is 29 days");
                        //print statement saying the month is 29 days
                    return;
                        //termnate the program
                }   //end the else statement
            }   //end the if statement
          
    }   //end the main menthod 
}   //end the class