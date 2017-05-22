package sheet5CreatingClasses;

public class Ex5Computer {

	private int ram;
	private double hardDrive;
	private int opSys;
	private int monSize;
	private double cost;

	public static final int RAM_4 = 4;
	public static final int RAM_8 = 8;
	public static final int RAM_16 = 16;

	public static final double HARD_DRIVE_2_5 = 2.5;
	public static final double HARD_DRIVE_3_5 = 3.5;

	public static final int OP_SYS_32 = 32;
	public static final int OP_SYS_64 = 64;


	
	public static final int M_SIZE_17 = 17;
	public static final int M_SIZE_18 = 18;
	public static final int M_SIZE_19 = 19;
	public static final int M_SIZE_20 = 20;
	public static final int M_SIZE_21 = 21;

	Ex5Computer(){
	//defaults
		ram = 4;
		hardDrive = 2.5;
		opSys = 32;
		monSize = 17;
		cost = 350;
		
		
	}

	Ex5Computer (int ram, double hardDrive, int opSys, int monSize){
		this();
		setRam(ram);
		setHardDrive(hardDrive);
		setOpSys(opSys);
		setMonSize(monSize);
		calculateCost();

	}
	public void setRam(int ram){
		if (ram == RAM_4 || ram == RAM_8 || ram == RAM_16)
			this.ram = ram;
		else
			System.out.println("Invalid RAM, set to default.");
	}	

	public void setHardDrive (double hardDrive){
		if (hardDrive == HARD_DRIVE_2_5 || hardDrive == HARD_DRIVE_3_5 )
			this.hardDrive = hardDrive;
		else
			System.out.println("Invalid Hard Drive, set to default.");
	}	

	public void setOpSys (int opSys){
		if (opSys == OP_SYS_32 || opSys == OP_SYS_64)
			this.opSys = opSys;
		else 
			System.out.println("Invalid Operating System, set to default.");
	}

	public void setMonSize(int monSize){
		if (monSize>=17 && monSize <= 21)
			this.monSize = monSize;
		else
			System.out.println("Invalid Monitor Size, set to default.");	
	}
	
	/*public void setCost(){                     its possible to do this way and then getCost(){
	 												return cost} but setCost() should be called on the top of
	 												toString method.
		if (ram == RAM_8)
			this.cost = cost + 60;
		else if (ram == RAM_16)
			this.cost = cost + 90;
		if(hardDrive == HARD_DRIVE_3_5)
			this.cost = cost + 40;
		if (opSys == OP_SYS_64)
			this.cost = cost + 60;
		if (monSize == M_SIZE_18)
			this.cost = cost + 20;
		else if (monSize == M_SIZE_19)
			this.cost = cost + 30;
		else if (monSize == M_SIZE_20)
			this.cost = cost + 40;
		else if (monSize == M_SIZE_21)
			this.cost = cost + 50;
		}*/



	public int getRam(){
		return ram;
	}

	public double getHardDrive(){
		return hardDrive;
	}

	public int getOpSys(){
		return opSys;
	}

	public int getMonSize(){
		return monSize;
	}
	
	public double calculateCost(){                    
		cost = 350;
		if (ram == RAM_8)
			cost += 60;
		else if (ram == RAM_16)
			cost += 90;
		if(hardDrive == HARD_DRIVE_3_5)
			cost += 40;
		if (opSys == OP_SYS_64)
			cost += 60;
		if (monSize == M_SIZE_18)
			cost += 20;
		else if (monSize == M_SIZE_19)
			cost += 30;
		else if (monSize == M_SIZE_20)
			cost += 40;
		else if (monSize == M_SIZE_21)
			cost += 50;
		return cost;
	}
	public String toString(){
		return "RAM: " + ram + "\nHard Drive: " + hardDrive +
				"\nOperating System: " + opSys +
				"\nMonitor size: " + monSize + " inches" +
				"\nTotal cost: " + calculateCost();
	}
}	






