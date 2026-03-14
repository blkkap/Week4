//Project name: loop concept

//Description: Ask user for a value and prints out times table until user enter value to stop it 





package week_4;
import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		int size =1;
		int value;
		Scanner scan = new Scanner (System.in);
		int sum;
		

		 while (size != 0) {
		//read in size of multiplication table
		System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
		size = scan.nextInt();
        
		if(size == 0)
			System.out.print("Done");
		
		else if(size < 1 || size > 5)
			System.out.println("Try again number not valid enter number from 1-5 (0 to quit )");
		
		else {
		
		//using a for loop, display the top header row of numbers
		System.out.print("\t");
		for (int horiz = 1; horiz <= size; horiz++)
		{    System.out.print(horiz + "\t");    }

		System.out.println();

		
		//using a for loop, display the top header row underline (use a dash)
		System.out.print("\t");
		for (int horiz = 1; horiz <= size; horiz++)
		{    System.out.print("-" + "\t");		}

		System.out.println();
		
		
		
		/* using a nested for loop create the rest of the table */
			System.out.print("\t");
		
			
		   for (int row = 1; row <= size; row++) {
			    System.out.print("\n" +row + "|");
		
			 for (int col =1; col <= size; col++ ) {
					System.out.print("\t" + row*col );
					
					
				}
			 
			System.out.println();
     }
   }
 }
	}
}

//Please enter the table size from 1 to 5 (0 to quit): 3
//1	2	3	
//-	-	-	

//1|	1	2	3

//2|	2	4	6

//3|	3	6	9
//Please enter the table size from 1 to 5 (0 to quit): 10
//Try again number not valid enter number from 1-5 (0 to quit )
//Please enter the table size from 1 to 5 (0 to quit): 
//0
//Done			



