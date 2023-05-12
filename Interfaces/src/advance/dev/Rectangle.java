package advance.dev;

public class Rectangle extends Shape{
	private double dai, rong;
	
	public Rectangle(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (dai + rong);
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return dai * rong;
	}

	@Override
	public String toString() {
		return "Rectangle [chuVi()=" + chuVi() + ", dienTich()=" + dienTich() + "]";
	}
	

}
