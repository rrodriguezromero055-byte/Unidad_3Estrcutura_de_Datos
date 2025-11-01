/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ejercicios1.datos;

/**
 *
 * @author Romero
 */
import javax.swing.JOptionPane;
/**
 * Esta ventana sirve para agregar o modificar las calificaciones dentro del kardex
 * @author Romero
 */
public class AgregarCalificaciones extends javax.swing.JDialog {
    /**
     * Este cosntructor se usa cuando se agregan nuevas materias
     * @param parent es la ventana principal que lo invoca
     * @param modal bloquea la venana principal mientras esta abierta 
     */
    public AgregarCalificaciones(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
}
    /**
     * Este cosntructor se usa cuando se modifica una materia
     * @param parent es la venatana principal que lo invoca 
     * @param modal indica si es modal o no
     * @param index es la posicion del registro que se va a modificar
     */
    public AgregarCalificaciones(java.awt.Frame parent, boolean modal, int index) {
        super(parent, modal);
        initComponents();
        
          for (java.awt.event.ActionListener al : BtnGuardar.getActionListeners()) {
        BtnGuardar.removeActionListener(al);
    }
        //Se obtiene la materia seleccionada del arrgelo
         Materia m = KardexDatos.Materias.get(index);

    // Cargar los datos actuales en los campos
    txtMateria.setText(m.getNombre());
    txtSemestre.setText(String.valueOf(m.getSemestre()));
    txtCalificacion.setText(String.valueOf(m.getCalificaciones()));

    // Cambia el texto del botón
    BtnGuardar.setText("Actualizar");

    // Al presionar, solo actualiza los valores
    BtnGuardar.addActionListener(e -> {
        m.setNombre(txtMateria.getText());
        m.setSemestre(Integer.parseInt(txtSemestre.getText()));
        m.setCalificaciones(Integer.parseInt(txtCalificacion.getText()));
        dispose();
    });
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtCalificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("   Materia ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("   Semestre");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText(" Calificacion");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardar)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSemestre)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BtnGuardar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo para marcar que hay un limite y avisa cuando se alcanza 
     * @param evt 
     */
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

    String materia = txtMateria.getText();
    String semestre = txtSemestre.getText();
    String calificacion = txtCalificacion.getText();
    
    //Valida los campos vacios
    if (materia.isEmpty() || semestre.isEmpty() || calificacion.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor llena todos los campos.");
        return;
    }
    //Crea un nuevo objeto de matria y asigna su valores 
    var materiaObj=new Materia();
    materiaObj.setNombre(materia);
    materiaObj.setSemestre(Integer.parseInt(semestre));
    materiaObj.setCalificaciones(Integer.parseInt(calificacion));
    
    //Se agrega el arreglo general 
    KardexDatos.Materias.add(materiaObj);

    this.dispose();//Cierra la ventana
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void txtCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalificacionActionPerformed

    }//GEN-LAST:event_txtCalificacionActionPerformed

    /**
     * @param args the command line arguments
     */
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
