package BebidaBuilder;

import java.util.List;

public class BebidaNaranjadaBuilder implements BebidaBuilder {
    private Bebida naranjada = new BebidaBase();

    @Override
    public void agregarBase() {
        naranjada.setBase("agua");
    }

    @Override
    public void agregarIngredientes() {
        naranjada.setIngredientes(List.of("jugo de naranja", "hielo"));
    }

    @Override
    public Bebida getBebida() {
        return naranjada;
    }
}
