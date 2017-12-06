package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class DecoyDuck implements Quackable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	//Observable observable;

	public DecoyDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observers.add(observer);
		//observable.registerObserver(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(this);
		}
		//observable.notifyObservers();
	}
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
	public String toString() {
		return "Decoy Duck";
	}
}
