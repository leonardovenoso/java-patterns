package strategy;

public class Main {

	public static void main(String[] args) {
		AlgebraContext context = new AlgebraContext(new AddStrategy());
		System.out.println(context.execute(3, 3));
		
		context = new AlgebraContext(new SubstractStrategy());
		System.out.println(context.execute(3, 3));
		
		context = new AlgebraContext(new MultiplyStrategy());
		System.out.println(context.execute(3, 3));
	}

}
