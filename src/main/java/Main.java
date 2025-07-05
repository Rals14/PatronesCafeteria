import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCafeBuilder;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Bebida cafe = barista.hacerBebida(new BebidaCafeBuilder());

        

    }
}
