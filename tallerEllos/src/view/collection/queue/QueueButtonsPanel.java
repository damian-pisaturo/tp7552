package view.collection.queue;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.common.JTextFieldLimit;
import controller.QueueController;

/**
 *
 */
public class QueueButtonsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private QueueController<Integer> controller;

    /** Creates new form BSTButtonsPanel */
    public QueueButtonsPanel() {
        initComponents();
    }

    void addController(QueueController<Integer> controller) {
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
        this.textField.setEnabled(enable);
        this.jLabel1.setEnabled(enable);
        this.jLabel2.setEnabled(enable);
        this.queueSizeComboBox.setEnabled(enable);
       
        this.insertButton.setEnabled(enable && !controller.isQueueFull());
        this.removeButton.setEnabled(enable && !controller.isQueueEmpty());
        this.removeAllButton.setEnabled(enable && !controller.isQueueEmpty());
        this.insertRandomButton.setEnabled(enable && !controller.isQueueFull());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	//setBackground(new java.awt.Color(255, 255, 255));
        //setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        //setPreferredSize(new java.awt.Dimension(746, 32));
    	setBorder(BorderFactory.createTitledBorder("Control: Queue"));
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
        insertButton = new JButton("Encolar", addIcon);
        insertButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        insertButton.setHorizontalTextPosition(SwingConstants.CENTER);
        insertButton.putClientProperty("JComponent.sizeVariant", "small");
        insertButton.setToolTipText("Insertar elemento en la cola");
        insertButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertButton.setMnemonic(KeyEvent.VK_E);
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        
        Icon deleteIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Delete-icon.png").getPath());
        removeButton = new JButton("Desencolar", deleteIcon);
        removeButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        removeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        removeButton.putClientProperty("JComponent.sizeVariant", "small");
        removeButton.setToolTipText("Eliminar top de la cola");
        removeButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        removeButton.setMnemonic(KeyEvent.VK_D);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        
        Icon cleanIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Refresh-icon.png").getPath());
        removeAllButton = new JButton("Vaciar", cleanIcon);
        removeAllButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        removeAllButton.setHorizontalTextPosition(SwingConstants.CENTER);
        removeAllButton.putClientProperty("JComponent.sizeVariant", "small");
        removeAllButton.setToolTipText("Vaciar cola");
        removeAllButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        removeAllButton.setMnemonic(KeyEvent.VK_L);
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

        jLabel2 = new JLabel("Tamaño del queue", SwingConstants.RIGHT);
        queueSizeComboBox = new JComboBox();
        queueSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        queueSizeComboBox.setSelectedIndex(4);
        queueSizeComboBox.setKeySelectionManager(null);
        queueSizeComboBox.setToolTipText("Tamaño del queue");
        queueSizeComboBox.putClientProperty("JComponent.sizeVariant", "large");
        queueSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	queueSizeComboBoxActionPerformed(evt);
            }
        });
       
        GroupLayout layout = new GroupLayout(this);
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
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(queueSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(insertRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(removeAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(queueSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
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
        int res = JOptionPane.showConfirmDialog(null, "Se eliminarán todos los elementos.\n¿Continuar?",
                "Vaciar", JOptionPane.YES_NO_OPTION);

        if (res == 0) {
            controller.clear();
        }
    	
    }//GEN-LAST:event_removeAllButtonActionPerformed

    private void insertRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRandomButtonActionPerformed
        for (int counter = 1; counter <= 1; counter++) {
            Random random = new Random();
            int number = random.nextInt(999) + 1;
            controller.enqueueItem(number);
        }
    }//GEN-LAST:event_insertRandomButtonActionPerformed

    private void queueSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_stackSizeComboBoxActionPerformed
    	int res = JOptionPane.showConfirmDialog(null, "Se eliminarán todos los elementos.\n¿Continuar?",
                "Nuevo tamaño", JOptionPane.YES_NO_OPTION);

        if (res == 0) {
        	controller.setNewCapacity(getSelectedCapacity());
        } else {
        	queueSizeComboBox.setSelectedItem(String.valueOf(controller.getQueueCapacity()));
        }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton insertButton;
    private JButton insertRandomButton;
    private JButton removeAllButton;
    private JButton removeButton;
    private JTextField textField;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JComboBox queueSizeComboBox;
    // End of variables declaration//GEN-END:variables
    
    public int getSelectedCapacity() {
    	return Integer.valueOf(queueSizeComboBox.getSelectedItem().toString());
    }

}
