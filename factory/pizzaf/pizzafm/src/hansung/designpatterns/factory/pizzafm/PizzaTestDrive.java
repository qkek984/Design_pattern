package hansung.designpatterns.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore koreaStore = new KoreaPizzaStore();//한국 피자지점 추가

		Pizza pizza = koreaStore.orderPizza("cheese");//Korea cheese
		System.out.println("Korea ordered a " + pizza + "\n");

		pizza = koreaStore.orderPizza("clam");//Korea clam
		System.out.println("Korea ordered a " + pizza + "\n");

		pizza = koreaStore.orderPizza("pepperoni");//Korea pepperoni
		System.out.println("Korea ordered a " + pizza + "\n");

		pizza = koreaStore.orderPizza("veggie");//Korea veggie
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
