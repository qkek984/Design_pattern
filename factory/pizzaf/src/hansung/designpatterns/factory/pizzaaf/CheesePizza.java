package hansung.designpatterns.factory.pizzaaf;


public class CheesePizza extends Pizza {
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
