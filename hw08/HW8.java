//Homework 08
//Ashley Faulkner
//The purpose of this homework is to write methods, overloading methods, and force the user to enter a good input
//10-28-2014

import java.util.Scanner;   //import scanner info
    public class HW8{   //declare the class
        public static void main(String []arg){  //declare the main method
	    char input; //character input
	    Scanner scan=new Scanner(System.in);    //constuct and declare the scanner
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");  //prompt the user to enter a c to continue
	    input=getInput(scan,"Cc");  //if they enter a c for continue
	    System.out.println("You entered '"+input+"'");  //print that what they entered even if its not a c 
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");  //prompt the user to enter a y or n for yes or no
	    input=getInput(scan,"yYnN", 5); //give up after 5 attempts
	    if(input!=' '){ //if statement
   	    System.out.println("You entered '"+input+"'");  //prints what you entered fails the 5 attempts
	    }   //end the if statement
	    input=getInput(scan,"Choose a digit.","0123456789");    //prompts the user to enter a digit in between 1 and 9
	    System.out.println("You entered '"+input+"'");  //prints what the user entered
	    
        }   //end the main method
        public static char getInput (Scanner scan, String C){
            if (scan.hasNextInt()){
                
            }
        }
        public static char getInput (Scanner scan,)
        
    public static int max(int a, int b){
    if(a>b){
        return a;
        return b;
    }
    }

    public static int max(int a, int b, int c, int d){
        return max(max(a,b), max(c,d));
    }

    String a,b="This is a test string";
	int loc;
	a="";
	loc=0;
	while(loc<b.length() && b.charAt(loc)!=' '){
  	a+=b.charAt(loc);
  	loc++;
	}
	System.out.println("The first word in '"+b+"' is '"+a+"'");
	a="";
	for(int pos=b.length();pos>0;pos--){
  	a+=b.charAt(pos-1);
	}
	System.out.println("The reverse of '"+b+"' is '"+a+"'");
  
        
        
    }   //end the class