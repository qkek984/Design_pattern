package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Sea on 2017-09-27.
 */
public class KoreaStyleClamPizza extends Pizza {
    public KoreaStyleClamPizza() {
        name = "Korea Style Normal Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Kimchi Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}