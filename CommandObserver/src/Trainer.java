import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable{
	
	private String Name;
	private String condition = "";
	private List<OnlineSubscribers> subscribers = new ArrayList<OnlineSubscribers>();
	private boolean isUp = true;
	private boolean isLying = false;
	
	public void setName(String name){
		this.Name = name;
		this.notifySubscribers();
	}
	
	public String getName(){
		 return this.Name;
	}
	
	public void getUp() {
		this.isUp = true;
		this.isLying = false;
		
		this.condition = this.Name + " is Up.";
	}
	
	public void layDown() {
		this.isUp = false;
		this.isLying = true;
		
		this.condition = this.Name + " is Down.";
	}
	
	public String getCondition() {
		return this.condition;
	}

	@Override
	public void subscribe(OnlineSubscribers subscriber) {
		this.subscribers.add(subscriber);
		subscriber.setTopic(this);
		
	}

	@Override
	public void unsubscribe(OnlineSubscribers subscriber) {
		this.subscribers.remove(subscriber);
		
	}

	@Override
	public void notifySubscribers() {
		for (OnlineSubscribers subscriber : this.subscribers) {
			subscriber.Update();
		}
		
	}

	@Override
	public String getUpdate() {
		return this.condition;
	}
	

}
