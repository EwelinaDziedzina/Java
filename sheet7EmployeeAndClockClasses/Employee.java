package sheet7EmployeeAndClockClasses;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private int noOfSickDays;
	private int employeeNo;
	
	
	
	
	public static int employeeCounter=1;
	
	
	public Employee(){
		employeeNo = employeeCounter++;
	}
	
	public Employee(String name){
		this();
		this.name = name;
		
	}
	
	public Employee(String name, int age, int noOfSickDays, double salary){
		this();
		this.name=name;
		setAge(age);
		setNoOfSickDays(noOfSickDays);
		setSalary(salary);
		
		
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		if (age > 18 && age <65)
			this.age = age;
		else
			System.out.println("Invalid age entered");
	}
	public int getAge(){
		return age;
	}
	
	public void setNoOfSickDays(int noOfSickDays){
		
		if (noOfSickDays>=0 && noOfSickDays <=30)
		this.noOfSickDays = noOfSickDays;
	}
	
	public int getNoOfSickDays(){
		return noOfSickDays;
	}
	public int getEmployeeNo(){
		return employeeNo;
	}
	public void setSalary(double salary){
		double dailySalary = salary/30;
		if (age<18){
			this.salary = 0;
			System.out.println("Salary not calculated for employee under 18 years old.");
		}
		else
			this.salary = salary - noOfSickDays * dailySalary;
			
	}
	public double getSalary(){
		return salary;
	}

	public double getIncreaseSalary (double increasement){
			return (getSalary() + (getSalary()* increasement));
	}
	
		
	public String toString(){
		
		return String.format("\nEmployee no: %d\nName: %s\nAge: %d\nNumber of sick days: %d\nSalary: €%.2f\n", 
				employeeNo, name, age, noOfSickDays, getSalary());
	}
}
