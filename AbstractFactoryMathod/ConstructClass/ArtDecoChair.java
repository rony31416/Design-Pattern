package ConstructClass;

import InterfacePakage.Chair;

public class ArtDecoChair implements Chair{

	@Override
	public void createChair() {
		System.err.println("This is a ArtDeco Chair");
	}


}