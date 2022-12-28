import java.lang.*; // 디폴트 패키지
import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {

	public static void main(String[] args) {
		// 1. 자바에서 제공해주는 class들(API)
		String str = new String("Apple");
		System.out.println(str);
		System.out.println(str.toLowerCase());
		
		// 2. 직접 만들어서 사용하는 class들(DTO/VO, DAO, Utility)
		MyUtil mu = new MyUtil();
		System.out.println(mu.hap());
		
		// 3. 다른 회사에서 만들어 놓은 class들(API)
		// Gson
		Gson g = new Gson();
		BookVO book = new BookVO("name", 10, "comp", 20);
		String json = g.toJson(book);
		// 아래의 구조로 만들어주는 (json 타입) API
		// {"title":"name","price":10,"company":"comp","page":20}
		System.out.println(json);
	}

}
