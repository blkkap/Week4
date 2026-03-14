//project name: Jelly bean game 

//Description: makes user guess how many jelly beans 


package week_4;
import java.util.Scanner;
import java.util.Random;

public class jellybeangame {

	public static void main(String[] args) {
		int numOfBeans = 0;       //Number of jellybeans in jar
        int guess = 0;                 //The user's guess
        int userguess=0;
        char ch ='y';
        
        
        while (ch =='y'|| ch =='Y') {
		 Random gen = new Random() ;
		 Scanner scan = new Scanner (System.in);

		//randomly generate the number of jellybeans in jar
	     numOfBeans = gen.nextInt(999) +1;

		System.out.println("There are between 1 and 1000 jellybeans in the jar.");
		System.out.println("How many do you think are in the jar?");
		
    //while(another == "Y") 
   	
	do
    {
	    //prompt user and read in guess 
		 System.out.print("Enter your guess: ");
		 guess = scan.nextInt();
		 
		 userguess++;
		//if the guess is wrong display message
		 if(guess < numOfBeans) 
			 System.out.println("Too low");
			 
		 
		 else if(guess > numOfBeans) 
			 System.out.println("Too high");
    }	 
		 
	     

   // if the guess is correct display message 
	       while (guess != numOfBeans);
	
	        System.out.println(" Good job it took you " + userguess++ + " guesses");
	        
	        System.out.print("would you like to play again(y or n):");
  	         ch =scan.next().charAt(0);
 }
	         System.out.print("see you later");
   	  
}
}



//There are between 1 and 1000 jellybeans in the jar.
//How many do you think are in the jar?
//Enter your guess: 500
//Too low
//Enter your guess: 600
//Too high
//Enter your guess: 550
//Too low
//Enter your guess: 560
//Too low
//Enter your guess: 580
//Too low
//Enter your guess: 590
//Too low
//Enter your guess: 600
//Too high
//Enter your guess: 599
//Too high
//Enter your guess: 598
//Too high
//Enter your guess: 595
//Too low
//Enter your guess: 596
// Good job it took you 11 guesses
//would you like to play again(y or n):n
//see you later 		 
     	  
        	
   	   
    
	


