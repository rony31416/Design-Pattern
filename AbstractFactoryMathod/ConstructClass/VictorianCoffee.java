package ConstructClass;

import InterfacePakage.CoffeeTable;

public class VictorianCoffee implements CoffeeTable{

	@Override
	public void createCoffeeTable() {
		System.err.println("This is a Victorian Coffee");
	}

}
