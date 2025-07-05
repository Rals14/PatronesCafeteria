package BebidaBuilder;

import java.util.List;

public class BebidaLatteBuilder implements BebidaBuilder {
    private Bebida latte = new Bebida();

    @Override
    public void agregarBase() {
        latte.setBase("leche");
    }

    @Override
    public void agregarIngredientes() {
        latte.setIngredientes(List.of("café expreso", "espuma de leche"));
    }

    @Override
    public Bebida getBebida() {
        return latte;
    }
}
