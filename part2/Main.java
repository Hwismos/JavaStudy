package part2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		
		Animal dogTypedAnimal = new Dog();
		dogTypedAnimal.eat();
		dogTypedAnimal.move();
		
		// Animal 타입의 변수를 자식 클래스 타입으로 다운 캐스팅함
		Dog dogDownCasted = (Dog)dogTypedAnimal;
		dogDownCasted.protect();
		
//		Dog dogTypedDog = new Dog();
//		dogTypedDog.protect();
		
		// 변수 o가 Object 타입
		// Dog 클래스가 Object 클래스의 메소드를 재정의했을 때 o 객체가 접근 가능
		Object o = new Dog();
		System.out.println(o.toString());
		// o.move();
	}

}
