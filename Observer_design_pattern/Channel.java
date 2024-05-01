package Observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List<Subscriber> subs = new ArrayList<>();
	
	 String title,channelName; 
	
	
	public Channel(String string) {
		channelName = string;
	}

	public Channel() {
		
	}

	public void subscribe(Subscriber sub){
		subs.add(sub);
	}
	
	public void unSubscribed(Observer sub) {
		subs.remove(sub);
	}
	
	
	public void notifySubscriber() {
		
		for(Observer sub : subs) {
			sub.update();
		}
	   
	}
	
	protected void upload(String title){
	    this.title = title;
	    notifySubscriber();
	}

}
