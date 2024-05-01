package Builder_YT;

public class Phone {
	
	private String OS;
	private String EMIE;
	private int battery;
	private int camera;
	private int ram;
	
	
	public Phone(String oS, String eMIE, int battery, int camera, int ram) {
		super();
		OS = oS;
		EMIE = eMIE;
		this.battery = battery;
		this.camera = camera;
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", EMIE=" + EMIE + ", battery=" + battery + ", camera=" + camera + ", ram=" + ram
				+ "]";
	}
	
	

}
