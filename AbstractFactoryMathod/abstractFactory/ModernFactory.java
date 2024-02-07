package abstractFactory;

import ConstructClass.ModernChair;
import ConstructClass.ModernCoffee;
import ConstructClass.ModernSofa;
import InterfacePakage.Chair;
import InterfacePakage.CoffeeTable;
import InterfacePakage.Sofa;

public class ModernFactory extends Factory {

	@Override
	Chair makeChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	Sofa makeSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

	@Override
	CoffeeTable makeCoffeeTable() {
		// TODO Auto-generated method stub
		return new ModernCoffee();
	}

	
}
