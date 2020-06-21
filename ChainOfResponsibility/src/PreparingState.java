
public class PreparingState implements State{
	
	private String stateName = "PREPARING_STATE";

	@Override
	public void applyState(Logger context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
