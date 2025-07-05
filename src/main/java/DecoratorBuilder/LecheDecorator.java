package DecoratorBuilder;

import BebidaBuilder.Bebida;

import java.util.List;

public class LecheDecorator extends BebidaDecorator{
    public LecheDecorator(Bebida bebida){
        super(bebida);
    }

    @Override
    public void setBase(String base) {

    }

    @Override
    public void setIngredientes(List<String> ingredientes) {
        bebida.setIngredientes(List.of("leche"));
    }

    @Override
    public String toString(){
        return bebida.toString();
    }
}
