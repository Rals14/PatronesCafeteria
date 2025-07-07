package BebidaBuilder;

public interface BebidaBuilder {
    // Métodos para agregar base e ingredientes a la bebida
    void agregarBase();
    void agregarIngredientes();
    // Metodo para obtener la bebida construida
    Bebida getBebida();
}
