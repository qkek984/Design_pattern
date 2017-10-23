package hansung.designpatterns.decorator.starbuzz;

public class Water extends CondimentDecorator {

    public Water(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 물";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}