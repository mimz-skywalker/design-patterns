
public class ChatRoomUser extends User{
	
	public ChatRoomUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}
	
	@Override
	public void Send(String message, User sender) {
		
		System.out.println(this.name + " says " + message);
		
		mediator.sendMessage(message, this);
		
		if(message.contains("addBot")){
			
			mediator.addBot(new ChatRoomBot (mediator, "bot"));
			
			System.out.println("Bot added");
		}
				
		
		if (message.contains("cat")){
			
			mediator.removeUser(sender);
			System.out.println(sender.name + " was removed. Cat is a forbidden word. ");
		}
	}
	
	@Override
    public void Receive(String message, User sender) {
        
		System.out.println(this.name + " received " + message);
    }

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}


}
