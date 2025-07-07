package BebidaObserver;

public class Preparacion implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Bebida en preparacion, " + event);
    }
}
