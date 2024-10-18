package Exercice3;

public class ConcreteProductB2 implements AbstractProductB{

    @Override
    public void use() {
        System.out.println("Hello from " + this.getClass().getSimpleName());
    }
}
