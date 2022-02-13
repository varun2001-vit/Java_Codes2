package single_level;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.bark();
		d.eat();
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