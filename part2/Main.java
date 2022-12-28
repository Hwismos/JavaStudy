package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
//		ArrayController ac1 = new IntArray();
//		ArrayController ac2 = new IntArray(5);
//		
//		for(int i=0; i < 10; i++) {
//			ac1.add(i);
//		}
//		
//		for(int i=5; i > 3; i--) {
//			ac2.add(i);
//		}
//		
//		System.out.println(ac1.size());
//		System.out.println(ac2.size());
//		
//		for(int i=0; i < ac2.size(); i++) {
//			System.out.print(ac2.get(i));
//		}
//		System.out.println();
		
		String[] fruitsArray = {"apple", "banana", "kiwi", "mango"};
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList(fruitsArray));
		
		// import java.util.function.Consumer;
		Consumer<String> lambda = item -> System.out.println("item: " + item);
//		fruits.forEach(lambda);
		
		fruits.forEach(item 
				-> System.out.println("item: " + item));
	}
}
