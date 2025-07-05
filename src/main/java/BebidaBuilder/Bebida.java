package BebidaBuilder;

import java.util.List;

public abstract class Bebida {
    String base;
    List<String> ingredientes;

    public void setBase(String base){
        this.base = base;
    }

    public void setIngredientes(List<String> ingredientes){
        this.ingredientes = ingredientes;
    }

    public String toString() {
        return "BebidaBuilder.Bebida a base: " + base + " e Ingredientes: " + ingredientes;
    }
}
