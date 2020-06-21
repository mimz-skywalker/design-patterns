
public class Main {
	
	private static Logger getChain() {
		
		Logger internationalLogger = new InternationalLogger("international office ");
		Logger countryLogger = new CountryLogger(" country office ");
		Logger cityOfPlovdivLogger = new CityOfPlovdivLogger(" Plovdiv office ");
		
		
		
		internationalLogger.setNextLogger(countryLogger);
		countryLogger.setNextLogger(cityOfPlovdivLogger);
		return internationalLogger;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
