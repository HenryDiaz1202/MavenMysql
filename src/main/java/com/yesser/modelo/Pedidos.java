package com.yesser.modelo;

public class Pedidos {
    private String nombre;
    private String pedido;
    private Integer idd;

    public Pedidos(){

    }

    public Pedidos(String nombre, String pedido, Integer idd) {
        this.nombre = nombre;
        this.pedido = pedido;
        this.idd = idd;
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

    public Integer getIdd() {
        return idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

}
