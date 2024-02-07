package abstractFactory;

import ConstructClass.ArtDecoChair;
import ConstructClass.ArtDecoCofffee;
import ConstructClass.ArtDecoSofa;
import InterfacePakage.Chair;
import InterfacePakage.CoffeeTable;
import InterfacePakage.Sofa;

public class ArtDecoFactory extends Factory {

	@Override
	Chair makeChair() {
		return new ArtDecoChair();
	}

	@Override
	Sofa makeSofa() {
		// TODO Auto-generated method stub
		return new ArtDecoSofa();
	}

	@Override
	CoffeeTable makeCoffeeTable() {
		// TODO Auto-generated method stub
		return new ArtDecoCofffee();
	}

	
}
