package BebidaBuilder;

import java.util.List;

public class BebidaCapuccinoBuilder implements BebidaBuilder {
    private Bebida capuccino = new BebidaBase();

    @Override
    public void agregarBase() {
        capuccino.setBase("leite vaporizado");
    }

    @Override
    public void agregarIngredientes() {
        capuccino.setIngredientes(List.of("café expresso", "chocolate em pó", "canela"));
    }

    @Override
    public Bebida getBebida() {
        return capuccino;
    }
}
