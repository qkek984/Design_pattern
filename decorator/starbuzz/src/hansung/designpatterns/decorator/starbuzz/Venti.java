package hansung.designpatterns.decorator.starbuzz;

public class Venti extends CondimentDecorator {

    public Venti(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        if (!(beverage instanceof CondimentDecorator)){
            return beverage.getDescription() + ", 벤티 사이즈";
        }
        return beverage.getDescription();
    }

    public double cost() {
        if (!(beverage instanceof CondimentDecorator)){
            return 3* beverage.cost();
        }
        return beverage.cost();
    }
}
