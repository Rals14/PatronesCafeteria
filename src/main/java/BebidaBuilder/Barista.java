package BebidaBuilder;

public class Barista {
    public Bebida hacerBebida(BebidaBuilder builder) {
        // Agregar la base y los ingredientes a la bebida
        builder.agregarBase();
        builder.agregarIngredientes();
        // Construir y retornar la bebida
        return builder.getBebida();
    }
}
