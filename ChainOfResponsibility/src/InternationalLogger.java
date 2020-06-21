
public class InternationalLogger extends Logger {
	
	private String name;
	
	public InternationalLogger(String name) {
		
		this.level = Logger.INTERNATIONAL;
		this.name = name;
	}


	@Override
	protected void writeMessage(String message) {
		System.out.println("International message says: " + message);
	}
}
