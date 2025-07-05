package org.William;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cajero cajero = new Cajero();
        Barista barista = new Barista();

        String respuesta;

        do {
            Pedido pedido = cajero.tomarPedido();

            Cliente cliente = new Cliente(pedido.getCliente());

            // Agregar observadores al pedido
            pedido.agregarObservador(cliente);
            pedido.agregarObservador(cajero);

            // Preparar el pedido
            barista.prepararPedido(pedido);

            // Preguntar si se desea ingresar otro cliente
            System.out.print("\n¿Desea agregar otro cliente? (si/no): ");
            respuesta = scanner.nextLine().trim().toLowerCase();

            System.out.println("--------------------------------------------------");

        } while (respuesta.equals("s") || respuesta.equals("sí") || respuesta.equals("si"));

        System.out.println("\n[Sistema] Gracias por usar el sistema de pedidos de café ☕. ¡Hasta luego!");
    }
}
