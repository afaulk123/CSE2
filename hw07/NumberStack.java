//Ashley Faulkner
//Homework 07
//10/21/14
//The purpose of this homework is to create stacks of numbers when given an integer

import java.util.Scanner;   
    //import scanner data
public class NumberStack{   
    //declare the class
	public static void main(String[] args){ 
	    //declare main method
    Scanner myScanner;  
        //declaring the scanner
    myScanner=new Scanner(System.in);   
        //creating the scanner a varible
        System.out.print("Enter an integer (single digit--from 1-9): "); 
            //prompt user to enter a int
            int number = myScanner.nextInt();
            int x=1;    //set the varibles
            int l=1;
            int a=1;
            int s=1;
        System.out.println("Using for loops");    
        for (x=1; x<=number; x++){
           for (l=1; l<=x; l++){
                for (s=1; s<=9-x; s++){
                    System.out.print(" ");
                }   //end the for loop
                for (a=1; a<=((x*2)-1); a++){
                    System.out.print(x);
                }   //end the 3rd for loop
            System.out.println();    
            }   //end the 2nd for loop
        System.out.println();    
        }   //end the 1st for loop
            
        System.out.println("Using while loops");
        x=1;    //reset the varibles
        l=1;
        a=1;
        s=1;
        while (x<=number){  
                //while loop
            while (l<=x){
                while (s<=9-x){
                    System.out.print(" ");
                    s++;
                }
                while (a<=((x*2)-1)){
                    System.out.print(x);
                    a++;
                }   //end the 3rd while loop
                s=1;
                a=1;
                l++;
                System.out.println();   //print the number
            }   //end 2nd while loop
        l=1;    
        System.out.println();   //print the lines
        x++;    //counter
        }   //end first while loop
        
        System.out.println("Using do-while loops"); //state which loop it is
        x=1;    //reset the varibles
        l=1;
        a=1;
        do{
            do{
               do{
                   System.out.print(" ");
                   s++;
               } while (s<=9-x);
               do{
                 System.out.print(x);   //print the number
                 a++;
               } while (a<=((x*2)-1));
            s=1;
            a=1;   
            l++;    //counter
            System.out.println();   //print the line
            } while (l<=x);
        l=1;
        System.out.println();   
        x++;    //counter
        } while (x<=number);  //end the do-while loop
    
    
	}   //end main method
}   //end class