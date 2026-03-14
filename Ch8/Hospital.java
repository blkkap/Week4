//Project name: Hospital java

//Date: 13/07/21
//Description: Tester for Doctor and HospitalEmployee class



package Ch8;

public class Hospital {

	public static void main(String[] args) {
		HospitalEmployee luke = new HospitalEmployee("Luke Skywalker", 5432,40,20.50);
		System.out.println("Welcome to our hospital");
		System.out.println("========================");
		System.out.println(" ");
		
		
		System.out.println("Beginning state of Luke :");
		System.out.println(luke.toString());
		
		System.out.println(luke.getEmpName() + " is a satisfactory HospitalEmployee. Bonus = $" 
				+ luke.calculateBonus("satisfactory"));
		
		System.out.println(" ");
		Doctor darth = new Doctor("Darth Vader",9876,17,150.00,"Plastic Surgery");
		System.out.println("Beginning state of Darth :");
		System.out.println(darth.toString());
		
		System.out.println(darth.getEmpName() + " is a Doctor and works the evening shifts. Bonus = $" 
				+ darth.calculateBonus("evening shift"));
		
		System.out.println(darth.getEmpName()+"'s login is: " + darth.createLogin());
		
		System.out.println(" ");
		System.out.println("Number of HospitalEmployees created : " 
				+ HospitalEmployee.getHospitalEmployeeCount());
		System.out.println("Goodbye");
				

	}

}

//Welcome to our hospital
//========================
 
//Beginning state of Luke :
//empName: Luke Skywalker	 empNumber: 5432	hoursWorked: 40.0	payRate: $20.50
//Luke Skywalker is a satisfactory HospitalEmployee. Bonus = $300.0
 
//Beginning state of Darth :
//empName: Darth Vader	 empNumber: 9876	hoursWorked: 17.0	payRate: $150.00	specialty: Plastic Surgery
//Darth Vader is a Doctor and works the evening shifts. Bonus = $127.5
//Darth Vader's login is: Da69876
 
//Number of HospitalEmployees created : 2
//Goodbye
