package Exercice4;

public class ConcreteBuilder implements Builder{
    private Product product;
    public ConcreteBuilder() {
        this.product = new Product();  // Initialisation de product
    }
    @Override
    public void createRef() {
        product.setRef("AZEAZ123AS");
    }

    @Override
    public void createColor() {
         product.setColor("RED");
    }

    @Override
    public void createSize() {
         product.setSize( 40);

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
