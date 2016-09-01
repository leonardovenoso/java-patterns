package observer;
import java.util.ArrayList;

public class Subject {

	protected ArrayList<Observer> observers = new ArrayList<Observer>();
	protected Object state;
	
	public void notifyAllObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
	public Object getState() {
		return this.state;
	}
	
	public void setState(Object state) {
		this.state = state;
		this.notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

}
