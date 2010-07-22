package view.collection.queue;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.Random;

import controller.QueueController;

/**
 *
 */
public class QueueButtonsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private QueueController controller;

    /** Creates new form BSTButtonsPanel */
    public QueueButtonsPanel() {
        initComponents();
    }

    void addController(QueueController controller) {
        this.controller = controller;
    }

    private String getText() {
        String text = textField.getText();

        textField.grabFocus();
        textField.selectAll();
        return text;
    }

    /**
     * Habilita o deshabilita todos los controles del panel
     * @param enable
     */
    public void enableComponents(boolean enable) {
        for (Component component : this.getComponents()) {
            component.setEnabled(enable);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        insertRandomButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(746, 32));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        textField.setColumns(15);
        textField.setText("1");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

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

        removeAllButton.setText("Vaciar");
        removeAllButton.setPreferredSize(new java.awt.Dimension(80, 20));
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllButtonActionPerformed(evt);
            }
        });

        insertRandomButton.setText("Random");
        insertRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRandomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed

    }//GEN-LAST:event_textFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String text = getText();
        if (text.length() == 0) {
            return;
        }
        controller.enqueueItem(Integer.valueOf(text));
    }//GEN-LAST:event_insertButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        controller.dequeueItem();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        textField.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    private void removeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllButtonActionPerformed
        controller.dequeueAllItem();
    }//GEN-LAST:event_removeAllButtonActionPerformed

    private void insertRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRandomButtonActionPerformed
        for (int counter = 1; counter <= 10; counter++) {
            Random random = new Random();
            int number = random.nextInt();
            number = Math.abs(number);
            number = number % 100;
            controller.enqueueItem(number);
        }
    }//GEN-LAST:event_insertRandomButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertButton;
    private javax.swing.JButton insertRandomButton;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

}
