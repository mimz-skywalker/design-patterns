
public class CityOfPlovdivLogger extends Logger{
	
	private String name;
	
	public CityOfPlovdivLogger(String name) {
		  this.name = name;
		  this.level = Logger.CITY_OF_PLOVDIV;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("City of Plovdiv message says: " + message);
		
	}

}
