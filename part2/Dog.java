package part2;

public class Dog extends Animal{

	public Dog() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("개가 먹는다.");
	}
	
	public void protect() {
		System.out.println("개가 집을 지키다.");
	}

	@Override
	public String toString() {
		return "Dog 객체";
	}
	
}
