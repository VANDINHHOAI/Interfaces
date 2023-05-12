package advance.dev;

public class Circle extends Shape{
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		return "Circle [chuVi()=" + chuVi() + ", dienTich()=" + dienTich() + "]";
	}

}
