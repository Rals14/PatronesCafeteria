import BebidaBuilder.Barista;
import BebidaBuilder.Bebida;
import BebidaBuilder.BebidaCapuccinoBuilder;
import BebidaBuilder.BebidaLimonadaBuilder;
import BebidaDecorator.HierbaBuenaDecorator;
import BebidaDecorator.LecheDecorator;
import BebidaDecorator.SplendaDecorator;
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

        //Más ejemplos de uso

        Bebida limonada = barista.hacerBebida(new BebidaLimonadaBuilder());
        // Decorar la bebida de limonada con Splenda y Hierba Buena
        Bebida limonadaSplenda = new SplendaDecorator(limonada);
        Bebida limonadaConHierba = new HierbaBuenaDecorator(limonada);

        // Notificar al despacho que la bebida de limonada con Splenda y Hierba Buena está lista
        despacho.update(limonadaConHierba.toString());




        

    }
}
