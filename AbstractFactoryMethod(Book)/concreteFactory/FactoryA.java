package concreteFactory;

import AbstractFactory.Factory;
import abstractProduct.Product1;
import abstractProduct.Product2;
import concreteClass.AFactoryProduct1;
import concreteClass.AFactoryProduct2;

public class FactoryA implements Factory{

	@Override
	public Product1 createProductA() {
		return new AFactoryProduct1();
	}

	@Override
	public Product2 createProductB() {
		return new AFactoryProduct2();
	}

	

}
