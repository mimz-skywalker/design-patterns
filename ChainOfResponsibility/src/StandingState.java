
public class StandingState implements State {

	private String stateName = "STANDING_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);

		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
