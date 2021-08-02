
public class Rectangle extends Shape {
	double wid=5,len=5;
	public Rectangle(double w,double l) {
		this.wid=w;
		this.len=l;
	}
	@Override
	public double getArea() {
		return wid*len;
	}

}
