package org.William;



import java.util.Scanner;

public class Cajero implements Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Cajero] Notificación recibida: " + mensaje);
    }

    public Pedido tomarPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la bebida del cliente: ");
        String bebida = scanner.nextLine();

        System.out.println("[Cajero] Pedido registrado: " + bebida + " para " + nombre);
        return new Pedido(nombre, bebida);
    }
}
