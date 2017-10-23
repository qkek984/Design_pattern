package hansung.designpatterns.factory.pizzaaf;


public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore koreaStore = new KoreaPizzaStore();//선언

		Pizza pizza = koreaStore.orderPizza("cheese");
		System.out.println("Korea ordered a " + pizza + "\n");
		pizza = koreaStore.orderPizza("clam");
		System.out.println("Korea ordered a " + pizza + "\n");
		pizza = koreaStore.orderPizza("pepperoni");
		System.out.println("Korea ordered a " + pizza + "\n");
		pizza = koreaStore.orderPizza("veggie");
		System.out.println("Korea ordered a " + pizza + "\n");


		pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
