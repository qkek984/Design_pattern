package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Sea on 2017-09-27.
 */
public class KoreaStyleVeggiePizza extends Pizza {
    public KoreaStyleVeggiePizza() {
        name = "Korea Style Normal Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Kimchi Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
