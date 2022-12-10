package statePatternReview;

public class NoQuarterState implements State{
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Ready to Turn Crank");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("No Quarter");
	}

	@Override
	public void dispense() {
		System.out.println("No Quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("No Quarter");
	}
	// 동전이 없는 상태 클래스 구현
	
}
