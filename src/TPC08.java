public class TPC08 {
	public static void main(String[] args) {
		int a = 10; int b = 20;
		int res = add(a, b);
		System.out.println(res);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
