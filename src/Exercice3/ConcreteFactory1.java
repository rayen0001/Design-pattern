package Exercice3;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA creatproducta() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB creatproductb() {
        return new ConcreteProductB1();
    }
}
