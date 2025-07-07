package BebidaDecorator;

import BebidaBuilder.Bebida;

import java.util.ArrayList;
import java.util.List;

public class SplendaDecorator extends BebidaDecorator {
    public SplendaDecorator(Bebida bebida){
        super(bebida);
        List<String> ingredientes = new ArrayList<String>(bebida.getIngredientes());
        ingredientes.add("splenda");
        bebida.setIngredientes(ingredientes);
    }

    @Override
    public void setBase(String base) {

    }

    @Override
    public void setIngredientes(List<String> ingredientes){;
    }

    @Override
    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString(){
        return bebida.toString();
    }
}