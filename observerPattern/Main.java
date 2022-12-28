package observerPattern;

public class Main {

	public static void main(String[] args) {
		Baedi baedi = new Baedi();
		Crew lewin = new Lewin();
		Crew tiber = new Tiber();
		Crew jay = new Jay();
		
		baedi.subscribe(lewin);
		baedi.subscribe(tiber);
		baedi.subscribe(jay);
		
		baedi.upgradeCutie();
		
		baedi.unsubscribe(lewin);
		
		baedi.eatFood();
	}

}
