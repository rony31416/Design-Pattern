package Observer_design_pattern;



public class Subscriber implements Observer {
	
	private String name;
	private Channel channel = new Channel();
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " Video Uploaded! by "+ channel.channelName +  "  title : "+ channel.title);
	}
	
	@Override
	public void subscribedChennel(Channel ch) {
		channel = ch;
	}

}
