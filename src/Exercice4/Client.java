package Exercice4;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.buildproduct();
        Product product = builder.getProduct();
        System.out.println(product);
    }
}
