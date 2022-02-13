package multilevel;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baby_dog b = new baby_dog();
		b.weep();
		b.bark();
		b.eat();
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
class baby_dog extends dog{
	public void weep() {
		System.out.println("Weeping");
	}
}