package com.yesser.modelo;

public class Pedidos {
    private String nombre;
    private String pedido;

    public Pedidos(){

    }

    public Pedidos(String nombre, String pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
