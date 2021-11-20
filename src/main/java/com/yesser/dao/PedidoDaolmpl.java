package com.yesser.dao;

import com.yesser.conexion.Conexion;
import com.yesser.modelo.Pedidos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PedidoDaolmpl implements PedidosDao {

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Pedidos> findAll() {
        return null;
    }

    @Override
    public int insert(Pedidos pedidos) {
        int registrar = -1;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO pedidos (nombre,pedido) values ('"+pedidos.getNombre()+"','"+pedidos.getPedido()+"')";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase PedidoDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public int update(Pedidos pedidos) {
        int registrar = -1;

        Statement stm= null;
        Connection con=null;

        String sql="UPDATE pedidos SET nombre = '"+pedidos.getNombre()+"', pedido = '"+pedidos.getPedido()+"' WHERE id = '"+pedidos.getIdd()+"' ";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase PedidoDaoImple, método update");
            e.printStackTrace();
        }
        return registrar;
    }
}
