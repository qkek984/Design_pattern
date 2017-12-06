package headfirst.designpatterns.combining.observer;

public class RubberDuck extends java.util.Observable implements Quackable {
	//Observable observable;

	public RubberDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		setChanged();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		super.notifyObservers();
	}

	public String toString() {
		return "Rubber Duck";
	}
}
