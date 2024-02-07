package AbstractFactory;

import abstractProduct.Product1;
import abstractProduct.Product2;

public interface Factory {
	abstract Product1 createProductA();
	abstract Product2 createProductB();
}
