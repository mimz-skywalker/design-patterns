
public class CountryLogger extends Logger{
	
	private String name;
	
	public CountryLogger(String name) {
		  this.level = Logger.COUNTRY;
		  this.name = name;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Country message says: " + message);
		
	}

}
