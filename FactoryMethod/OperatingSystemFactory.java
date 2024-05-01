package FactoryMethod;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		if(str.equals("Windows")) 
		{
			return new Windows();
		}
		else if(str.equals("iOS")) 
		{
			return new iOS();
		}
		else return new Linux();
		
	}

}
