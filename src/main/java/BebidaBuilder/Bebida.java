package BebidaBuilder;

import java.util.List;

public interface Bebida {

    void setBase(String base);

    void setIngredientes(List<String> ingredientes);

    String toString();
}
