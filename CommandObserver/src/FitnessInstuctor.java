
public class FitnessInstuctor {
	
	private Command command;
	private String condition = "";
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void giveCommand() {
		this.condition  = "Fitness Instructor is giving command" + this.command.getClass().getSimpleName();
		this.command.Train();
	}
}
