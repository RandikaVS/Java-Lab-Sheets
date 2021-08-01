
abstract class Animal {
	public void eat() {
		System.out.println("I am Eating ");
	}
	abstract public void makeSound();


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
	}
}