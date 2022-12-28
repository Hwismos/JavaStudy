
public class TPC06 {

	public static void main(String[] args) {
		// 메소드: 동작(procedure), 기능(function)
		int a = 67;
		int b = 98;
		int res = sum(a, b);  // call by value
		System.out.println(res);
		
		int[] arr = makeArr();
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);
	}
	
	// 정수 2개를 매개변수로 받아 총합을 반환하는 함수를 정의하라.
	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}
	
	public static int[] makeArr() {
		int x, y, z;
		x = 10; y = 20; z = 30;
		
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		return arr;
	}
}
