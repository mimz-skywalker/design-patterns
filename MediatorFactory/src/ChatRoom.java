import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements MessageMediator{
	private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.Receive(message, u);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
        
        System.out.println(user.name + " was added. ");
    }
    
    //When using the forbidden word
    @Override
    public void removeUser(User user) {
    	this.users.remove(user);
    }
    
    @Override
    public void addBot(ChatRoomBot bot) {
    	this.users.add(bot);
    }

}
