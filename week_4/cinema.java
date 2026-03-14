//Project name: loop concept

//Description: Enhanced cinema loops until user stops it with value 


package week_4;
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class cinema {

	public static void main(String[] args) {
		//tools
				Scanner scan = new Scanner(System.in);
				NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
				//Random gen = new Random();
				
				//variables
				double price;
				int age;
				double senior =0.00;
				 //age = gen.nextInt(100);
				
				System.out.print("Please enter your cinema ticket price:");
				price =scan.nextDouble();
				System.out.print("Your age (0 to quit): " );
				age = scan.nextInt(); //thought you wanted the user input on this part good thing i reread it.
				
				
				double halfoff = price/2;
			 
				while (age != 0) {
					
					System.out.println("Your age:" + age);
					
					if ( age < 5) 
						System.out.println("Your ticket is free");
					
						
					else if (age > 5 & age <= 12) 
							System.out.println("Your ticket price is: " + fmt1.format(halfoff) + " which is halfoff");
						
					else if  (age >13 & age < 54) 
							System.out.println("Your ticket price is: " + fmt1.format(price) + " which is full price");
						
					else if (age > 54) 
							System.out.println("Your ticket price is: " +fmt1.format(senior) + " which is free");
					
					System.out.print("Enter your age (0 to quit): ");
					age =scan.nextInt();
				
				}
					
						
				  System.out.println("Good bye");	
				
			}
						
	               	
	 }		 
	

//Please enter your cinema ticket price:15.00
//Your age (0 to quit): 10
//Your age:10
//Your ticket price is: $7.50 which is halfoff
//Enter your age (0 to quit): 21
//Your age:21
//Your ticket price is: $15.00 which is full price
//Enter your age (0 to quit): 0
//Good bye
	


