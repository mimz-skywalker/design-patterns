
public class StandingState implements State {

	private String stateName = "STANDING_STATE";
	
	@Override
	public void applyState(Logger context) {
		context.setState(this);

		
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
