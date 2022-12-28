import kr.tpc.Overload;

public class TPC15 {
	public static void main(String[] args) {
		Overload ov = new Overload();
		
		System.out.println(ov.hap(1,2));
		System.out.println(ov.hap(1.2f, 2));
		System.out.println(ov.hap(1.4f, 2.4f));
	}
}
