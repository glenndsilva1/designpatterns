package patterns.bridge;

public abstract class Color {
	Shape shape;
	
	Color(Shape shape){
		this.shape = shape;	
	}
	
	public abstract void fill();
}
