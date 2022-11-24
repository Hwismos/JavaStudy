public class TPC04 {
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a + b + c 을 해주는 메소드를 정의 → hap 메소드
		hap(a, b, c);
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i*10;
		}
		
		hapOfArray(arr);
	}
	
	public static void hap(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	public static void hapOfArray(int[] parm) {
		for(int i = 0; i < parm.length; i++) {
			System.out.print(parm[i] + "  ");
		}
		System.out.println();
	}
}
