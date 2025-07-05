package BebidaBuilder;

public class Barista {
    public Bebida hacerBebida(BebidaBuilder builder) {
        builder.agregarBase();
        builder.agregarIngredientes();
        return builder.getBebida();
    }
}
