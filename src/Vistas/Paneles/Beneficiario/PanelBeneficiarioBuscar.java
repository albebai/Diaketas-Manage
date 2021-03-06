/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Beneficiario;

/**
 *
 * @author psylock
 */
public class PanelBeneficiarioBuscar extends javax.swing.JPanel {
  
    
    /**
     * Creates new form PanelBeneficiarioBuscar
     */
    public PanelBeneficiarioBuscar() {
        initComponents();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBusquedaBeneficiarioDNI = new javax.swing.JTextField();
        btBuscarBeneficiarioDNI = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cbTipoBusquedaBeneficiario = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaBusquedaBeneficiario = new javax.swing.JTable();
        btVerBeneficiarioBusqueda = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        btBuscarBeneficiarioDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscar.png"))); // NOI18N
        btBuscarBeneficiarioDNI.setActionCommand("buscarBeneficiarioDNI");

        jLabel29.setText("Criterio de búsqueda");

        cbTipoBusquedaBeneficiario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tablaBusquedaBeneficiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo Búsqueda", "DNI", "Nombre y Apellidos", "Fecha Nacimiento"
            }
        ));
        jScrollPane5.setViewportView(tablaBusquedaBeneficiario);

        btVerBeneficiarioBusqueda.setText("Ver beneficiario");
        btVerBeneficiarioBusqueda.setActionCommand("verBeneficiarioBusqueda");

        jLabel63.setText("Introduzca el DNI para buscar al beneficiario");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jLabel63)
                .add(18, 18, 18)
                .add(textBusquedaBeneficiarioDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btBuscarBeneficiarioDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel29)
                        .add(18, 18, 18)
                        .add(cbTipoBusquedaBeneficiario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(btVerBeneficiarioBusqueda)
                        .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 948, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(51, 51, 51)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel63)
                            .add(textBusquedaBeneficiarioDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btBuscarBeneficiarioDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel29)
                    .add(cbTipoBusquedaBeneficiario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btVerBeneficiarioBusqueda)
                .add(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarBeneficiarioDNI;
    private javax.swing.JButton btVerBeneficiarioBusqueda;
    private javax.swing.JComboBox cbTipoBusquedaBeneficiario;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaBusquedaBeneficiario;
    private javax.swing.JTextField textBusquedaBeneficiarioDNI;
    // End of variables declaration//GEN-END:variables
}
