package sheet5CreatingClasses;

public class Ex1CarClass {
	
	private String make;
	private String model;
	private double engineSize;
	
	public Ex1CarClass () {
	}
	
	public Ex1CarClass(String make, String model, double engineSize){
		setMake(make);
		setModel(model);
		setEngineSize(engineSize);
		
	}
	
	public void setMake(String make){
		this.make=make;		
	}
	public void setModel(String model){
		this.model=model;		
	}
	public void setEngineSize(double engineSize){
		this.engineSize=engineSize;
	}
	public String getMake(){
	 	return make;
	} 			
	public String getModel(){
		return model;
	} 			
	public double getEngineSize(){
		return engineSize;	
	}
	public String toString(){
	
		return String.format("%-12s%-12s%-12.2f",make, model, engineSize); 
	}
	
	
	
}
