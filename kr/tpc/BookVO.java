package kr.tpc;

public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO(String a, int b, String c, int d) {
		this.title = a;
		this.price = b;
		this.company = c;
		this.page = d;
	}
}
