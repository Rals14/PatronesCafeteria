package org.William;

public class Barista {

    public void prepararPedido(Pedido pedido) {
        System.out.println("[Barista] Preparando " + pedido.getBebida() + " para " + pedido.getCliente() + "...");
        try {
            Thread.sleep(2000); // Simula preparación del café
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("[Barista] Pedido listo para entregar.");
        pedido.notificar("Tu " + pedido.getBebida() + " está listo, " + pedido.getCliente() + "!");
    }
}