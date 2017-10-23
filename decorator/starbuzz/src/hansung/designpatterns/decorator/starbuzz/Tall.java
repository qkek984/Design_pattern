package hansung.designpatterns.decorator.starbuzz;

public class Tall extends CondimentDecorator {

    public Tall(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        if (!(beverage instanceof CondimentDecorator)){
            return beverage.getDescription() + ", 톨 사이즈";
        }
        return beverage.getDescription();
    }

    public double cost() {
        if (!(beverage instanceof CondimentDecorator)){
            return beverage.cost();
        }
        return beverage.cost();
    }
}
