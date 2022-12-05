package statePattern;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuater() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	public void refill() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public String toString() {
		return "sold out";
	}

}
