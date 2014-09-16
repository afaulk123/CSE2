////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 15th, 2014
//Homework 03 #2
//Root Java Program

//This homework's purpose is when a cubed root is entered, the root is calculated
    //first, write the code
    //second, compile the code
    //thrid, run the code
    //fourth, upload to github
    
    import java.util.Scanner;
        //import data from the scanner within java
        
    //define a class
    public class Root{
        //define the main method necessary for each java program
        public static void main(String [] args){
        
    //input data
        double guess;   //varible for the guess
        double x2;  //varible for x2
        double x3;  //varible for x3
        
        Scanner myScanner;  //declaring the scanner an object
        myScanner=new Scanner(System.in);
            //call the scanner then constructor
        System.out.print("Enter the cubed root (integer >0): ");
            //prompting user to input the cubed root
        int x = myScanner.nextInt();
            //input the cubed root
            
        guess=x/3;
            //make the guess divided by 3
        x2=(guess*guess*guess+x)/(3*guess*guess);
            //improve the first guess
        x3=(2*x2*x2*x2+x)/(3*x2*x2);
            //improve to the most accurate guess
        System.out.println("the cube root is " +(x3)+ ".");
            //print the first guess
        System.out.println(x3+"*"+x3+"*"+x3+"="+(x3*x3*x3));
            //printing the root and its cube
            
        }   //end main method
    }   //end class