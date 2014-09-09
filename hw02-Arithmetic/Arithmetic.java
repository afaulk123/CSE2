////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 7th, 2014
//Homework 02
//Arithmetic Java Program

//The point of this homework is to create a program that, given a value, will calculate the total of the prices of products bought at Walmart (total including PA state tax)
    //First, create the code
    //Second, compile the data
        //javac Arithmetic.java
    //Third, run the program
        //java Arithmetic
    //Fourth, upload and push to Github
        //git add*, git commit -m 'name', git push
    
    //Define Class
    public class Arithmetic{
        //main method is required for ever java program
        public static void main(String[] args){
    
    //input data
    int nSocks=3; //number of socks 
    double sockCost$=2.58; //'$' is part of the varible name
    
    int nGlasses=6; //the number of drinking glasses
    double glassCost$=2.29; //the amount that the drinking glasses cost
    
    int nEnvelopes=1; //the number of boxes of envelopes
    double envelopeCost$=3.25; //cost per box of envelopes
    
    double taxPercent=0.06; //cost of the tax addition in the state of PA
    
    double costS; //sock cost with tax
    double costG; //glass cost without tax
    double costE; //envelope cost without tax
    double costST; //sock total with tax
    double costGT; //glass total with tax
    double costET; //envelope total with tax
    double totalWithouttax;    //total of all products without tax
    double totaltax;    //total sales tax for all products
    double totalwithtax;   //total of all products with tax
    
    
    costS=nSocks*sockCost$; //total cost of the multiple pairs of socks bought
        costST=costS*(taxPercent); //total tax of the socks 

    costG=nGlasses*glassCost$; //total cost of the glasses bought
        costGT=costG*(taxPercent); //the total tax of the glasses 
    
    costE=nEnvelopes*envelopeCost$; //total cost of the envelopes bought
        costET=costE*(taxPercent); //the total tax of the envelope 
        
    totalWithouttax=costS+costE+costG;  //total of the products without tax
    totaltax=((int)((costST+costGT+costET)*100))/100.0; //total sales tax
    totalwithtax=totalWithouttax+totaltax; //total of all products with tax
    totalwithtax = ((int)(totalwithtax*100))/100.0;
    
    //Print the output data
        System.out.println("The customer bought " +nSocks+ " pairs of socks from the store");
            //print the number of socks bought
        System.out.println("The customer bought " +nEnvelopes+ " envelopes from the store");
            //print the number of envelopes bought
        System.out.println("The customer bought " +nGlasses+ " glasses from the store");
            //print the number of glasses bought
            
        System.out.println("The cost of the socks without tax is " +costS+ " dollars");
            //print total cost of the socks without tax
        System.out.println("The cost of the envelopes without tax is " +costE+ " dollars");
            //print total cost of the envelopes wihtout tax
        System.out.println("The cost of the glasses without tax is " +costG+ " dollars");
            //print total cost of the glasses without tax
        
        System.out.println("The cost of the tax on socks is " +costST+ " dollars");
            //print total cost of the socks with tax
        System.out.println("The cost of the tax on glasses is " +costGT+ " dollars");
            //print total cost of the glasses tax 
        System.out.println("The cost of the tax on envelopes is " +costET+ " dollars");
            //print total cost of envelope tax
        
        System.out.println("The cost of the total items without tax is " +totalWithouttax+ " dollars");
            //total of all items without tax
        System.out.println("The total sales tax of all products is "+totaltax+ " dollars");
            //total of all the sales tax
        System.out.println("The cost of total items with added sales tax is " +totalwithtax+ " dollars");
            //total of all items with sales tax
            
        }   //end main method
    }   //end class
    