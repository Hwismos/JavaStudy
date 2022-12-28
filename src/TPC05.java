
public class TPC05 {
	public static void main(String[] args) {
		// 데이터의 이동을 쉽게 하는 것이 배열의 목적
		int[] a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	
	
		// 9개의 정수형 변수를 만들어라 → 2차원(행렬) 구조
		int[][] b = new int[3][3];
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++ ) {
					b[i][j] = i * j + 4;
					System.out.print(b[i][j] );
			}
			System.out.print("\n");
		}
		
		// 가변길이 배열
		int[][] c = new int[5][];
		for(int i = 0; i < c.length; i++) {
			c[i] = new int[i+1];
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = '*';
			}
		}
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++ ) {
					System.out.print((char)c[i][j]);
			}
			System.out.print("\n");
		}
	}
	
}
