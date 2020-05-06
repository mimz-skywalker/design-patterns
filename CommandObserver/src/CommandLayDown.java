
public class CommandLayDown implements Command{
	
	private Trainer trainer;
	
	public CommandLayDown(Trainer trainer) {
		this.trainer = trainer;
	}
	
	@Override
	public void Train() {
		this.trainer.layDown();
		
	}
	
	

}
