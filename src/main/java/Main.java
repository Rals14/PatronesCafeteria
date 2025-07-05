import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCafeBuilder;
import DecoratorBuilder.LecheDecorator;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Bebida cafe = barista.hacerBebida(new BebidaCafeBuilder());

        Bebida cafeConLeche = new LecheDecorator(cafe);

        System.out.println(cafeConLeche.toString());

        

    }
}
