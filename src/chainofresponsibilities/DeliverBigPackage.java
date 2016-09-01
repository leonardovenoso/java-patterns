package chainofresponsibilities;

public class DeliverBigPackage implements ChainOfDelivery {

	private ChainOfDelivery nextInTheChainDelivery;
	
	public void setNextChain(ChainOfDelivery nextInTheChainDelivery) {
		this.nextInTheChainDelivery = nextInTheChainDelivery;
	}

	public void deliver(Package pkg) {
		if(pkg.getWeight() <= 100) {
			System.out.println("(Big) - Delivering package of 50 Kilograms");
		} else {
			nextInTheChainDelivery.deliver(pkg);
		}
	}

}
