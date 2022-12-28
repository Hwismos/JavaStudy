package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Baedi implements Coach{
	private List<Crew> crews = new ArrayList<>();
	
	public void eatFood() {
		System.out.println("Baedi eats");
		notifyCrew("I've eaten");
	}
	
	public void runAway() {
		System.out.println("Baedi ran away");
		notifyCrew("I ran away");
	}
	
	public void upgradeCutie() {
		System.out.println("Baedi became more cute");
		notifyCrew("I became more cute");
	}
	
	@Override
	public void subscribe(Crew crew) {
		crews.add(crew);
	}

	@Override
	public void unsubscribe(Crew crew) {
		crews.remove(crew);
	}

	@Override
	public void notifyCrew(String msg) {
		crews.forEach(crew -> crew.update(msg));
	}

}
