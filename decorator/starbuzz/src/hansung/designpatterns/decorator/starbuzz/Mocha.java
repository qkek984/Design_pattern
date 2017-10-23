package hansung.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
