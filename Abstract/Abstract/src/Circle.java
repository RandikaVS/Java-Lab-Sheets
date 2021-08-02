
public class Circle extends Shape {
		double radius=14;
		
		public Circle(double r) {
			this.radius=r;
		}
		@Override
	public double getArea() {
		return 3.14*radius*radius;
	}
}
