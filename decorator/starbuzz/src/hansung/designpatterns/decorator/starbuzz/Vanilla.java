package hansung.designpatterns.decorator.starbuzz;

public class Vanilla extends CondimentDecorator {

    public Vanilla(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 바닐라";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}