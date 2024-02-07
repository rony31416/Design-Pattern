package abstractFactory;

import ConstructClass.VictorianChair;
import ConstructClass.VictorianCoffee;
import ConstructClass.VictorianSofa;
import InterfacePakage.Chair;
import InterfacePakage.CoffeeTable;
import InterfacePakage.Sofa;

public class VictorianFactory extends Factory{

	@Override
	Chair makeChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	Sofa makeSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

	@Override
	CoffeeTable makeCoffeeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffee();
	}

	

}
