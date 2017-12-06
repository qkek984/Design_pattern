package headfirst.designpatterns.combining.observer;

public class GooseAdapter extends java.util.Observable implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
