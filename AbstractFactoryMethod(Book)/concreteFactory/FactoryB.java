package concreteFactory;

import AbstractFactory.Factory;
import abstractProduct.Product1;
import abstractProduct.Product2;
import concreteClass.BFactoryProduct1;
import concreteClass.BFactoryProduct2;

public class FactoryB implements Factory {

	@Override
	public Product1 createProductA() {
	      return new BFactoryProduct1();	
	}

	@Override
	public Product2 createProductB() {
		return new BFactoryProduct2();
	}

	

}
