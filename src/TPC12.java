import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		BookVO b1 = new BookVO("Java", 10000, "Daelim", 800);
		System.out.print(b1.title + ", ");
		System.out.print(b1.price + ", ");
		System.out.print(b1.company + ", ");
		System.out.println(b1.page);
		
		BookVO b2 = new BookVO("Cafe24", 20000, "Ezis", 400);
		System.out.print(b2.title + ", ");
		System.out.print(b2.price + ", ");
		System.out.print(b2.company + ", ");
		System.out.println(b2.page);
	}

}
