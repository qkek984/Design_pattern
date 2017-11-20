package hansung.designpatterns.state.gumballstatewinner;

import java.util.Random;

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}

	public void refill(int num){
		state.refill(num);
		if(state instanceof SoldOutState){
			setState(getNoQuarterState());//getNoQuarterState상태로 전환
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
		if(state instanceof NoQuarterState){
			setState(getHasQuarterState());
		}
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
		if(state instanceof HasQuarterState){
			setState(getNoQuarterState());
		}
	}
 
	public void turnCrank() {
		if(state instanceof HasQuarterState){
			Random randomWinner = new Random(System.currentTimeMillis());
			int winner = randomWinner.nextInt(10);
			if ((winner == 0) && (getCount() > 1)) {
				setState(getWinnerState());
			} else {
				setState(getSoldState());
			}
		}
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
