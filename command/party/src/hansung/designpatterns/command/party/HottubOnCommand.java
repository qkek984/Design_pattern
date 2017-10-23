package hansung.designpatterns.command.party;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	public void undo() {
		hottub.setTemperature(98);
		hottub.off();

	}
}
