package headfirst.designpatterns.combining.observer;

import java.util.Observable;

public interface Observer extends java.util.Observer {
	public void update(QuackObservable duck);

	@Override
	void update(Observable o, Object arg);
}
