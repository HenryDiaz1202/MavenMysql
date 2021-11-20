package com.yesser.dao;

import com.yesser.modelo.Pedidos;

import java.util.List;

public interface PedidosDao {
    public int delete(int id);
    public List<Pedidos> findAll();
    public int insert(Pedidos pedidos);
    public int update(Pedidos pedidos);
}
