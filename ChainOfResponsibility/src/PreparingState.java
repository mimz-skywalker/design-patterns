
public class PreparingState implements State{
	
	private String stateName = "PREPARING_STATE";

	@Override
	public void applyState(Context context) {
		context.setState(this);
		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
