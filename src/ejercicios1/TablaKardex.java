
package ejercicios1;

import ejercicios1.datos.AgregarCalificaciones;
import ejercicios1.datos.KardexDatos;
import ejercicios1.datos.Materia;
import javax.swing.table.DefaultTableModel;

/**
 * Es la ventana pricipal donde se muestra la tabla de materias, calificaciones 
 * y el promedio general
 * @author Romero
 */
public class TablaKardex extends javax.swing.JFrame {

    /**
     * Es el constructor principal que anliza la interfaz y carga los datos 
     */
    public TablaKardex() {
        initComponents();
        //Se manda a llamar el metodo para actualizar la tabla 
        actualizarTabla();
        //Se manda a llamar el boton de eliminar 
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnEliminarActionPerformed(evt);
    }
});
        //Se manda a llamar el boton de eliminar 
         BtnModificar.addActionListener(evt -> {
        BtnModificarActionPerformed(null);
    });

        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        lblPromedio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        lblPromedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jTextField1.setText("      Calificaciones");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1)
                .addContainerGap())
        );

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAgregar)
                        .addComponent(BtnModificar)
                        .addComponent(BtnEliminar))
                    .addComponent(lblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo permite agragar una nueva materia 
     * @param evt 
     */
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
       AgregarCalificaciones dialogo = new AgregarCalificaciones(this,true);
       dialogo.setVisible(true);
       actualizarTabla();
    }//GEN-LAST:event_BtnAgregarActionPerformed
    /**
     * Este metodo permite moddificar los datos de una materia seleccionada 
     * @param evt 
     */
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
      int index= TablaDatos.getSelectedRow();
      if(index>=0){
          AgregarCalificaciones dialogo = new AgregarCalificaciones(this, true, index);
          dialogo.setVisible(true);
          actualizarTabla();
      }
    }//GEN-LAST:event_BtnModificarActionPerformed
    /**
     * Este metodo elimina la materia selecionada y actualiza la tabla 
     * @param evt 
     */
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       int index = TablaDatos.getSelectedRow();
    if(index >= 0){
        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
                        "¿Deseas eliminar la materia seleccionada?", 
                        "Confirmar eliminación", 
                        javax.swing.JOptionPane.YES_NO_OPTION);
        if(confirmar == javax.swing.JOptionPane.YES_OPTION){
            KardexDatos.Materias.remove(index);
            actualizarTabla();
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una materia para eliminar.");
    }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    /**
     * Este metodo permite actualizar su tabla con los datos que tiene 
     * el arrgelo en la calse kardex 
     */
    private void actualizarTabla(){
        String columnas[]= {"Materia","Semestre","Calificacion"};
        
        String matrizDatos[][]=new String[KardexDatos.Materias.size()][]; 
        
        int index = 0;
        for(Materia materia: KardexDatos.Materias){
            matrizDatos[index]=materia.aArreglo();
            index++;
        }
        DefaultTableModel model = new DefaultTableModel(matrizDatos, columnas);
        TablaDatos.setModel(model);
        
        //Muestra el promedio del semestre
        float promedio = calcularPromedio();
    lblPromedio.setText("Promedio del semestre: " + String.format("%.2f", promedio));

   
    }
    /**
     * Este metodo carga los datos del arreglo KardexDatos en la tabla principal y 
     * calcula el promedio general de las calificaciones registradas.
     */
    private void cargarDatos() {
    String[] columnas = {"Materia", "Semestre", "Calificación"};
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);
    double suma = 0;
    int contador = 0;


}
    /**
     * Este metodo calcula el promedio general de todas las calificaciones 
     * @return 
     */
    private float calcularPromedio(){
     float promedio=0;
     int contador=KardexDatos.Materias.size();
     for(Materia materia: KardexDatos.Materias){
         promedio += materia.getCalificaciones();
     }
     promedio = contador >0?promedio/contador: 0;
     return promedio;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaKardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblPromedio;
    // End of variables declaration//GEN-END:variables
}
