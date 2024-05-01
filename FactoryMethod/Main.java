package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		OperatingSystemFactory ofs = new OperatingSystemFactory();
		
		
		OS obj = ofs.getInstance("Linux");
		obj.spec();
	}
}
