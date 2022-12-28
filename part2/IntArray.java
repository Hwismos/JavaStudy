package part2;

public class IntArray implements ArrayController{
	private int count;
	private int[] arr;
	
	public IntArray() {
		this(10);
	}
	
	public IntArray(int index) {
		arr = new int[index];
	}
	
	@Override
	public void add(int data) {
		arr[count++] = data;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int size() {
		return count;
	}
}
