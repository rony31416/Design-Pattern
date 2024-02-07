package AbstractFactory;

import abstractProduct.Product1;
import abstractProduct.Product2;
import concreteFactory.FactoryA;
import concreteFactory.FactoryB;

public class Client {

	public static void main(String[] args) {
	
		Factory factory = new FactoryB();
		
		Product1 product1 =  factory.createProductA();
		Product2 product2 =  factory.createProductB();
		
		product1.productIdentity1();
		product2.ProductIdentity2();

	}

}
