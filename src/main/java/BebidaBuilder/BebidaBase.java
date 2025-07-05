package BebidaBuilder;

import java.util.List;

public class BebidaBase implements Bebida {
    public String base;
    public List<String> ingredientes;

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;

    }

    @Override
    public String toString() {
        return "Bebida a base de " + base + " con ingredientes: " + String.join(", ", ingredientes);
    }
}
