package Exercice2;

import java.util.Optional;

public class ProductBcreator {
    public Optional <Product> createProduct() {
        return Optional.of(new ConcreteProductB());
    }
}

