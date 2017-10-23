package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Sea on 2017-09-27.
 */
public class KoreaPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new KoreaStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new KoreaStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new  KoreaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new  KoreaStylePepperoniPizza();
        } else return null;
    }
}

