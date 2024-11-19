/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.comanex.proyecto_sistemadecontroldeventas;

import com.comanex.proyecto_sistemadecontroldeventas.modulousuario.Cliente;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor_Supo
 */

public class IntefazPrincipal_SistemaDeControlDeVentas {

  

    private static volatile ClienteControlador instance;
    private final ClienteServicio clienteServicio;
    private final ResourceBundle messages;
    private List<Cliente> clientes;

    public static ClienteControlador getInstance() {
        ClienteControlador instance = IntefazPrincipal_SistemaDeControlDeVentas.instance;
       if (instance == null) {
            synchronized (ClienteControlador.class) {
                instance = IntefazPrincipal_SistemaDeControlDeVentas.instance;
                if (instance == null) {
                    IntefazPrincipal_SistemaDeControlDeVentas.instance = instance = new ClienteControlador();
                }
            }
        }
        return instance;
    }

    public MenunteControlador() {
        this.clienteServicio = ClienteServicio.getInstance();
        this.clientes = listarClientes();
        this.messages = ResourceBundle.getBundle("juan.estevez.sistemaventa.recursos.messages");
    }

    private List<Cliente> listarClientes() {
        this.clientes = this.clienteServicio.getAllClientes();
        return this.clientes;

        return new ArrayList<>();
    }
    
    public void limpiarTablaClientes(JTable tableClientes) {
        DefaultTableModel model = (DefaultTableModel) tableClientes.getModel();
        model.setRowCount(0);
    }

    public void listarClientes(JTable tableClientes) {
        this.listarClientes();
        tableClientes.setModel(GUIUtils.listarClientes(clientes, (DefaultTableModel) tableClientes.getModel()));
    }

    public boolean guardarCliente(Cliente cliente) {
        try {
            clienteServicio.registrarCliente(cliente);
            Utilitarios.mostrarMensajeExito(messages.getString("cliente.registrado"));
            return true;
        } catch (NumberFormatException e) {
            Utilitarios.mostrarMensajeError(messages.getString("error.dni.telefono.numerico"));
        } catch (HeadlessException e) {
            Utilitarios.mostrarErrorGenerico((SQLException) e);
        }

        return false;
    }

    public boolean eliminarCliente(int idCliente) {
        try {
            if (Utilitarios.confirmarEliminacion()) {
                clienteServicio.eliminarCliente(idCliente);
                Utilitarios.mostrarMensajeExito(messages.getString("cliente.eliminado"));
                return true;
            }
        } catch (HeadlessException e) {
            Utilitarios.mostrarErrorGenerico((SQLException) e);
        }

        return false;
    }

    public boolean editarCliente(Cliente cliente) {
        try {
            clienteServicio.modificarCliente(cliente);
            Utilitarios.mostrarMensajeExito(messages.getString("cliente.actualizado"));
            return true;
        } catch (NumberFormatException e) {
            Utilitarios.mostrarMensajeError(messages.getString("error.dni.telefono.numerico"));
        } catch (HeadlessException e) {
            Utilitarios.mostrarErrorGenerico((SQLException) e);
        }

        return false;
    }
    
    public Cliente buscarCliente(int dniRut) {
        return this.clienteServicio.buscarCliente(dniRut);
        return null;
    }
    
}

}
