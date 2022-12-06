package observerPattern;

public class Jay implements Crew {

	@Override
	public void update(String msg) {
		System.out.println("Jay gets: " + msg);
	}

}
