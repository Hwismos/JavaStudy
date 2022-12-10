import kr.tpc.MovieVO;

public class TPC17 {

	public static void main(String[] args) {
//		int[] arr = new int[] {1, 2, 3, 4, 5};
//		 int[] arr = new int[5];
//		 arr[0] = 1; ... arr[4] = 5;

		MovieVO mv = new MovieVO("A", 12000, "dir", 12, 1.3f);
		System.out.println(mv.toString());
		
		MovieVO[] mvArr = new MovieVO[3];
		
		mvArr[0] = new MovieVO("A", 12000, "dir1", 12, 1.3f);
		mvArr[1] = new MovieVO("B", 11000, "dir2", 15, 1.5f);
		mvArr[2] = new MovieVO("C", 13000, "dir3", 19, 2.0f);
		
		System.out.println(mvArr[0].toString());
		System.out.println(mvArr[1].toString());
		System.out.println(mvArr[2].toString());
		
		System.out.println("\n\n");
		
		for(int i = 0; i < mvArr.length; i++) {
			System.out.println(mvArr[i].toString());
		}
	}

}
