//Project name: loop concept

//Description: loop concepts



package week_4;

import java.util.Scanner;

public class loopconcept {

	public static void main(String[] args) {
		int value = 0;
		String evenOrOdd = "***";
		String word = "***";
		Scanner scan = new Scanner(System.in);
		System.out.println("Loop Concept Review");
		
		//#1 Using a while loop, write an input validation loop that asks users to enter a positive value
		System.out.println("\n#1. Input validation: ");
		while(value <1) {
			System.out.println("Positive values only : ");
			System.out.println("Enter a value:");
			value = scan.nextInt();
		}
		 System.out.println("Correct " + value + "is a positive number");
		//#2 write a for loop that displays all of the odd numbers, 1 through 19
		System.out.print("\n#2. Odd numbers: ");
		for(int j=1;j<=19;j++) {
			if (j%2==1) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		//#3 write a for loop that displays every fifth number, 0 through 50
		System.out.print("\n#3. Every fifth number: ");
		int j;
		for (j= 0;j <= 50; j++) {
			if(j%5==0) {
				System.out.print(j + " ");	
			}
		}
		System.out.println();
		//#4 write a for loop that counts down from 15 to 0
		System.out.print("\n#4. Count down: ");
		  for(j =15; j>=0;j--) {
			  System.out.print(j + " ");
		  }
		
		/*#5 write a nested for loop that creates a triangle that looks like this
		  
		A
		AA
		AAA
		AAAA
		AAAAA
		
		*/
		System.out.println("\n#5. Cool Triangle:");
		for (int i=1; i<6;i++) {
		 for(int d =0; d<i;d++) {
				System.out.print("A");
			}
		  System.out.println();
		}
		
		
		/*#6 write a while loop that asks the user for value 
		 *   and displays whether the value is even or odd until 
		 *   the user enters a 0. (called a sentinel value)   
		 */
		System.out.println("\n#6. Even or Odd:");
		System.out.print("Enter a value (0 to quit): ");
		value = scan.nextInt();
		while (value !=0) {
			if(value%2==0) {
				System.out.println(value + " is even");
			}
			else {
				System.out.println(value + "is odd");
			}
			System.out.print("Enter a vlaue (0 to quit): ");
			value = scan.nextInt();
		}
		
		
		
		/*#7 Using a do..while loop, ask the user for a word and 
		 * display the word until the user enters either "stop" 
		 * or "STOP" or "Stop" or "sTop" or "stoP".  
		 * (hint: use the String method equalsIgnoreCase)    
		 */
		System.out.println("\n#7. Words!!");
		
		do {
			System.out.print("Enter a word: ");
			word =scan.next();
			System.out.println("The word is :" + word);
		}
			while(!word.equalsIgnoreCase("stop"));
		
		
		System.out.println("\nCompleted the Loop Concept Review");

	}

}


/*
Expected Output.  Yours much match.

Loop Concept Review

#1. Input validation: 
Positive values only.
Please enter a value: -3
Positive values only.
Please enter a value: 0
Positive values only.
Please enter a value: 5
Correct. 5 is a positive number.

#2. Odd numbers: 1 3 5 7 9 11 13 15 17 19 
#3. Every fifth number: 0 5 10 15 20 25 30 35 40 45 50 
#4. Count down: 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 
#5. Cool Triangle:
A
AA
AAA
AAAA
AAAAA

#6. Even or Odd:
Enter a value (0 to quit):13
13 is odd
Enter a value (0 to quit):6
6 is even
Enter a value (0 to quit):0

#7. Words!!
Enter a word:Hello
The word is: Hello
Enter a word:students
The word is: students
Enter a word:stop
The word is: stop

Completed the Loop Concept Review
*/



//MY TEST


//Loop Concept Review

//#1. Input validation: 
//Positive values only : 
//Enter a value:
//-3
//Positive values only : 
//Enter a value:
//0
//Positive values only : 
//Enter a value:
//5
//Correct 5is a positive number

//#2. Odd numbers: 1 3 5 7 9 11 13 15 17 19 

//#3. Every fifth number: 0 5 10 15 20 25 30 35 40 45 50 

//#4. Count down: 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 
//#5. Cool Triangle:
//A
//AA
//AAA
//AAAA
//AAAAA

//#6. Even or Odd:
//Enter a value (0 to quit): 13
//13is odd
//Enter a vlaue (0 to quit): 6
//6 is even
//Enter a vlaue (0 to quit): 0

//#7. Words!!
//Enter a word: java
//The word is :java
//Enter a word: python
//The word is :python
//Enter a word: stop
//The word is :stop

//Completed the Loop Concept Review	
