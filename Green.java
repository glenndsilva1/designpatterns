package patterns.bridge;

public class Green extends Color{
	Green(Shape shape) {
		super(shape);
	}

	@Override
	public void fill() {
		this.shape.draw();
		System.out.println("Fill with Green Color");
	}
}
