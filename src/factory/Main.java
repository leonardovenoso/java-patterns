package factory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory.getShape("Circle").draw();
		ShapeFactory.getShape("Square").draw();
		ShapeFactory.getShape("Rectangle").draw();
		ShapeFactory.getShape("NoShape").draw();

	}
}
