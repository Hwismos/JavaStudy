
public class TPC07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		float b = 56.7f;
		
		float res = sum(a, b);
		System.out.println(res);
		
		int[] arr = {1,2,3,4,5};
		int resOfArr = arrSum(arr);
		System.out.println(resOfArr);
	}
	
	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	public static int arrSum(int[] arr) {
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		
		return res;
	}

}
