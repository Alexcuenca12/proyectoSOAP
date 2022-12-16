/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectosoap;

import controller.ControladorVista;
import view.Login;
import view.Register;
import view.Transacciones;

/**
 *
 * @author UsuarioF
 */
public class ProyectoSOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        Register registro = new Register();
        Transacciones transacciones = new Transacciones();
        ControladorVista controller = new ControladorVista(login, transacciones, registro);

        controller.iniciarControl();
    }

}
