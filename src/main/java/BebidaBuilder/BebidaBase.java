package BebidaBuilder;

import BebidaObserver.Preparacion;

import java.util.List;

public class BebidaBase implements Bebida {
    Preparacion preparacion = new Preparacion();
    public String base;
    public List<String> ingredientes;

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
        // Observador para notificar que se han agregado ingredientes
        preparacion.update("Ingredientes agregados: " + String.join(", ", ingredientes));
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Bebida a base de " + base + " con ingredientes: " + String.join(", ", ingredientes);
    }
}
