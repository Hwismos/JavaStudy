package part2;

public class Dog extends Animal{

	public Dog() {
		super();
	}

	@Override
	public void eat() {
		System.err.println("개가 먹는다.");
	}
	
	
}
