import java.util.ArrayList;
import java.util.List;

public abstract class Logger implements Observable{
	
	public static String INTERNATIONAL = "International package received.";
	public static String COUNTRY = "Country package received.";
	public static String CITY_OF_PLOVDIV = "City of Plovdiv package received.";
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	
	protected String level;
	
	protected Logger nextLogger;
	
	private State state;
	
	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	
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
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}
	
	abstract protected void writeMessage(String message);

}
