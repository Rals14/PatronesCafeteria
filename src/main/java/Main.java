import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCafeBuilder;
import BebidaBuilder.BebidaCapuccinoBuilder;
import DecoratorBuilder.LecheDecorator;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Bebida cafe = barista.hacerBebida(new BebidaCapuccinoBuilder());

        Bebida cafeConLeche = new LecheDecorator(cafe);

        System.out.println(cafeConLeche.toString());

        

    }
}
