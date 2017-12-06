package headfirst.designpatterns.combining.observer;

import java.util.Observable;

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	@Override
	public void update(Observable o, Object arg) {
		update((QuackObservable)o);

	}

	public String toString() {
		return "Quackologist";
	}
}
