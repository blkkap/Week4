//Project name: SupremeDriver java

//Date:13/07/21

//Description: tester for GPU and CPU


package Ch8;

public class SupremeDriver {

	public static void main(String[] args) {
		CPU intel = new CPU("Intel", "i7", 8,399.99);
		CPU amd = new CPU("AMD", "Ryzen 9 5900x", 12,549.00);
		
		System.out.println("Welcome to J Electronics");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println(" ");
		
		System.out.println("Cpu specs: ");
		System.out.println(intel.toString());
		System.out.println(amd.toString());
		
		
		System.out.println(" ");
		GPU RTX = new GPU("RTX Nvidia","3080",8704,699.00,10);
		GPU Radeon = new GPU("AMD Radeon","RX 6900 XT",5120,1402.00,16);
		System.out.println("GPU specs: ");
		System.out.println(RTX.toString());
		System.out.println(Radeon.toString());
		
	}

}

//Welcome to J Electronics
//++++++++++++++++++++++++++
 
//Cpu specs: 
//compName: Intel	 Processor: i7	numOfCores: 8	cost: $399.99
//compName: AMD	 Processor: Ryzen 9 5900x	numOfCores: 12	cost: $549.00
 
//GPU specs: 
//compName: RTX Nvidia	 Processor: 3080	numOfCores: 8704	cost: $699.00	Vram: 10
//compName: AMD Radeon	 Processor: RX 6900 XT	numOfCores: 5120	cost: $1,402.00	Vram: 16
