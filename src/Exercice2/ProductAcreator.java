package Exercice2;

import java.util.Optional;

public class ProductAcreator extends Creator {
    public Optional<Product> createProduct() {
        return Optional.of(new ConcreteProductA());
    }
}

