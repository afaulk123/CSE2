////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 22nd, 2014
//Homework 04 #1
//Income Tax Java Program

//The purpose of this homework is given an income in thousands, add the certain amount of tax and print the total
    //first, write the code
    //second, compile the code
    //third, run the code
    //fourth, upload to github

import java.util.Scanner;
    //import the data from the java scanner
public class IncomeTax{
    //define the class
    public static void main (String [] args){
        
    //input the data
    Scanner myScanner;
        //declaring the scanner an object
    myScanner = new Scanner(System.in);
        //call the scanner a constructor
        int nIncomeTax=0;
            //prompts user to enter the value
        System.out.print("Enter an int giving the number of thousands: ");
            //user enters their value
            
            if (myScanner.hasNextInt()){
                //if statement asking if the user used a positive integer
                nIncomeTax=myScanner.nextInt();
                    //declaring the income tax value
                if (nIncomeTax<0){
                    //if the user enters a value less than zero
                    System.out.println("You did not enter a positive int");
                        //prints that you did not enter a positive integer
                    return;
                        //terminate the program
                }   //ends the if statement
            }   //ends the first if statment
            
            if (nIncomeTax<20){
                    //if statement
                System.out.println("The tax rate on " +(nIncomeTax*1000)+ " is 5% and the tax is " +((nIncomeTax*1000)*.05));
                //printing the value for the tax if income is less than 20,000
            }   //end if statement
            
            else if (nIncomeTax>=20 && nIncomeTax<40){
                //if statement
                System.out.println("The tax rate on " +(nIncomeTax*1000)+ " is 7% and the tax is " +((nIncomeTax*1000)*.07));
                //printing the value of tax if the incme is between 20,000 and 40,000
            }   //end the if statement
            
            else if (nIncomeTax>=40 && nIncomeTax<78){
                //if statement
                System.out.println("The tax rate on " +(nIncomeTax*1000)+ " is 12% and the tax is " +((nIncomeTax*1000)*.12));
                    //printing the value of tax if the income is between 40,000 and 78,000
            }   //end the if statemnt
            
            else if (nIncomeTax>=78){
                //if statement
                System.out.println("The tax rate on " +(nIncomeTax*1000)+ " is 14% and the tax is " +((nIncomeTax*1000)*.14));
                    //printing the value of tax if the income is above 78,000
            }   //end the if statement
        
            else{
                //if what is entered doesnt follow the above rules
                System.out.println("You did not enter an int");
                    //printing that the user didnt answer using an integer
                return;
                    //terminate the program
            }   //end the else statement
        
        
    }   //end the main method  
}   //end the class