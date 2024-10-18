package Exercice4;

public class Product {
    private String ref ;
    private String color;
    private int  size;

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ref='" + ref + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
