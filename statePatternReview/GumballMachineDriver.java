package statePatternReview;

public class GumballMachineDriver {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(2);
		
		System.out.println(gumballMachine);
		System.out.println(gumballMachine.state);
	}
}
