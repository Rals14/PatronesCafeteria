package BebidaBuilder;

import java.util.List;

public class BebidaMocchaBuilder implements BebidaBuilder {
    private Bebida moccha = new BebidaBase();

    @Override
    public void agregarBase() {
        moccha.setBase("leche");
    }

    @Override
    public void agregarIngredientes() {
        moccha.setIngredientes(List.of("café expreso", "chocolate", "espuma de leche"));
    }

    @Override
    public Bebida getBebida() {
        return moccha;
    }
}
