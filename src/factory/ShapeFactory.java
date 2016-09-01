package factory;

public class ShapeFactory {

	public static Shape getShape(String name) {
		try {
			return (Shape)Class.forName("factory." + name).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return new NoShape();
	}

}
