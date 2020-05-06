
public class CommandGetUp implements Command {
	
	private Trainer trainer;
	
	public CommandGetUp(Trainer trainer) {
		this.trainer = trainer;
	}
	
	@Override
	public void Train() {
		this.trainer.getUp();
		
	}

}
