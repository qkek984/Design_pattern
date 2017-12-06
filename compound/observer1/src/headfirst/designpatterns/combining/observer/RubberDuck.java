package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class RubberDuck implements Quackable {
	//Observable observable;
	ArrayList<Observer> observers = new ArrayList<Observer>();
	public RubberDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
		//observable.registerObserver(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(this);
		}
	}
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
	public String toString() {
		return "Rubber Duck";
	}
}
