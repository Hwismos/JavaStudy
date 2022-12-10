import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("Choi", 20, "011", "Seoul");
		
		m.setName("Kim");

		System.out.println(m.toString());
	}
}
