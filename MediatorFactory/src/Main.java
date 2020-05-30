public class Main {

	public static void main(String[] args) {
		
		MessageMediator chatRoom = new ChatRoom();
		ChatRoomFactory factory = new ChatRoomFactory();
		
		User Peter = factory.createUser(chatRoom, "Peter");
		User Ivan = factory.createUser(chatRoom, "Ivan");
		User Georgi = factory.createUser(chatRoom, "Georgi");
		
		Peter.Send("Hi.", Peter);
		Ivan.Send("addBot", Ivan);
		Georgi.Send("I have a cat", Georgi);
		
		
		//test if Georgi is removed
		Georgi.Send("ala bala", Georgi);
		
		//test if Georgi will receive the new message
		Ivan.Send("ala bala", Ivan);
		
	}

}
