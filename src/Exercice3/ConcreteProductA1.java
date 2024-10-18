package Exercice3;

public class ConcreteProductA1 implements AbstractProductA{
    @Override
    public void use() {
        System.out.println("Hello from " + this.getClass().getSimpleName());
    }
}
