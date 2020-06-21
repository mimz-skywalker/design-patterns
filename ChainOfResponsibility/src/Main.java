
public class Main {
	
	
	public static void main(String[] args) {
		
		Logger internationalLogger = new InternationalLogger("international office ");
		Logger countryLogger = new CountryLogger(" country office ");
		Logger cityOfPlovdivLogger = new CityOfPlovdivLogger(" Plovdiv office ");
		
		PreparingState preparingState = new PreparingState();
		StandingState standingState = new StandingState();
		
		preparingState.applyState(countryLogger);
		standingState.applyState(internationalLogger);
		standingState.applyState(cityOfPlovdivLogger);
		
		internationalLogger.setNextLogger(countryLogger);
		countryLogger.setNextLogger(cityOfPlovdivLogger);
		
		Observer courier = new TopicSubscriber("Courier 1");
		internationalLogger.subscribe(courier);
		countryLogger.subscribe(courier);
		cityOfPlovdivLogger.subscribe(courier);
		
		
		internationalLogger.logMessage("Nothing received", "Waiting for another message");
		countryLogger.logMessage("Country package received.", "Preparing package");
		cityOfPlovdivLogger.logMessage("Nothing received", "Waiting for another message");
		
		courier.update();
		
		
	}

}
