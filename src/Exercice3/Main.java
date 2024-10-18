package Exercice3;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();


        AbstractProductA productA1 = factory1.creatproducta();
        AbstractProductB productB1 = factory1.creatproductb();
        AbstractProductA productA2 = factory2.creatproducta();
        AbstractProductB productB2 = factory2.creatproductb();
        productA1.use();
        productB1.use();
        productA2.use();
        productB2.use();
    }
}
