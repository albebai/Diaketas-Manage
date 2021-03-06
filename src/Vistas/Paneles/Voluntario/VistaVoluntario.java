/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Voluntario;

import Vistas.BarraDeNavegacion;
import Vistas.Paneles.Voluntario.PanelVoluntarioBuscar;
import Vistas.Paneles.Voluntario.PanelVoluntarioAyudas;
import Vistas.Paneles.Voluntario.PanelVoluntarioDatos;
import Vistas.Paneles.Voluntario.PanelVoluntarioInicio;
import Vistas.Paneles.Voluntario.PanelVoluntarioContabilidad;
import java.awt.CardLayout;

/**
 *
 * @author raphaelcolleau
 */
public class VistaVoluntario extends javax.swing.JPanel {

    /* identificador de los paneles en el CardLayout */ 
    public static String panelInicio = "inicio";
    public static String panelBuscar = "buscar";
    public static String panelDatos = "datos";
    public static String panelAyudas = "ayuda";
    public static String panelContabilidad = "contabilidad";
    
    /**
     * Creates new form PanelVoluntario
     */
    public VistaVoluntario() {
        initComponents();
    }

    // getter panel
    public BarraDeNavegacion getBarraDeNavegacion() {
        return barraDeNavegacion;
    }

    public PanelVoluntarioBuscar getPanelVoluntarioBuscar() {
        return panelVoluntarioBuscar;
    }

    public PanelVoluntarioInicio getPanelVoluntarioInicio() {
        return panelVoluntarioInicio;
    }

    public PanelVoluntarioAyudas getPanelVoluntarioAyudas() {
        return panelVoluntarioAyudas;
    }

    public PanelVoluntarioContabilidad getPanelVoluntarioContabilidad() {
        return panelVoluntarioContabilidad;
    }

    public PanelVoluntarioDatos getPanelVoluntarioDatos() {
        return panelVoluntarioDatos;
    }
    
    // mostrar un panel con el CardLayoud
    public void showPanel (String panel) {
        CardLayout cardLayout =  (CardLayout)panelVoluntario.getLayout();
        cardLayout.show(panelVoluntario, panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraDeNavegacion = new Vistas.BarraDeNavegacion();
        panelVoluntario = new javax.swing.JPanel();
        panelVoluntarioInicio = new Vistas.Paneles.Voluntario.PanelVoluntarioInicio();
        panelVoluntarioDatos = new Vistas.Paneles.Voluntario.PanelVoluntarioDatos();
        panelVoluntarioBuscar = new Vistas.Paneles.Voluntario.PanelVoluntarioBuscar();
        panelVoluntarioAyudas = new Vistas.Paneles.Voluntario.PanelVoluntarioAyudas();
        panelVoluntarioContabilidad = new Vistas.Paneles.Voluntario.PanelVoluntarioContabilidad();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.BorderLayout());

        barraDeNavegacion.setAlignmentX(10.0F);
        add(barraDeNavegacion, java.awt.BorderLayout.PAGE_START);

        panelVoluntario.setMaximumSize(new java.awt.Dimension(1000, 550));
        panelVoluntario.setMinimumSize(new java.awt.Dimension(1000, 550));
        panelVoluntario.setPreferredSize(new java.awt.Dimension(1000, 550));
        panelVoluntario.setLayout(new java.awt.CardLayout());
        panelVoluntario.add(panelVoluntarioInicio, "inicio");
        panelVoluntario.add(panelVoluntarioDatos, "datos");
        panelVoluntario.add(panelVoluntarioBuscar, "buscar");
        panelVoluntario.add(panelVoluntarioAyudas, "ayuda");
        panelVoluntario.add(panelVoluntarioContabilidad, "contabilidad");

        add(panelVoluntario, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vistas.BarraDeNavegacion barraDeNavegacion;
    private javax.swing.JPanel panelVoluntario;
    private Vistas.Paneles.Voluntario.PanelVoluntarioAyudas panelVoluntarioAyudas;
    private Vistas.Paneles.Voluntario.PanelVoluntarioBuscar panelVoluntarioBuscar;
    private Vistas.Paneles.Voluntario.PanelVoluntarioContabilidad panelVoluntarioContabilidad;
    private Vistas.Paneles.Voluntario.PanelVoluntarioDatos panelVoluntarioDatos;
    private Vistas.Paneles.Voluntario.PanelVoluntarioInicio panelVoluntarioInicio;
    // End of variables declaration//GEN-END:variables
}
