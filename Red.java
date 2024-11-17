package patterns.bridge;

public class Red extends Color{
	Red(Shape shape) {
		super(shape);
	}

	@Override
	public void fill() {
		this.shape.draw();
		System.out.println("Fill with red color");
	}
	
	public static void main(String args[]) {
		Square square = new Square();
		Color red = new Red(square);
		Color green = new Green(square);
		red.fill();
		green.fill();
	}
}
