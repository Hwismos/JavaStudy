import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		String title = "Spring";
		int price = 25000;
		String company = "Jaypup";
		int page = 800;
		
		BookDTO dto; // dto는 객체
		dto = new BookDTO(title, price, company, page); // dto는 인스턴스
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
	}
}
