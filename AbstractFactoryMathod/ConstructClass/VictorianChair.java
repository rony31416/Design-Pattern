package ConstructClass;

import InterfacePakage.Chair;

public class VictorianChair implements Chair {

	@Override
	public void createChair() {
		System.err.println("This is a Victorian Chair");		
	}
}
