package sheet7EmployeeAndClockClasses;

public class EmployeeMain {

	public static void main(String[] args) {
	
	Employee e1 = new Employee();
	System.out.println(e1);
	Employee e2 = new Employee("Ewelina", 21, 3, 3000);
	System.out.println(e2);
	Employee e3 = new Employee();
		e3.setName("Pat Flynn");
		e3.setAge(20);
		e3.setNoOfSickDays(15);
		e3.setSalary(70000);
		System.out.printf("\nName: %s\nAge: %d\nNumber of sick days: %d\n", e3.getName(), e3.getAge(), e3.getNoOfSickDays());
		System.out.println("Salary: "+ e3.getSalary() + "\nNewSalary: " + e3.getIncreaseSalary(1.2));
		
	System.out.println();	
	
	Employee e4 = new Employee("Mary Jones");
	System.out.println(e4.getEmployeeNo() +"\nName: "+ e4.getName());
	
	Employee e5 = new Employee("Suzanne Cash", 45, 1, 6000);
	System.out.println(e5);
	
	Employee e6 = new Employee ("James Bond", 57, 15, 1200);
	System.out.println(e6);
	
	}
}
