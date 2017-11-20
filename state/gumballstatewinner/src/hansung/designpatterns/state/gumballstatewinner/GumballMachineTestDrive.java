package hansung.designpatterns.state.gumballstatewinner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = 
			new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);

		System.out.println(gumballMachine);
	}
}
