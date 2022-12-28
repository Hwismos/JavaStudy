package part2;

public class Animal {
	private String name;
	private int age;
	
	// getter, setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// 생성자 메소드
	public Animal() {
		super();
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void move() {
		System.out.println("이동한다.");
	}
}
