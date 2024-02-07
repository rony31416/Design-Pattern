package abstractFactory;

import InterfacePakage.Chair;
import InterfacePakage.CoffeeTable;
import InterfacePakage.Sofa;

public abstract class Factory {
    abstract Chair makeChair();
    abstract Sofa makeSofa();
    abstract CoffeeTable makeCoffeeTable();   
}
