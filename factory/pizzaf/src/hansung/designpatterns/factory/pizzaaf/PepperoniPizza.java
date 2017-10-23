package hansung.designpatterns.factory.pizzaaf;


public class PepperoniPizza extends Pizza {

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
		meat = ingredientFactory.createMeat();
	}
}
