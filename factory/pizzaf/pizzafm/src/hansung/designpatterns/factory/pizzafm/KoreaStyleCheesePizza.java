package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Sea on 2017-09-27.
 */
public class KoreaStyleCheesePizza extends Pizza {

    public KoreaStyleCheesePizza() {
        name = "Korea Style Normal Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Kimchi Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}