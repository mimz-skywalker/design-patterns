
public class ChatRoomFactory extends UserFactory {
	
	@Override
	public User createUser(MessageMediator mediator, String name) {
		
		
		ChatRoomUser user = new ChatRoomUser(mediator, name);
		

		return user;
	}


}
