package ConstructClass;

import InterfacePakage.Chair;

public class ModernChair implements Chair {

	@Override
	public void createChair() {
		System.err.println("This is a Modern Chair");
	}

}
