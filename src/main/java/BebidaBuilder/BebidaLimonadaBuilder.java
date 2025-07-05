package BebidaBuilder;

import java.util.List;

public class BebidaLimonadaBuilder implements BebidaBuilder {
    private Bebida limonada = new BebidaBase();

    @Override
    public void agregarBase() {
        limonada.setBase("agua");
    }

    @Override
    public void agregarIngredientes() {
        limonada.setIngredientes(List.of("jugo de limón", "hielo"));
    }

    @Override
    public Bebida getBebida() {
        return limonada;
    }

}
