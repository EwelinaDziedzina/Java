package sheet5CreatingClasses;

public class Ex5ComputerMain {

	public static void main(String[] args) {
			
		Ex5Computer c1 = new Ex5Computer(Ex5Computer.RAM_16, Ex5Computer.HARD_DRIVE_3_5, Ex5Computer.OP_SYS_64,
						Ex5Computer.M_SIZE_21);
		System.out.println(c1);
		
		Ex5Computer c2 = new Ex5Computer();
		System.out.println(c2);
	}

}
