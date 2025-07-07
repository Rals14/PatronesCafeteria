package BebidaDecorator;

import BebidaBuilder.Bebida;

import java.util.List;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;
    public String base;
    public List<String> ingredientes;

    public BebidaDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String toString(){
        return "Bebida a base de " + base + " con ingredientes: " + String.join(", ", ingredientes);
    }

}
