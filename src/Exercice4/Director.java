package Exercice4;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void buildproduct (){
        builder.createColor();
        builder.createSize();
        builder.createRef();
    }
}
