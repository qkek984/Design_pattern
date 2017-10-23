package hansung.designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "다크 로스트 커피";
	}
 
	public double cost() {
		return 0.99;
	}
}

