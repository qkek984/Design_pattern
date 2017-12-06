package headfirst.designpatterns.combining.observer;

public class RedheadDuck extends java.util.Observable implements Quackable {
	//Observable observable;

	public RedheadDuck() {
		//observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
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
		return "Redhead Duck";
	}
}
