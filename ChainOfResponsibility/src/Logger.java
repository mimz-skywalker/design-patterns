
public abstract class Logger {
	
	public static String INTERNATIONAL = "International package received.";
	public static String COUNTRY = "Country package received.";
	public static String CITY_OF_PLOVDIV = "City of Plovdiv package received.";
	
	protected String level;
	
	protected Logger nextLogger;
	
	private String name;
	private State state;
	
	
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(String level, String message) {
		
		if(this.level.equals(level)) {
			
			this.writeMessage(message);
		}
		
		if(this.nextLogger != null) {
			this.nextLogger.logMessage(level, message);
		}
		
	}
	

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	abstract protected void writeMessage(String message);

}
