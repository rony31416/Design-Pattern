package concreteClass;

import abstractProduct.Product1;

public class AFactoryProduct1 implements Product1 {

	@Override
	public void productIdentity1() {
		System.out.println("This is a product 1 from Factory A");
	}

}
