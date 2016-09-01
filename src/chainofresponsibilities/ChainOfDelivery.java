package chainofresponsibilities;

public interface ChainOfDelivery {

	public void setNextChain(ChainOfDelivery chainOfDelivery);
	public void deliver(Package pkg);

}
