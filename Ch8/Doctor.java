//Project name: Doctor java

//Description: Doctor class





package Ch8;
import java.util.Random;

public class Doctor extends HospitalEmployee {
	private String specialty;
	
	public Doctor(String eName, int eNumber, double hours, double pay, String special) {
		super(eName,eNumber,hours,pay);
		
		this.specialty = special;
		
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String special) {
		specialty = special;
		
	}
	public double calculateBonus(String shift) {
		double bonusval = 0.00;
		if(shift.equals("night shift"))	{
			bonusval = super.calculateBonus(10);
		}
		else if(shift.equals("evening shift")) {
			bonusval = super.calculateBonus(5);
		}
		return bonusval;
}
	public String createLogin() {
		Random ran = new Random();
		
		int num = ran.nextInt(9);
		
		String str = this.getEmpName().substring(0,2) + Integer.toString(num) + Integer.toString(this.getEmpNumber());
		
		return str;
	}
	public String toString() {
		String str = super.toString();
		str = str + "\tspecialty: " + getSpecialty();
		return str;
	}
}
