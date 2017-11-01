package hansung.designpatterns.templatemethod.barista;


public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		DutchCoffeeWithHook dutchCoffeeHook = new DutchCoffeeWithHook();//더치커피 선언 할당
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();

		System.out.println("\nMaking dutch coffee...");
		dutchCoffeeHook.prepareRecipe();//더치커피 템플릿 메소드
	}
}
