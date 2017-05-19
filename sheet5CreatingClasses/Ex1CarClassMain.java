package sheet5CreatingClasses;

public class Ex1CarClassMain {

	public static void main(String[] args) {
		
		System.out.printf("%-12s%-12s%-12s\n", "Make:", "Model:", "Engine Size:");
		System.out.println();
		Ex1CarClass ex1 =  new Ex1CarClass();
		ex1.setMake("Toyota");
		ex1.setModel("Corolla");
		ex1.setEngineSize(1.4);
			System.out.println(ex1);
		
		Ex1CarClass ex2 = new Ex1CarClass("Volkswagen","Sharan", 1.9);
			System.out.println(ex2);
			
		Ex1CarClass ex3 = new Ex1CarClass("Renault", "Clio", 1.9);
			System.out.println(ex3);
			
		Ex1CarClass ex4 = new Ex1CarClass("Renault", "Megan",1.2);
			System.out.println(ex4);
			
		System.out.println();
		
		Ex1CarClass ex5 = new Ex1CarClass("Kia", "Shuma", 1.6);
			System.out.printf("Make : %s, Model: %s, Engine Size: %.2f", ex5.getMake(), ex5.getModel(), 
					ex5.getEngineSize());
	}
}
