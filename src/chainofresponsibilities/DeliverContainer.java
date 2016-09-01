package chainofresponsibilities;

public class DeliverContainer implements ChainOfDelivery {

	private ChainOfDelivery nextInTheChainDelivery;
	
	public void setNextChain(ChainOfDelivery nextInTheChainDelivery) {
		this.nextInTheChainDelivery = nextInTheChainDelivery;
	}

	public void deliver(Package pkg) {
		if(pkg.getWeight() <= 1000) {
			System.out.println("(Container) - Delivering package up to 1000 Kilograms.");
		} else {
			nextInTheChainDelivery.deliver(pkg);
		}
	}

}