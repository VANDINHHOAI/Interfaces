package advance.dev;

import java.util.Scanner;

public class MainApp implements IShape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp app = new MainApp();
		Shape[] shapes = new Shape[10];
		
		app.input(shapes);
		
		app.print(shapes);
		
		Shape maxAreaShape = app.findMaxAreaShape(shapes);
		System.out.println("Hinh co dien tich lon nhat la: ");
		System.out.println(maxAreaShape);
		
		app.findMaxAreaOfEachShape(shapes);
	}

	private void findMaxAreaOfEachShape(Shape[] shapes) {
		// TODO Auto-generated method stub
		double maxAreaTriangle = 0;
		double maxAreaRectangle = 0;
		double maxAreaCircle = 0;
		
		for (Shape shape : shapes) {
			if (shape instanceof Triangle && shape.dienTich() > maxAreaTriangle) {
				maxAreaTriangle = shape.dienTich();
			}else if (shape instanceof Rectangle && shape.dienTich() > maxAreaRectangle) {
				maxAreaRectangle = shape.dienTich();
			}else if (shape instanceof Circle && shape.dienTich() > maxAreaCircle) {
				maxAreaCircle = shape.dienTich();
			}
		}
		
		System.out.println("Dien tich lon nhat cua tam giac: " + maxAreaTriangle);
		System.out.println("Dien tich lon nhat cua hinh chu nhat: " + maxAreaRectangle);
		System.out.println("Dien tich lon nhat cua hinh tron: " + maxAreaCircle);
	}

	private Shape findMaxAreaShape(Shape[] shapes) {
		// TODO Auto-generated method stub
		Shape maxAreaShape = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i].dienTich() > maxAreaShape.dienTich()) {
				maxAreaShape = shapes[i];
			}
		}
		return maxAreaShape;
	}

	@Override
	public void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhap thong tin tam giac thu " + (i + 1) + ": ");
			System.out.println("Nhap canh a: ");
			double a = sc.nextDouble();
			System.out.println("Nhap canh b: ");
			double b = sc.nextDouble();
			System.out.println("Nhap canh c: ");
			double c = sc.nextDouble();
			
			shapes[i] = new Triangle(a, b, c);
		}
		
		for (int i = 3; i < 6; i++) {
			System.out.println("Nhap thong tin cho hinh chu nhat thu " + (i + 2) + ": ");
			System.out.println("Nhap chieu dai: ");
			double dai = sc.nextDouble();
			System.out.println("Nhap chieu rong: ");
			double rong =  sc.nextDouble();
			
			shapes[i] = new Rectangle(dai, rong);
		}
		
		for (int i = 6; i < 10; i++) {
			System.out.println("Nhap thong tin cho hinh tron thu " + (i + 1) + ": ");
			System.out.println("Nhap ban kinh: ");
			double r = sc.nextDouble();
			
			shapes[i] = new Circle(r);
		}
	}

	@Override
	public void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		System.out.println("Cac hinh da nhap:");
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}
	}

}
