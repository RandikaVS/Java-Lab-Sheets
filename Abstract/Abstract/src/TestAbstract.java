
public class TestAbstract {
	
	public static void main(String args[]) {
		Animal a1=new Dog();
		Animal a2=new Cat();
		Dog d=new Dog();
		Cat c=new Cat();
		a1.eat();
		a1.makeSound();
		a2.eat();
		a2.makeSound();
		d.eat();
		d.makeSound();
		c.eat();
		c.makeSound();
		Shape r1=new Rectangle(5,5);
		Shape c1=new Circle(14);
		System.out.println(r1.getArea());
		System.out.println(c1.getArea());
	}
}
