package Builder_YT;

public class PhoneBuilder {
	
	private String OS;
	private String EMIE;
	private int battery;
	private int camera;
	private int ram;
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;

	}
	public PhoneBuilder setEMIE(String eMIE) {
		EMIE = eMIE;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;

	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;

	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;

	}
	
	public Phone getPhone() {
		return new Phone(OS,EMIE,battery,camera,ram);
	}
	
	
	
	
}
