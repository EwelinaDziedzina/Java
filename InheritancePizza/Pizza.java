package InheritancePizza;


public class Pizza {

	public String [] toppings; 
	public PizzaSize pizzaSize;
	
	
	
	public Pizza (){
	}
	
	public Pizza(String [] toppings, PizzaSize pizzaSize){
		this.toppings = toppings;
		this.pizzaSize = pizzaSize;
		calculatePrice();
	}
	
	public String[] getToppings() {
		return toppings;
	}
	
	public void setToppings(String [] toppings) {
		this.toppings = toppings;
	}
	
	public double calculatePrice() {
		
		return pizzaSize.getBasePrice() + (pizzaSize.getPricePerTopping() * toppings.length);
	}
	
	public String toString(){
		/*return "\nPizza Size: " + pizzaSize +
				"\nToppings: " + Arrays.toString(toppings) +
				String.format("\nPrice: €%.2f", calculatePrice());*/
	
		
				String text = "\nPizza Size: " + pizzaSize + "\nToppings: ";
				
				 
				for(int i = 0; i<toppings.length; i++){
					if(i<toppings.length-1)
						text += toppings [i] + ", ";
					else
						text +=toppings[i];
				}
				
				//for(String one : toppings)
				//	text += one + " / ";
				
				text += String.format("\nPrice: €%.2f", calculatePrice());
				
				return text;
				
	}
}
