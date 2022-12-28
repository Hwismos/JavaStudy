
public class TPC02 {

	public static void main(String[] args) {
		int a, b, c;  // 메모리에 a, b, c라는 이름의 기억공간이 만들어짐
		a = 1;
		b = 1;
		c = a + b;
		System.out.println(c);
		
		float f;  // float, double 
		f = 34.5f;  // float로 인식하려면 f를 데이터 뒤에 붙여줘야 함
		System.out.println(f);
		
		char d;
		d = 'A';  // " ... " 은 String 타입
		System.out.println(d);
		
		boolean g;
		g = true;
		System.out.println(g);
		
		// Book bk;
		// Book 자료형을 클래스로 설계하면 됨
	}

}
