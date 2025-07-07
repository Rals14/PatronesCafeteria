import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCapuccinoBuilder;
import BebidaDecorator.LecheDecorator;
import BebidaObserver.Despacho;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Despacho despacho = new Despacho();
        Bebida cafe = barista.hacerBebida(new BebidaCapuccinoBuilder());

        Bebida cafeConLeche = new LecheDecorator(cafe);
        despacho.update(cafeConLeche.toString());

//        System.out.println(cafeConLeche.toString());

        

    }
}
