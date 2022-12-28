package part2;

public class Main {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		eat(cat);
		eat(dog);
		
		Animal[] animalArray = new Animal[2];
		animalArray[0] = new Cat("또복");
		animalArray[1] = new Cat("오복");
		
		introduce(animalArray);
	}
	
	public static void eat(Animal a) {
		a.eat();
		if (a instanceof Cat) {
			((Cat)a).cute();
		}
	}
	
	public static void introduce(Animal[] arr) {
		for (Animal animal: arr) {
			System.out.println(animal.toString());
		}
	}

}
