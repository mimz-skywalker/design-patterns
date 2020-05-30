public interface MessageMediator {
	
	void sendMessage(String message, User user);
	void addUser(User user);
	void addBot(ChatRoomBot bot);
	void removeUser(User user);

}