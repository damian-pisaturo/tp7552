package view.collection.stack;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.common.JTextFieldLimit;


import controller.StackController;

/**
 *
 */
public class StackButtonsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private StackController<Integer> controller;

    /** Creates new form BSTButtonsPanel */
    public StackButtonsPanel() {
        initComponents();
    }

    void addController(StackController<Integer> controller) {
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
        this.jlblSize.setEnabled(enable);
    	this.stackSizeComboBox.setEnabled(enable);
    	this.textField.setEnabled(enable);
        if(enable) {
        	this.insertButton.setEnabled(!controller.stackIsFull());
        	this.removeButton.setEnabled(!controller.stackIsEmpty());
        	this.removeAllButton.setEnabled(!controller.stackIsEmpty());
        	this.insertRandomButton.setEnabled(!controller.stackIsFull());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	// setBackground(new java.awt.Color(255, 255, 255));
    	this.setBorder(BorderFactory.createTitledBorder("Control: Stack"));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1 = new JLabel("Ingresá un número de 0 a 999");
        textField = new JTextField();
        textField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));        
        textField.setDocument(new JTextFieldLimit(3));
        textField.putClientProperty("JComponent.sizeVariant", "large");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        Icon addIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Add-icon.png").getPath());
        insertButton = new JButton("Apilar", addIcon);
        insertButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        insertButton.setHorizontalTextPosition(SwingConstants.CENTER);
        insertButton.putClientProperty("JComponent.sizeVariant", "small");
        insertButton.setToolTipText("Agregar elemento a la pila");
        insertButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertButton.setMnemonic(KeyEvent.VK_I);
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        Icon deleteIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Delete-icon.png").getPath());
        removeButton = new JButton("Desapilar", deleteIcon);
        removeButton.setEnabled(false);
        removeButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        removeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        removeButton.putClientProperty("JComponent.sizeVariant", "small");
        removeButton.setToolTipText("Quitar elemento de la pila");
        removeButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        removeButton.setMnemonic(KeyEvent.VK_E);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        Icon cleanIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Refresh-icon.png").getPath());
        removeAllButton = new JButton("Vaciar", cleanIcon);
        removeAllButton.setEnabled(false);
        removeAllButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        removeAllButton.setHorizontalTextPosition(SwingConstants.CENTER);
        removeAllButton.putClientProperty("JComponent.sizeVariant", "small");
        removeAllButton.setToolTipText("Vaciar pila");
        removeAllButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        removeAllButton.setMnemonic(KeyEvent.VK_V);
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllButtonActionPerformed(evt);
            }
        });

        Icon randomIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Help-icon.png").getPath());
        insertRandomButton = new JButton("Random", randomIcon);
        insertRandomButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        insertRandomButton.setHorizontalTextPosition(SwingConstants.CENTER);
        insertRandomButton.putClientProperty("JComponent.sizeVariant", "small");
        insertRandomButton.setToolTipText("Insertar elemento aleatorio");
        insertRandomButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertRandomButton.setMnemonic(KeyEvent.VK_R);
        insertRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRandomButtonActionPerformed(evt);
            }
        });
        
        jlblSize = new JLabel("Tamaño del stack", SwingConstants.RIGHT);
        stackSizeComboBox = new JComboBox();
        stackSizeComboBox.putClientProperty("JComponent.sizeVariant", "large");
        stackSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7"}));
		stackSizeComboBox.setSelectedIndex(0);
		stackSizeComboBox.setKeySelectionManager(null);
		stackSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				stackSizeComboBoxActionPerformed(evt);
			}
		});
		
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSize)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stackSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE)));
                
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSize)
                    .addComponent(stackSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

        );
  
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed

    }//GEN-LAST:event_textFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String text = getText();
        if (text.length() == 0) {
            return;
        }
        controller.pushItem(Integer.valueOf(text));
       
        	
    }//GEN-LAST:event_insertButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        controller.popItem();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        textField.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    private void removeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllButtonActionPerformed
        controller.popAllItem();
    }//GEN-LAST:event_removeAllButtonActionPerformed

    private void insertRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRandomButtonActionPerformed
            Random random = new Random();
            int number = random.nextInt();
            number = Math.abs(number);
            number = number % 100;
            controller.pushItem(number);
        
    }//GEN-LAST:event_insertRandomButtonActionPerformed
    
    private void stackSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_stackSizeComboBoxActionPerformed
		controller.createStack(Integer.valueOf(stackSizeComboBox.getSelectedItem().toString()));
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertButton;
    private javax.swing.JButton insertRandomButton;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField textField;
    private javax.swing.JLabel jlblSize;
    private javax.swing.JComboBox stackSizeComboBox;
    private JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
