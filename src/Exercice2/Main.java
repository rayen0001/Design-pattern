package Exercice2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ProductAcreator creatorA = new ProductAcreator();
        ProductBcreator creatorB = new ProductBcreator();

        Optional<Product> productA = creatorA.createProduct();
        productA.get().use();

        Optional<Product> productB = creatorB.createProduct();
        productB.get().use();
    }
}
