package observerPattern;

public class Tiber implements Crew{
	@Override
	public void update(String msg) {
		System.out.println("Tiber gets: " + msg);
	}
}
