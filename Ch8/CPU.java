//Project name: CPU java

//Description: CPU class



package Ch8;

import java.text.NumberFormat;

public class CPU {
		private String compName;
		private String Processor;
		private int numOfCores;
		private double cost;
	
	public CPU(){
		compName = "Intel";
		Processor = "i7";
		numOfCores = 0;
		cost = 0;
}
	public CPU(String comp, String series, int cores, double value) {
		compName = comp;
		Processor = series;
		numOfCores = cores;
		cost = value;
	}
	  public void setCompName (String comp)
	   {
	      compName = comp;
	   }
	  public void setProcessor (String series)
	   {
	      Processor = series;
	   }
	  public void setNumOfCores(int cores) {
		  numOfCores = cores;
	  }
	  public void setCost(double value) {
		  cost = value;
	  }
	  public String getCompName() {
		  return compName;
	  }
	  public String getProcessor() {
		  return Processor;
	  }
	  public int NumOfCores() {
		  return numOfCores;
	  }
	  public double Cost() {
		  return cost;
	  }
	  
	  public String toString()
	   {
	      NumberFormat fmt = NumberFormat.getCurrencyInstance();
	      return ("compName: " + compName + "\t Processor: " + Processor + "\tnumOfCores: " +
	       numOfCores + "\tcost: " + fmt.format(cost) );
	   }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
