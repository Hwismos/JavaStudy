package statePatternReview;

public interface State {
	// 각 상태에서 취해야 할 행동 정의
	void insertQuarter();
	void ejectQuarter();
	void dispense();
	void turnCrank();
}
