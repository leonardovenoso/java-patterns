package composite;

public class Main {

	public static void main(String[] args) {
		Person mother = new Person("Marta");
		Person son1 = new Person("Leo");
		Person son2 = new Person("Brijesh");
		Person son3 = new Person("Marcus");
		
		mother.addChildren(son1);
		mother.addChildren(son2);
		mother.addChildren(son3);
		
		System.out.println(mother.toJSONString());
	}

}
