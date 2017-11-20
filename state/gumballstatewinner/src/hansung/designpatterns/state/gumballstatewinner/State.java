package hansung.designpatterns.state.gumballstatewinner;

public abstract class State {

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    public void ejectQuarter(){}
	public void turnCrank(){}
	public void dispense(){}
	public void refill(int num){}
}
