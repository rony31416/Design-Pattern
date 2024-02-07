package concreteClass;

import abstractProduct.Product2;

public class BFactoryProduct2 implements Product2 {

	@Override
	public void ProductIdentity2() {
		System.out.println("This is a product 2 from Factory B");

	}

}
