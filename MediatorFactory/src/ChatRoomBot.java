
public class ChatRoomBot extends User {

	public ChatRoomBot(MessageMediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(String messageSent, User sender) {
		
		mediator.sendMessage(messageSent, this);
		sender = this;
	}

	@Override
	public void Receive(String messageRec, User sender) {
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

}
