package InheritancePizza;

public class MainForPizza {

	public static void main(String[] args) {
		
		
		
		Pizza p1 = new Pizza (new String []{"cheese", "mushrooms", "olives", "tomato"}, PizzaSize.SMALL);
		System.out.println(p1);
		
		
		Pizza p2 = new Pizza(new String [] {"cheese", "ananas", "chicken", "sweet corn"}, PizzaSize.LARGE);
		System.out.println(p2);
		
		
		
		Customer c1 = new Customer ("Emily Jones", "Dublin 8", 12345, new Pizza [] {p1, p2});
		System.out.println(c1);
		

		Pizza p3 = new Pizza (new String [] {"tomato", "cheese", "ham", "olives", "mushrooms", "onion", "jalapeno"}, PizzaSize.MEDIUM);
		System.out.println(p3);
		
		Pizza p4 = new Pizza (new String [] {"mozzarella", "red pepper", "olives", "ham", "feta", "salame"}, PizzaSize.EXTRA_LARGE);
		System.out.println(p4);
		
		Pizza p5 = new Pizza (new String [] {"tomato", "garlic", "mushrooms"}, PizzaSize.SMALL);
		System.out.println(p5);
		
		Customer c2 = new Customer ("James Born", "Dublin 2", 854788887, new Pizza [] {p3, p4, p5});
		System.out.println(c2);
		
	}
}
