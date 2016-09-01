package chainofresponsibilities;

public class DeliverMediumPackage implements ChainOfDelivery {

	private ChainOfDelivery nextInTheChainDelivery;
	
	public void setNextChain(ChainOfDelivery nextInTheChainDelivery) {
		this.nextInTheChainDelivery = nextInTheChainDelivery;
	}

	public void deliver(Package pkg) {
		if(pkg.getWeight() <= 50) {
			System.out.println("(Medium) - Delivering package up to 50 Kilograms");
		} else {
			nextInTheChainDelivery.deliver(pkg);
		}
	}

}
