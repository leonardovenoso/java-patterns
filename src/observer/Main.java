package observer;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.attach(new UpperPanelObserver());
		subject.attach(new BottomPanelObserver());
		subject.attach(new LeftPanelObserver());
		subject.attach(new RightPanelObserver());
		
		subject.setState(new String("Hello World"));
	}

}
