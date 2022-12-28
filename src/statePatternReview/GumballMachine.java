package statePatternReview;

public class GumballMachine {
	State noQuarterState;
	
	State state;
	int count = 0;
	
	public GumballMachine(int cnt) {
		noQuarterState = new NoQuarterState(this);
		
		this.count = cnt;
		if (cnt < 1) {
			System.out.println("No Gumball");
		} else {
			state = noQuarterState;
		}
	}

	void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "GumballMachine is Running...";
	}
	
	
}
