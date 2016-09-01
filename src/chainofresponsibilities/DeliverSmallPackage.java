package chainofresponsibilities;

public class DeliverSmallPackage implements ChainOfDelivery {

	private ChainOfDelivery nextInTheChainDelivery;
	
	public void setNextChain(ChainOfDelivery nextInTheChainDelivery) {
		this.nextInTheChainDelivery = nextInTheChainDelivery;
	}

	public void deliver(Package pkg) {
		if(pkg.getWeight() <= 20) {
			System.out.println("(Small) - Delivering package up to 20 Kilograms");
		} else {
			nextInTheChainDelivery.deliver(pkg);
		}
	}

}
