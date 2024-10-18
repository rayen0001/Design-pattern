package Exercice3;

public class ConcreteProductB1 implements AbstractProductB{
    @Override
    public void use() {
        System.out.println("Hello from " + this.getClass().getSimpleName());
    }
}
