/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import view.Login;
import view.Register;
import view.Transacciones;
import ws.Operaciones_Service;
import ws.Operaciones;

/**
 *
 * @author UsuarioF
 */
public class ControladorVista {

    Login vista;
    Transacciones operaciones;
    Register registro;
    Operaciones_Service Servicio = new Operaciones_Service();
    Operaciones cliente = Servicio.getOperacionesPort();

    public ControladorVista(Login vista, Transacciones operaciones, Register registro) {
        this.vista = vista;
        this.operaciones = operaciones;
        this.registro = registro;
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.getLblIncorrecto().setVisible(false);
        registro.getLblIncorrecto().setVisible(false);
        operaciones.getLbl_Retiro().setVisible(false);
        operaciones.getLbl_Insuficiente().setVisible(false);

    }

    public void iniciarControl() {
        vista.getBtnIngresar().addActionListener(l -> ingresar());
        registro.getBtnRegistrar().addActionListener(l -> registro());
        vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro.setLocationRelativeTo(null);
                registro.setVisible(true);
            }
        });

        operaciones.getBtnSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operaciones.dispose();
                vista.setLocationRelativeTo(null);
                vista.setVisible(true);
            }

        });
        operaciones.getBtnTransaccion().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retiroIngreso();
            }

        });

    }

    public void ingresar() {
        String usuario = vista.getTxtUsuario().getText();
        String contra = vista.getTxtPassword().getText();
        boolean validarIngreso = cliente.login(usuario, contra);
        if (validarIngreso == false) {
            vista.getLblIncorrecto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(vista, "Bienvenido: " + vista.getTxtUsuario().getText());
            operaciones.setLocationRelativeTo(null);
            operaciones.getLblUsuario().setText(vista.getTxtUsuario().getText());
            operaciones.setVisible(true);
            operaciones.getTxtSaldo().setText("" + cliente.devolverSaldo(usuario));
            vista.dispose();
        }
    }

    public void registro() {
        String usuario = registro.getTxtUsuario().getText();
        String contra = registro.getTxt_Pass().getText();
        String repetir = registro.getTxt_PassR().getText();
        Double saldo = Double.parseDouble(registro.getTxt_Saldo().getText());
        boolean validarRegistro = cliente.registro(usuario, contra, repetir, saldo);
        if (validarRegistro == false) {
            JOptionPane.showMessageDialog(registro, "Registro Incorrecto");
        } else {
            registro.setLocationRelativeTo(null);
            registro.dispose();
            registro.getLblIncorrecto().setVisible(true);
            JOptionPane.showMessageDialog(registro, "Registro Completo");
        }
    }

    public void retiroIngreso() {
        Double valor = Double.parseDouble(operaciones.getTxtValor().getText());
        String clientes = operaciones.getLblUsuario().getText();
        if (operaciones.getCb_Trans().getSelectedItem().equals("Deposito")) {
            boolean operar = cliente.deposito(clientes, valor);
            if (operar == false) {
                operaciones.getLbl_Insuficiente().setVisible(false);
                operaciones.getLbl_Retiro().setVisible(false);
                JOptionPane.showMessageDialog(operaciones, "No se realizo el deposito");
            } else {
                operaciones.getTxtSaldo().setText("" + cliente.devolverSaldo(clientes));
                operaciones.getLbl_Insuficiente().setVisible(false);
                operaciones.getLbl_Retiro().setVisible(false);
                JOptionPane.showMessageDialog(operaciones, "Se realizo el deposito correctamente ");
            }
        } else {
            if (operaciones.getCb_Trans().getSelectedItem().equals("Retiro")) {
                boolean retiro = cliente.retiro(clientes, valor);
                if (retiro == false) {
                    operaciones.getLbl_Insuficiente().setVisible(true);
                    operaciones.getLbl_Retiro().setVisible(false);
                    JOptionPane.showMessageDialog(operaciones, "No se realizo el retiro");
                } else {
                    operaciones.getTxtSaldo().setText("" + cliente.devolverSaldo(clientes));
                    operaciones.getLbl_Insuficiente().setVisible(false);
                    operaciones.getLbl_Retiro().setVisible(true);
                    JOptionPane.showMessageDialog(operaciones, "Se realizo el retiro");

                }
            }
        }

    }

}
