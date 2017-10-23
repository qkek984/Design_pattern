package hansung.designpatterns.decorator.starbuzz;

public class Soy extends CondimentDecorator {


	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
