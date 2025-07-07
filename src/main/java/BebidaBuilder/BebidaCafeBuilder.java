package BebidaBuilder;

import java.util.List;

public class BebidaCafeBuilder implements BebidaBuilder {
    private Bebida cafe = new BebidaBase();

    @Override
    public void agregarBase() {
        cafe.setBase("agua");
    }

    @Override
    public void agregarIngredientes() {
        cafe.setIngredientes(List.of("café molido"));
    }

    @Override
    public Bebida getBebida() {
        return cafe;
    }
}
