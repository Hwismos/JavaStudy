package part2;

public class Cat extends Animal{
	private String name;
	
	public Cat() {
		super();
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("고양이가 먹는다.");
	}

	@Override
	public void move() {
		System.out.println("고양이가 이동한다.");
	}
	
	public void cute() {
		System.out.println("잠깐, 고양이는 귀엽다.");
	}
	
	@Override
	public String toString() {
		return "이 고양이의 이름은 " + this.name;
	}
}
