////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 22nd, 2014
//Homework 04 #3
//Course Number Java Program

//The purpose of this homework is to describe the course typed in given the course number
    //second, compile the code
    //third, run the code
    //fourth, upload to github

import java.util.Scanner;
    //importing the data from the java scanner

public class CourseNumber{
    //define the class
    public static void main (String [] args){
        //define the main method required for every java program
    
    //input data
    Scanner myScanner;
        //declaring the scanner an object
    myScanner = new Scanner(System.in);
        //call the scanner a constructor
    int nCourseNumber=0;
    int a;
    int x;
        //declaring the course number as the start of zero
 
    System.out.print("Enter a six digit number giving the the course semester: ");
        //prompting the user to enter the course number
    nCourseNumber=myScanner.nextInt();
        if (nCourseNumber<186510 || nCourseNumber>201440){
                //if statement for a number entered outside the range of course numbers
            System.out.println("The course entered was outside the range [186510,201440]");
                //print out that the course entered was not within the proper range
            return;
                //terminate the code
        }   //end the if statemnt
        
        x=((nCourseNumber/100));
    
            //subrtacting x2 from x gives you the first four digits of the code
        
        a=(nCourseNumber-(x*100));
      
        if (a==10){
         System.out.println("the course is offered in the spring of the year "+(x));
        }
        if (a==20){
            System.out.println("the course is offered in the summer semester 1 of the year "+(x));
        }
        if (a==30){
            System.out.println("The course is offered in the summer semester 2 of the year " +(x));
                
        }
        if (a==40){
            System.out.println("The course is offered in the fall of the year" +(x));
                //printing the fall semester
        } 

        
    }   //end the main method
}   //end the class