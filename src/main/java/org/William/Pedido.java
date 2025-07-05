package org.William;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private String bebida;

    private final List<Observador> observadores = new ArrayList<>();

    public Pedido(String cliente, String bebida) {
        this.cliente = cliente;
        this.bebida = bebida;
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public String getCliente() {
        return cliente;
    }

    public String getBebida() {
        return bebida;
    }
}
