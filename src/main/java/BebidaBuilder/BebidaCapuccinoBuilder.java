package BebidaBuilder;

import java.util.List;

public class BebidaCapuccinoBuilder implements BebidaBuilder {
    private Bebida capuccino = new BebidaBase();

    @Override
    public void agregarBase() {
        capuccino.setBase("leche vaporada");
    }

    @Override
    public void agregarIngredientes() {
        capuccino.setIngredientes(List.of("café expresso", "chocolate", "canela"));
    }

    @Override
    public Bebida getBebida() {
        return capuccino;
    }
}
