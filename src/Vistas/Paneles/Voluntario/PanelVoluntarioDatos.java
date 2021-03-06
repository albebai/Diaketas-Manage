/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Voluntario;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author raphaelcolleau
 */
public class PanelVoluntarioDatos extends javax.swing.JPanel {

    /**
     * Creates new form PanelVoluntarioDatos
     */
    public PanelVoluntarioDatos() {
        initComponents();
        
        labelError.setVisible(false);
    }
    
    public void setTextLabelError (String text) {
        labelError.setText(text);
        labelError.setVisible(true);
    }
    
    public void borrarCampos () {
        labelError.setVisible(false);
        textApellidos.setText("");
        textCP.setText("");
        textDomicilio.setText("");
        textFechaNacimiento.setText("");
        textLocalidad.setText("");
        textNIF.setText("");
        textNombre.setText("");
        textTelMovil.setText("");
        textTelFijo.setText("");
        textPassword.setText("");
    }
    
    // getters de los campos 

    public JButton getBtBorrar() {
        return btBorrar;
    }

    public JButton getBtGuardar() {
        return btGuardar;
    }

    public String getTextApellidos() {
        return textApellidos.getText();
    }

    public String getTextCP() {
        return textCP.getText();
    }

    public String getTextDomicilio() {
        return textDomicilio.getText();
    }

    public String getTextFechaNacimiento() {
        return textFechaNacimiento.getText();
    }

    public String getTextLocalidad() {
        return textLocalidad.getText();
    }

    public String getTextNIF() {
        return textNIF.getText();
    }

    public String getTextNombre() {
        return textNombre.getText();
    }

    public String getTextProfesion() {
        return textTelMovil.getText();
    }

    public String getTextTelFijo() {
        return textTelFijo.getText();
    }
    
    public String getTextTelMovil() {
        return textTelMovil.getText();
    }
    
    public String getTextPassword() {
        return textPassword.getText();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textNIF = new javax.swing.JTextField();
        textDomicilio = new javax.swing.JTextField();
        textLocalidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();
        textTelMovil = new javax.swing.JTextField();
        textCP = new javax.swing.JTextField();
        textTelFijo = new javax.swing.JTextField();
        textFechaNacimiento = new javax.swing.JFormattedTextField();
        btGuardar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jLabel2.setText("Nombre");

        jLabel3.setText("NIF/DNI/Pasaporte");

        jLabel6.setText("Domicilio");

        jLabel7.setText("Localidad");

        jLabel9.setText("Apellidos");

        jLabel10.setText("Nacido el");

        jLabel12.setText("Teléfono Movil");

        jLabel13.setText("CP");

        jLabel14.setText("Teléfono Fijo");

        textFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/save_f2.png"))); // NOI18N
        btGuardar.setActionCommand("guardarDatosVoluntario");

        btBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/limpiar.png"))); // NOI18N
        btBorrar.setActionCommand("borrarDatosVoluntario");

        labelError.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setText("Error");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Datos Personales");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Datos Personales");

        jLabel15.setText("Password");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(90, 90, 90)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jLabel2)
                    .add(jLabel1)
                    .add(jLabel6)
                    .add(jLabel7)
                    .add(jLabel13)
                    .add(jLabel4)
                    .add(jLabel15))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(textPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(btGuardar)
                            .add(40, 40, 40)
                            .add(labelError, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 363, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 191, Short.MAX_VALUE)
                            .add(btBorrar))
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(textLocalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(textNombre, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .add(textNIF)
                                    .add(textDomicilio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(textCP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(52, 52, 52)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel10)
                                .add(jLabel9)
                                .add(jLabel12)
                                .add(jLabel14))
                            .add(57, 57, 57)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(textTelFijo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .add(textFechaNacimiento)
                                .add(textApellidos)
                                .add(textTelMovil)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(46, 46, 46)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(textNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(textApellidos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(textNIF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10)
                    .add(textFechaNacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textDomicilio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(textTelMovil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textLocalidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel14)
                    .add(textTelFijo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(textCP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel13))
                        .add(37, 37, 37)
                        .add(jLabel4)
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel15)
                            .add(textPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(66, 66, 66)
                                .add(labelError))
                            .add(layout.createSequentialGroup()
                                .add(52, 52, 52)
                                .add(btGuardar))))
                    .add(btBorrar))
                .add(52, 61, Short.MAX_VALUE))
        );

        btBorrar.getAccessibleContext().setAccessibleDescription("Borrar los campos\n");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelError;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCP;
    private javax.swing.JTextField textDomicilio;
    private javax.swing.JFormattedTextField textFechaNacimiento;
    private javax.swing.JTextField textLocalidad;
    private javax.swing.JTextField textNIF;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textTelFijo;
    private javax.swing.JTextField textTelMovil;
    // End of variables declaration//GEN-END:variables
}
