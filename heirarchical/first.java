package heirarchical;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c = new cat();
		c.eat();
		c.meow();
		dog d = new dog();
		d.eat();
		d.bark();
	}

}
class animal{
	public void eat() {
		System.out.println("Eating");
	}
}
class dog extends animal{
	public void bark() {
		System.out.println("Barking");
	}
}
class cat extends animal{
	public void meow() {
		System.out.println("Meowing");
	}
}