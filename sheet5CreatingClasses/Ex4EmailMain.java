package sheet5CreatingClasses;

public class Ex4EmailMain {

	public static void main(String[] args) {
	
		Ex4Email e1 = new Ex4Email();
		e1.setEmail("ewelina-213@wp.pl");
		e1.setPassword("ewelina");
		e1.setStorage(Ex4Email.GB_100);
		System.out.println(Ex4Email.id+"."+"\nemail: " + e1.getEmail() + "\npassword: " + e1.getPassword() + 
				"\nmax storage: "+ e1.getStorageString());
		System.out.println();
		
		Ex4Email e2 = new Ex4Email("ewelina_dziedzina@wp.pl", "123456", 8);
		System.out.println(e2);
		
		System.out.println();
		
		Ex4Email e3 = new Ex4Email ("abcdgmail.com", "1234567", Ex4Email.MB_50);
		System.out.println(e3);
		
		System.out.println();
		
		Ex4Email e4 = new Ex4Email("qwer.ty@br", "00000zaqlal", 1);
		System.out.println(e4);
	}
}
