package Exceptions;

public class MainEmployeeAgeException {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeAgeException e1 = new EmployeeAgeException();
		System.out.println(e1);
		

		try{
		EmployeeAgeException e2 = new EmployeeAgeException("Ewelina", 20, 3, 3000);
		System.out.println(e2);
		} catch (InvalidAgeException e){
			e.printStackTrace();
		} 
		
		EmployeeAgeException e3 = new EmployeeAgeException();
			e3.setName("Pat Flynn");
			try {
				e3.setAge(16);
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
			e3.setNoOfSickDays(15);
			e3.setSalary(70000);
			System.out.printf("\nName: %s\nAge: %d\nNumber of sick days: %d\n", e3.getName(), e3.getAge(), e3.getNoOfSickDays());
			System.out.println("Salary: "+ e3.getSalary() + "\nNewSalary: " + e3.getIncreaseSalary(1.2));
			
		System.out.println();	
		
	
		
		
		
		}
	}
	
