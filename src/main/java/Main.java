import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCapuccinoBuilder;
import BebidaDecorator.LecheDecorator;
import BebidaObserver.Despacho;

public class Main {
    public static void main(String[] args) {
        // Inicializar el barista, despacho y bebida
        Barista barista = new Barista();
        Despacho despacho = new Despacho();
        Bebida cafe = barista.hacerBebida(new BebidaCapuccinoBuilder());

        // Inicializar el decorador de leche y agregarlo a la bebida
        Bebida cafeConLeche = new LecheDecorator(cafe);
        // Observer que notifica cuando la bebida esta lista
        despacho.update(cafeConLeche.toString());

//        System.out.println(cafeConLeche.toString());

        

    }
}
