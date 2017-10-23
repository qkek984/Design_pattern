package hansung.designpatterns.factory.pizzaaf;

/**
 * Created by Sea on 2017-09-27.
 */
public class KoreaPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new CheapThickCrustDough();
    }//더 값싼 재료로 변경

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new CheapMozzarellaCheese();
    }//더 값싼 재료로 변경

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant(),
                new Kimchi(),//야채에 김치 추가
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }

    public Meat createMeat() {
        return new Dog();
    }
}
