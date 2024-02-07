package abstractFactory;

import InterfacePakage.Chair;
import InterfacePakage.CoffeeTable;
import InterfacePakage.Sofa;

public class Client {
	public static void main(String [] args)
	{
		Factory factory = new VictorianFactory();
		Chair chair = factory.makeChair();
		Sofa sofa = factory.makeSofa();
		CoffeeTable coffeeTable = factory.makeCoffeeTable();
		chair.createChair();
		sofa.createSofa();
		coffeeTable.createCoffeeTable();
		
	}
	 

}
