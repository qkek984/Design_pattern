package hansung.designpatterns.state.gumballstatewinner;

public class SoldOutState extends State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
    }
 	/*
	public void insertQuarter() {
		System.out.println("disable");
	}
 	*/
	public void ejectQuarter() {
		System.out.println("disable");
	}
 
	public void turnCrank() {
		System.out.println("disable");
	}
 
	public void dispense() {
		System.out.println("disable");
	}

	public void refill(int num) {
		System.out.println("Refill : "+num);
		gumballMachine.count = num;//numberGumballs count 초기화
		//gumballMachine.setState(gumballMachine.getNoQuarterState());//getNoQuarterState상태로 전환
	}
 
	public String toString() {
		return "sold out";
	}
}
