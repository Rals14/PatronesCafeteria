package BebidaObserver;

public class Despacho implements Observer{
    @Override
    public void update(String event) {
        System.out.println("Orden lista: " + event);
    }
}
