package org.William;



public class Cliente implements Observador {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Cliente] " + nombre + " recibió notificación: " + mensaje);
    }
}
