
public abstract class User {
	
	protected MessageMediator mediator;
	protected String name;
	
	public User(MessageMediator mediator, String name) {
		 this.mediator = mediator;
		 this.name = name;
	}
	
	public abstract void Send(String messageSent, User sender);
	
	public abstract void Receive(String messageRec, User sender);
	
	public abstract void prepare();

}
