package observerPattern;

public class Lewin implements Crew {

	@Override
	public void update(String msg) {
		System.out.println("Lewin gets: " + msg);
	}

}
