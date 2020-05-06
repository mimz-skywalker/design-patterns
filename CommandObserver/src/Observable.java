
public interface Observable {
	
	public void subscribe(OnlineSubscribers subscriber);
	public void unsubscribe(OnlineSubscribers subscriber);
	public void notifySubscribers();
	public String getUpdate();
	
}
