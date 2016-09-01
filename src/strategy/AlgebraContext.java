package strategy;

import strategy.AlgebraStrategy;

public class AlgebraContext {

	private AlgebraStrategy algebraStrategy;
	
	public AlgebraContext(AlgebraStrategy strategy) {
		algebraStrategy = strategy;
	}
	
	public int execute(int num1, int num2) {
		return this.algebraStrategy.doOperation(num1, num2);
	}

}
