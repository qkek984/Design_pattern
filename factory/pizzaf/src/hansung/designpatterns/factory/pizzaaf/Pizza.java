package hansung.designpatterns.factory.pizzaaf;


public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	Meat meat;

	PizzaIngredientFactory ingredientFactory;
	
	public Pizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append("\t");
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append("\t");
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append("\t");
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			result.append("\t");
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append("\t");
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append("\t");
			result.append(pepperoni);
			result.append("\n");
		}
		if (meat != null) {
			result.append("\t");
			result.append(meat);
			result.append("\n");
		}
		return result.toString();
	}
}
