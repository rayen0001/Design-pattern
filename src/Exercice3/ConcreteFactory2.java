package Exercice3;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA creatproducta() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB creatproductb() {
        return new ConcreteProductB2();
    }
}
