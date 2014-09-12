////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 10th, 2014
//Lab 03
//Big Mac Arithmetic Java Program

//The point of this lab is create a program that compliles the number of Big Macs consumed, determine their cost, and print the final cost including Pennsylvania's 6% sales tax
    //first, create the code
    //second, compile the code
        //javac BigMac.java
    //third, run the code and get the printed results
        //java BigMac
    //fourth, add and push to Github
        //git add*, git commit -m, git push
    
    //import the scanner data
    import java.util.Scanner;

    //Define the Class
    public class BigMac{
        //define the main method
        public static void main(String[] args){
            
    //input the data
        Scanner myScanner;  //declaring the scanner an object
        myScanner = new Scanner(System.in); //call the scanner the construtor
        System.out.print("enter the number of Big Macs (an integer > 0): ");
            //prompting the user to input the number of Big Macs
        int nBigMacs = myScanner.nextInt(); //input number of Big Macs
        
        System.out.print("Enter the cost per Big Mac as "+"a double (in the form xx.xx): ");
            //prompting the user to enter the cost of Big Macs in the next step
        double bigMac$ = myScanner.nextDouble();    
            //intger of cost for Big Macs entered here
        System.out.print("Enter the percent tax as a whole number (xx): ");
            //prompting the user to enter the amount of tax based on the price of the Big Mac
        double taxRate = myScanner.nextDouble();
            //integer of the tax price for Big Macs entered here
        taxRate/=100; //user enters a percent but it prints as a proportion
        
    //print the output data
        double cost$; //total cost for the Big Macs
        int dollars, //whole dollar amount of the cost
            dimes, pennies; //for storing the digits to the right of the decimal point for the cost
        cost$= nBigMacs*bigMac$*(1+taxRate);
            //results in the whole amont, dropping the decimal fraction
        dollars=(int)(cost$);
            //get the dimes amount
        dimes=(int)(cost$*10)%10;
            //converting the dime double into the integer
        pennies=(int)(cost$*100)%10;
            //converting the penny double into a integer
        System.out.println("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$ +" per Big Mac, with a " +"sales tax of "+ (int)(taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies);
            //print the final statement that incudes the amount of Big Macs, the price per burger, and the total price the customer will pay
        
        
        }   //end the main method
    }   //end the class