////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 15th, 2014
//Homework 03 #3

//The purpose of this homework is to enter a double and then print the first four digits to thr right of the decimal point
    //first, write the code
    //second, compile the code
    //thrid, run the code
    //fourth, upload to github
    
    import java.util.Scanner;
        //importing data from the java scanner
        
    //define the class
    public class FourDigits{
        //define the main method required for all java programs
        public static void main (String[] args){
        
        int x;  //assigning the varible x   
        int x2; //assigning the varible x2
        int x3; //assigning the varible x3
        
        Scanner myScanner;  //declaring the scanner an object
        myScanner=new Scanner(System.in);   //call the scanner a constructor
        System.out.print("enter the double: ");
            //prompts user to enter the double
        double nDouble = myScanner.nextDouble();
            //user enters the double here
            
        x=((int)(nDouble*10000));   //casting nDouble into x
        x2=((int)nDouble)*10000;    //casting nDouble into a less percise number
        x3=x-x2;    //subtracting x2 from x gives us the four remaining digits after the decimal point
        
            
            
        System.out.println("Enter the double and I will display the four digits to the right of the decimal place- " +(nDouble));
            //printing the double with all of its decimal places
        System.out.printf("The four digits are- %04d", x3);
            //printing out the four digtis after the decimal place
            
            }   //end main method
        }   //end class