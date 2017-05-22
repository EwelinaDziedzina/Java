package sheet5CreatingClasses;

public class Ex5ComputerMain {

	public static void main(String[] args) {
			
		Ex5Computer c1 = new Ex5Computer(Ex5Computer.RAM_4, Ex5Computer.HARD_DRIVE_3_5, Ex5Computer.OP_SYS_64,
						Ex5Computer.M_SIZE_21);
		System.out.println(c1);
		
		Ex5Computer c2 = new Ex5Computer();
		System.out.println(c2);
		
		Ex5Computer c3 = new Ex5Computer(Ex5Computer.RAM_16, Ex5Computer.HARD_DRIVE_2_5, Ex5Computer.OP_SYS_64, 
				          Ex5Computer.M_SIZE_20);
		System.out.println(c3);
		
		System.out.println("******************************************************");
		
		Ex5Computer [] pcArray ={c1, c2, c3};
		
		printArray(pcArray);
		
		System.out.println("******************************************************");
		
		for(int i = 0; i<pcArray.length; i++)
			if (pcArray[i].calculateCost()>400)
				System.out.println(pcArray[i]);
	}
		public static void printArray(Ex5Computer  [] pcArray ){
			for(Ex5Computer pc: pcArray){
				System.out.println(pc);	
			}
		}
}
