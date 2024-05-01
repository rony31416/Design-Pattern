package FactoryMethod;

public class Windows extends OS{

	@Override
	public void spec() {
		System.out.println("Windows is build by Microsoft.");
	}

}
