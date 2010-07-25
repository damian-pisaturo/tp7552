package view.collection.trie;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import controller.TrieController;

/**
 * Representa al panel principal que contiene los botones.
 * 
 * 
 */
public class MainButtonPanel extends javax.swing.JPanel {
  private static final long serialVersionUID = 1L;

  private TrieController controller;

  /** Creates new form Panel */
  public MainButtonPanel() {
    this.controller = null;
    initComponents();
  }

  /**
   * Agrega un controlador
   * @param controller controlador a agregar
   */
  public void addController(TrieController controller) {
    this.controller = controller;
  }

  /**
   * Habilita o desactiva los elementos del panel.
   * @param b true si el los elementos deben habilitarse, false en caso
   *        contrario.
   */
  public void setEnabledButtons(boolean b) {
    this.insertButton.setEnabled(b);
    this.removeButton.setEnabled(b);
    this.demoButton.setEnabled(b);
    this.clearButton.setEnabled(b);
    this.textField.setEnabled(b);
  }
  
  /**
   * Determina si los elementos del panel estan habilitados (o no)
   * @return true si estan habilitados, false en caso contrario.
   */
  public boolean isEnabledButtons(){
    return this.insertButton.isEnabled();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    textField = new javax.swing.JTextField();
    jPanel1 = new javax.swing.JPanel();
    insertButton = new javax.swing.JButton();
    removeButton = new javax.swing.JButton();
    demoButton = new javax.swing.JButton();
    clearButton = new javax.swing.JButton();

    //setBackground(new java.awt.Color(255, 255, 255));
    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    textField.setColumns(15);
    textField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        textFieldActionPerformed(evt);
      }
    });
    add(textField);

    jPanel1.setLayout(new java.awt.GridLayout(1, 0));
    add(jPanel1);

    insertButton.setText("Insertar");
    insertButton.setAlignmentY(0.0F);
    insertButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    insertButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
    insertButton.setMaximumSize(new java.awt.Dimension(80, 20));
    insertButton.setMinimumSize(new java.awt.Dimension(80, 20));
    insertButton.setPreferredSize(new java.awt.Dimension(80, 20));
    insertButton.setMnemonic(KeyEvent.VK_I);
    insertButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        insertButtonActionPerformed(evt);
      }
    });
    add(insertButton);

    removeButton.setText("Eliminar");
    removeButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
    removeButton.setMaximumSize(new java.awt.Dimension(80, 20));
    removeButton.setMinimumSize(new java.awt.Dimension(80, 20));
    removeButton.setPreferredSize(new java.awt.Dimension(80, 20));
    removeButton.setMnemonic(KeyEvent.VK_E);
    removeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        removeButtonActionPerformed(evt);
      }
    });
    add(removeButton);

    demoButton.setText("Random");
    demoButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
    demoButton.setMaximumSize(new java.awt.Dimension(80, 20));
    demoButton.setMinimumSize(new java.awt.Dimension(80, 20));
    demoButton.setPreferredSize(new java.awt.Dimension(80, 20));
    demoButton.setMnemonic(KeyEvent.VK_D);
    demoButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        demoButtonActionPerformed(evt);
      }
    });
    add(demoButton);

    clearButton.setText("Limpiar");
    clearButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
    clearButton.setMaximumSize(new java.awt.Dimension(80, 20));
    clearButton.setMinimumSize(new java.awt.Dimension(80, 20));
    clearButton.setPreferredSize(new java.awt.Dimension(80, 20));
    clearButton.setMnemonic(KeyEvent.VK_L);
    clearButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clearButtonActionPerformed(evt);
      }
    });
    add(clearButton);
  }// </editor-fold>//GEN-END:initComponents

  private void demoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoButtonActionPerformed
     controller.generateWords();
  }//GEN-LAST:event_demoButtonActionPerformed

  private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
                                         
    int res = JOptionPane.showConfirmDialog(null, "Se eliminarán todos los elementos.\n¿Continuar?",
            "Limpiar", JOptionPane.YES_NO_OPTION);

    if (res == 0) {
        controller.clear();
    }

  }//GEN-LAST:event_clearButtonActionPerformed

  private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertButtonActionPerformed
    String text = this.getText();
    
    if (text.length() == 0) {
      return;
    }

    controller.insertWord(text.toLowerCase());

  }// GEN-LAST:event_insertButtonActionPerformed

  private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldActionPerformed

    this.insertButtonActionPerformed(evt);
  }// GEN-LAST:event_textFieldActionPerformed

  private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeButtonActionPerformed
   String text = this.getText();
    if (text.length() == 0)
      return;

    controller.removeWord(text.toLowerCase());
    this.setEnabledButtons(false);
  }// GEN-LAST:event_removeButtonActionPerformed

  private String getText() {
    String text = textField.getText();

    textField.grabFocus();
    textField.selectAll();
    return text;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton clearButton;
  private javax.swing.JButton demoButton;
  private javax.swing.JButton insertButton;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton removeButton;
  private javax.swing.JTextField textField;
  // End of variables declaration//GEN-END:variables
}
