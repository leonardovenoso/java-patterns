package chainofresponsibilities;

public class Main {

	public static void main(String[] args) {		
		ChainOfDelivery deliverSmallPackage = new DeliverSmallPackage();
		ChainOfDelivery deliverMediumPackage = new DeliverMediumPackage();
		ChainOfDelivery deliverBigPackage = new DeliverBigPackage();
		ChainOfDelivery deliverContainer = new DeliverContainer();

		deliverSmallPackage.setNextChain(deliverMediumPackage);
		deliverMediumPackage.setNextChain(deliverBigPackage);
		deliverBigPackage.setNextChain(deliverContainer);
		
		deliverSmallPackage.deliver(new Package(40));
	}

}
