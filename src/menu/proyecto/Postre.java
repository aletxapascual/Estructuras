/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu.proyecto;
import javax.swing.DefaultListModel;

/**
 *
 * @author 52999
 */
public class Postre extends javax.swing.JFrame {
    
    DefaultListModel<String> lista1Model; 
    DefaultListModel<String> lista2Model; 
    DefaultListModel<String> lista3Model; 
    DefaultListModel<String> listaActual;
    
    
    public boolean btnActivadoPostre1= false;
    public boolean btnActivadoPostre2= false;
    public boolean btnActivadoPostre3= false;
    public String nomPostre;
    Lista lista1 = new Lista();
    Lista lista2 = new Lista();
    Lista lista3 = new Lista();
    

    /**
     * Creates new form Postre
     */
    public Postre() {
        initComponents();
        lista1Model = new DefaultListModel<>();
        lista2Model = new DefaultListModel<>();
        lista3Model = new DefaultListModel<>();
        
        txtOutput.setModel(lista1Model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jDialog7 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btnPostre1 = new javax.swing.JButton();
        btnPostre2 = new javax.swing.JButton();
        btnPostre3 = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnAgregarIngrediente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        nombrePostre = new javax.swing.JTextField();
        nombreIngrediente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(138, 172, 121));

        btnPostre1.setBackground(new java.awt.Color(214, 224, 193));
        btnPostre1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnPostre1.setText("Postre 1");
        btnPostre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostre1ActionPerformed(evt);
            }
        });

        btnPostre2.setBackground(new java.awt.Color(214, 224, 193));
        btnPostre2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnPostre2.setText("Postre 2");
        btnPostre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostre2ActionPerformed(evt);
            }
        });

        btnPostre3.setBackground(new java.awt.Color(214, 224, 193));
        btnPostre3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnPostre3.setText("Postre 3");
        btnPostre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostre3ActionPerformed(evt);
            }
        });

        btnCambiar.setBackground(new java.awt.Color(214, 224, 193));
        btnCambiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCambiar.setText("Cambiar nombre");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnAgregarIngrediente.setBackground(new java.awt.Color(214, 224, 193));
        btnAgregarIngrediente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnAgregarIngrediente.setText("Agregar ingrediente");
        btnAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngredienteActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(214, 224, 193));
        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar ingrediente");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        nombrePostre.setBackground(new java.awt.Color(234, 239, 222));
        nombrePostre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        nombrePostre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombrePostre.setText(" ");
        nombrePostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePostreActionPerformed(evt);
            }
        });

        nombreIngrediente.setBackground(new java.awt.Color(234, 239, 222));
        nombreIngrediente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        nombreIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreIngrediente.setText(" ");
        nombreIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreIngredienteActionPerformed(evt);
            }
        });

        txtOutput.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(txtOutput);

        jButton1.setBackground(new java.awt.Color(214, 224, 193));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPostre1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(btnPostre2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(btnPostre3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                            .addComponent(nombrePostre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPostre1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPostre2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPostre3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarIngrediente)
                            .addComponent(btnCambiar))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostre1ActionPerformed
       btnActivadoPostre1= true; 
       btnPostre1.setBackground(new java.awt.Color(204, 204, 204));
       btnActivadoPostre2= false; 
       btnPostre2.setBackground(new java.awt.Color(214, 224, 193));
       btnActivadoPostre3= false; 
       btnPostre3.setBackground(new java.awt.Color(214, 224, 193));
       txtOutput.setModel(lista1Model);
       
    }//GEN-LAST:event_btnPostre1ActionPerformed

    private void btnPostre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostre2ActionPerformed
        btnActivadoPostre2= true; 
        btnPostre2.setBackground(new java.awt.Color(204, 204, 204));
        btnActivadoPostre1= false; 
        btnPostre1.setBackground(new java.awt.Color(214, 224, 193));
        btnActivadoPostre3= false; 
        btnPostre3.setBackground(new java.awt.Color(214, 224, 193));
        txtOutput.setModel(lista2Model);
    }//GEN-LAST:event_btnPostre2ActionPerformed

    private void btnPostre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostre3ActionPerformed
        btnActivadoPostre3= true; 
        btnPostre3.setBackground(new java.awt.Color(204, 204, 204));
        btnActivadoPostre2= false; 
        btnPostre2.setBackground(new java.awt.Color(214, 224, 193));
        btnActivadoPostre1= false; 
        btnPostre1.setBackground(new java.awt.Color(214, 224, 193));
        txtOutput.setModel(lista3Model);
    }//GEN-LAST:event_btnPostre3ActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        String nombre = nombrePostre.getText();
        int postreActivado = 0;

        if (btnActivadoPostre1) {
            postreActivado = 1;
        } else if (btnActivadoPostre2) {
            postreActivado = 2;
        } else if (btnActivadoPostre3) {
            postreActivado = 3;
        }

        switch (postreActivado) {
            case 1:
                btnPostre1.setText(nombre);
                btnActivadoPostre1 = false;
                btnPostre1.setBackground(new java.awt.Color(214, 224, 193));
                nombrePostre.setText(" ");
                break;
            case 2:
                btnPostre2.setText(nombre);
                btnActivadoPostre2 = false;
                btnPostre2.setBackground(new java.awt.Color(214, 224, 193));
                nombrePostre.setText(" ");
                break;
            case 3:
                btnPostre3.setText(nombre);
                btnActivadoPostre3 = false;
                btnPostre3.setBackground(new java.awt.Color(214, 224, 193));
                nombrePostre.setText(" ");
                break;
            default:
                System.out.println("No hay botones activados.");
                break;
        }


    }//GEN-LAST:event_btnCambiarActionPerformed

    private void nombrePostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePostreActionPerformed
        
    }//GEN-LAST:event_nombrePostreActionPerformed

    private void nombreIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngredienteActionPerformed
        
    }//GEN-LAST:event_nombreIngredienteActionPerformed

    private void btnAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngredienteActionPerformed
        String ingrediente = nombreIngrediente.getText();
        int postreActivado = 0;

        if (btnActivadoPostre1) {
            postreActivado = 1;
        } else if (btnActivadoPostre2) {
            postreActivado = 2;
        } else if (btnActivadoPostre3) {
            postreActivado = 3;
        }

        switch (postreActivado) {
            case 1:
                lista1.agregar(ingrediente);
                lista1Model.addElement(ingrediente); 
                txtOutput.setModel(lista1Model);
                nombreIngrediente.setText(" ");
                //txtOutput.addElement(nombreIngrediente.getText().trim());                
                //txtOutput.setText(lista1.imprimir());
                break;
            case 2:
                lista2.agregar(ingrediente);
                lista2Model.addElement(ingrediente); 
                txtOutput.setModel(lista2Model);
                nombreIngrediente.setText(" ");
                //txtOutput.setText(lista2.imprimir());
                break;
            case 3:
                lista3.agregar(ingrediente);
                lista3Model.addElement(ingrediente); 
                txtOutput.setModel(lista3Model);
                nombreIngrediente.setText(" ");
                //txtOutput.setText(lista3.imprimir());
                break;
            default:
                System.out.println("No hay botones activados.");
                break;
        }
    }//GEN-LAST:event_btnAgregarIngredienteActionPerformed
       
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int ingredienteSeleccionado = txtOutput.getSelectedIndex();
        int postreActivado = 0;

        if (btnActivadoPostre1) {
            postreActivado = 1;
        } else if (btnActivadoPostre2) {
            postreActivado = 2;
        } else if (btnActivadoPostre3) {
            postreActivado = 3;
        }

        switch (postreActivado) {
            case 1:
                lista1Model.remove(ingredienteSeleccionado); 
                lista1.eliminar(ingredienteSeleccionado);
                break;
            case 2:
                lista2Model.remove(ingredienteSeleccionado); 
                lista2.eliminar(ingredienteSeleccionado);
                break;
            case 3:
                lista3Model.remove(ingredienteSeleccionado); 
                lista3.eliminar(ingredienteSeleccionado);
                break;
            default:
                System.out.println("No hay botones activados.");
                break;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mainmenu v0 = new Mainmenu();
        v0.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarIngrediente;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPostre1;
    private javax.swing.JButton btnPostre2;
    private javax.swing.JButton btnPostre3;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nombreIngrediente;
    private javax.swing.JTextField nombrePostre;
    private javax.swing.JList<String> txtOutput;
    // End of variables declaration//GEN-END:variables
}
