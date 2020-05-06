
public class MainTest {

	public static void main(String[] args) {
		
		FitnessInstuctor instructor = new FitnessInstuctor();
		Trainer trainer = new Trainer();
		OnlineSubscribers subscriber1 = new OnlineSubscribers();
		OnlineSubscribers subscriber2 = new OnlineSubscribers();
		OnlineSubscribers subscriber3 = new OnlineSubscribers();
		
		trainer.setName("John");
		subscriber1.setName("Sub1");
		subscriber2.setName("Sub2");
		subscriber3.setName("Sub1");
		
		trainer.subscribe(subscriber1);
		trainer.subscribe(subscriber2);
		trainer.subscribe(subscriber3);
		
		Command layDown = new CommandLayDown(trainer);
		Command getUp = new CommandGetUp(trainer);
		
		instructor.setCommand(layDown);
		instructor.giveCommand();
		
		trainer.notifySubscribers();
		
		System.out.println(trainer.getCondition());
		System.out.println(subscriber1.getCondition());
		System.out.println(subscriber2.getCondition());
		System.out.println(subscriber3.getCondition());
		
		
		instructor.setCommand(getUp);
		instructor.giveCommand();
		
		trainer.notifySubscribers();
		
		System.out.println(trainer.getCondition());
		System.out.println(subscriber1.getCondition());
		System.out.println(subscriber2.getCondition());
		System.out.println(subscriber3.getCondition());
		
	}

}
