package statePattern;

public interface State {
	public void insertQuater();
	public void ejectQuater();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
