package com.yesser.gui;

import com.yesser.dao.PedidoDaolmpl;
import com.yesser.dao.PedidosDao;
import com.yesser.modelo.Pedidos;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PedidosFormClase extends JInternalFrame {
    private static PedidosFormClase miClase_1;
    public PedidosFormClase(){
        miClase_1 = this;
        inicializarCambioForm();
    }
    public static PedidosFormClase getInstance(){
        return (miClase_1==null) ? new PedidosFormClase() : miClase_1;
    }
    protected void cerrar()
    {
        this.dispose();
        miClase_1 = null;
    }

    private void inicializarCambioForm() {
        //Caracteristicas del formulario
        setToolTipText("Formulario guardar pedidos");
        setOpaque(true);
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setIconifiable(false);
        setTitle("Guardar pedidos");
        setClosable(true);
        setName("Guardar pedidos");

        //se crear una etiqueta para titulo del formulario
        JLabel lblTitle = new JLabel("Guardar pedidos - Crear/Editar ");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setPreferredSize(new Dimension(80, 40));

        //Instanciar objetos contenidos en el formulario
        JLabel lblCambiarClase = new JLabel("");
        JPanel pnlTitle = new JPanel(); //Panel que contiene el titulo del formulario
        JPanel pnlCentral = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel pnlButton = new JPanel();

        //se define caracteristicas de objetos del formulario
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.black));
        pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.LINE_AXIS));
        pnlTitle.setBackground(new Color(0, 117, 175));
        lblCambiarClase.setToolTipText("Descripcion de este titulo");
        panel.add(lblCambiarClase);

        // label id
        JLabel texto0 = new JLabel("ID");

        // JTextField
        JTextField entradaTexto_0 = new JTextField();
        entradaTexto_0.setText("0");

        // label nombre
        JLabel texto = new JLabel("Nombre");

        // JTextField
        JTextField entradaTexto = new JTextField();
        entradaTexto.setText("Henry");

        // label pedido
        JLabel texto1 = new JLabel("Pedido");

        // JTextField
        JTextField entradaTexto1 = new JTextField();
        entradaTexto1.setText("AIFON 12 PRO MA");

        // agregar al panel central
        panel.add(texto);
        panel.add(entradaTexto);
        panel.add(texto1);
        panel.add(entradaTexto1);
        panel.add(texto0);
        panel.add(entradaTexto_0);

        // boton guardar
        JButton btnGuardar = new JButton();
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new Dimension(120, 50));
        btnGuardar.setFocusable(false);
        btnGuardar.setEnabled(true);
        btnGuardar.setToolTipText("Guarda los cambios de los campos del Formulario");

        JButton btnCerrar = new JButton();
        btnCerrar.setText("Cerrar");
        btnCerrar.setPreferredSize(new Dimension(120, 50));
        btnCerrar.setFocusable(false);
        btnCerrar.setEnabled(true);
        btnCerrar.setToolTipText("Cierrar el Formulario");

        // boton update
        JButton btnUpdate = new JButton();
        btnUpdate.setText("Actualizar");
        btnUpdate.setPreferredSize(new Dimension(120, 50));
        btnUpdate.setFocusable(false);
        btnUpdate.setEnabled(true);
        btnUpdate.setToolTipText("Actualiza los cambios de los campos del Formulario");

        btnCerrar.addActionListener((ActionEvent arg0) -> {
            cerrar();
        });
        btnGuardar.addActionListener((ActionEvent arg0) -> {
            guardar();
            Pedidos pedidos = new Pedidos(entradaTexto.getText(),entradaTexto1.getText(),0);
            PedidosDao pedidosDao = new PedidoDaolmpl();
            pedidosDao.insert(pedidos);
            btnGuardar.setEnabled(false);
        });
        btnUpdate.addActionListener((ActionEvent arg0) -> {
            actualizar();
            Pedidos pedidos = new Pedidos(entradaTexto.getText(),entradaTexto1.getText(),Integer.parseInt(entradaTexto_0.getText()));
            PedidosDao pedidosDao = new PedidoDaolmpl();
            pedidosDao.update(pedidos);
            btnUpdate.setEnabled(false);
        });

        //Agrega los componentes al formulario
        pnlTitle.add(Box.createRigidArea(new Dimension(10, 10)));
        pnlTitle.add(lblTitle);

        pnlButton.add(Box.createRigidArea(new Dimension(60, 10)));
        pnlButton.add(btnCerrar);
        pnlButton.add(btnGuardar);
        pnlButton.add(btnUpdate);

        pnlCentral.add(panel);

        getContentPane().add(pnlTitle, BorderLayout.NORTH);
        getContentPane().add(pnlCentral, BorderLayout.CENTER);
        getContentPane().add(pnlButton, BorderLayout.SOUTH);
        pack();
    }
    private void guardar() {

    }
    private void actualizar() {

    }
}
