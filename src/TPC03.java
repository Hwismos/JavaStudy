import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		Book b;
		b = new Book();  // 객체생성: 생성자 함수
		
		b.title = "Java";
		b.price = 10000;
		b.company = "Hello";
		b.page = 300;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		PersonVO p;
		p = new PersonVO();
		p.name = "James";
		p.age = 24;
		p.weight = 64.5f;
		p.height = 175.2f;
		
		System.out.println("\n" + p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
	}
}
