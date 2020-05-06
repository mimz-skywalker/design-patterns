public class OnlineSubscribers implements Observer {
	
	private String Name;
	private String condition = "";
	private Observable topic;
	
	
	@Override
	public void Update(){
		
		String condition = topic.getUpdate();
		
		if(topic == null) {
			this.condition = "not training";
			return;
		}
		 
		String Temp = " ";
		
		if (condition.indexOf("Up") != -1) {
			Temp = " is Up ";
		}
		else {
			Temp = " is Down";
		}
		
		this.condition = this.Name + Temp;
		
	}
	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public String getCondition() {
		return this.condition;
	}
}
