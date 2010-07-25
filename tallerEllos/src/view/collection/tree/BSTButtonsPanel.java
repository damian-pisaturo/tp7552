package view.collection.tree;

import java.awt.Component;
import java.awt.event.KeyEvent;

import controller.BSTController;

/**
 *
 */
public class BSTButtonsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private BSTController controller;
    private static final int PARAMETER_MAX = 10;

    /** Creates new form BSTButtonsPanel */
    public BSTButtonsPanel() {
        initComponents();
    }

    void addController(BSTController controller) {
        this.controller = controller;
    }

    public void setWithChangeParameter(boolean withChangeParameter, String parameterName) {
        if (withChangeParameter) {
            for (int i = 1; i < PARAMETER_MAX; i++)
                parameterCombo.addItem(new Integer(i));
        }
        parameterLabel.setVisible(withChangeParameter);
        parameterCombo.setVisible(withChangeParameter);
        
        parameterLabel.setText(parameterName);
        
        parameterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parameterButtonActionPerformed(evt);
            }
        });
    }
    
    public void setParameter(int parameter) {
    	parameterCombo.setSelectedItem(parameter);
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
        traverseButton = new javax.swing.JButton();
        traverseOption = new javax.swing.JComboBox();
        parameterLabel = new javax.swing.JLabel();
        parameterCombo = new javax.swing.JComboBox();
        clearButton = new javax.swing.JButton();
        insertRandomButton = new javax.swing.JButton();

        //setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(840, 32));

        textField.setColumns(3);

        insertButton.setText("Insertar");
        insertButton.setAlignmentY(0.0F);
        insertButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        insertButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertButton.setMaximumSize(new java.awt.Dimension(80, 20));
        insertButton.setMinimumSize(new java.awt.Dimension(80, 20));
        insertButton.setPreferredSize(new java.awt.Dimension(70, 20));
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
        removeButton.setPreferredSize(new java.awt.Dimension(70, 20));
        removeButton.setMnemonic(KeyEvent.VK_E);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        traverseButton.setText("Recorrer");
        traverseButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        traverseButton.setMaximumSize(new java.awt.Dimension(80, 20));
        traverseButton.setMinimumSize(new java.awt.Dimension(80, 20));
        traverseButton.setPreferredSize(new java.awt.Dimension(70, 20));
        traverseButton.setMnemonic(KeyEvent.VK_C);
        traverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traverseButtonActionPerformed(evt);
            }
        });

        traverseOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In-Order", "Pre-Order", "Post-Order" }));

        clearButton.setText("Limpiar");
        clearButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        clearButton.setMaximumSize(new java.awt.Dimension(80, 20));
        clearButton.setMinimumSize(new java.awt.Dimension(80, 20));
        clearButton.setPreferredSize(new java.awt.Dimension(70, 20));
        clearButton.setMnemonic(KeyEvent.VK_L);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        insertRandomButton.setText("Insertar random");
        insertRandomButton.setAlignmentY(0.0F);
        insertRandomButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        insertRandomButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertRandomButton.setMaximumSize(new java.awt.Dimension(80, 20));
        insertRandomButton.setMinimumSize(new java.awt.Dimension(80, 20));
        insertRandomButton.setPreferredSize(new java.awt.Dimension(130, 20));
        insertRandomButton.setMnemonic(KeyEvent.VK_R);
        insertRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRandomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(traverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(traverseOption, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(parameterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parameterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traverseOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parameterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parameterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String text = getText();
        if (text.length() == 0) {
            return;
        }
        controller.insert(text);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String text = getText();
        if (text.length() == 0) {
            return;
        }
        controller.remove(text);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void traverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traverseButtonActionPerformed
        switch(traverseOption.getSelectedIndex()) {
            case 0:
                controller.traverseInOrder();
                break;
            case 1:
                controller.traversePreOrder();
                break;
            case 2:
                controller.traversePostOrder();
                break;
        }
    }//GEN-LAST:event_traverseButtonActionPerformed

    private void parameterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parameterButtonActionPerformed
        int parameter = (Integer)parameterCombo.getSelectedItem();
        controller.changeParameter(parameter);
    }//GEN-LAST:event_parameterButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        controller.clear();
	}//GEN-LAST:event_clearButtonActionPerformed

    private void insertRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRandomButtonActionPerformed
        controller.insertRandom();
    }//GEN-LAST:event_insertRandomButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton insertRandomButton;
    private javax.swing.JLabel parameterLabel;
    private javax.swing.JComboBox parameterCombo;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField textField;
    private javax.swing.JButton traverseButton;
    private javax.swing.JComboBox traverseOption;
    // End of variables declaration//GEN-END:variables
}
