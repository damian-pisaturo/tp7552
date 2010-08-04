package view.collection.heap;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.BorderFactory;
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
import controller.HeapController;

/**
 *
 */
public class HeapButtonsPanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private HeapController<Integer> controller;
	// Generador de números aleatorios
    private Random generator = new Random();

    /** Creates new form HeapButtonsPanel */
    public HeapButtonsPanel() {
        initComponents();
    }

    void addController(HeapController<Integer> controller) {
        this.controller = controller;
    }

    private String getText() {
        String text = integerTextField.getText();
        integerTextField.grabFocus();
        integerTextField.selectAll();
        return text;
    }

    /**
     * Habilita o deshabilita todos los controles del panel
     * @param enable
     */
    public void enableComponents(boolean enable) {
        integerTextField.setEnabled(enable);
        jLabel1.setEnabled(enable);
        jLabel2.setEnabled(enable);
        heapSizeComboBox.setEnabled(enable);
        
        insertBtn.setEnabled(enable && !controller.isHeapFull());
        deleteBtn.setEnabled(enable && !controller.isHeapEmpty());
        randomBtn.setEnabled(enable && !controller.isHeapFull());
        cleanBtn.setEnabled(enable && !controller.isHeapEmpty());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        //jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        setBorder(BorderFactory.createTitledBorder("Control: Heap"));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        
        jLabel1 = new JLabel("Ingresá un número de 0 a 999");
        integerTextField = new JTextField();
        integerTextField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        integerTextField.setDocument(new JTextFieldLimit(3));
        integerTextField.putClientProperty("JComponent.sizeVariant", "large");
        
        Icon addIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Add-icon.png").getPath());
        insertBtn = new JButton("Insertar", addIcon);
        insertBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        insertBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        insertBtn.setToolTipText("Insertar elemento en el heap");
        insertBtn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        insertBtn.setMnemonic(KeyEvent.VK_I);
        insertBtn.putClientProperty("JComponent.sizeVariant", "small");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        
        Icon deleteIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Delete-icon.png").getPath());
        deleteBtn = new JButton("Eliminar", deleteIcon);
        deleteBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        deleteBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        deleteBtn.setMnemonic(KeyEvent.VK_E);
        deleteBtn.setToolTipText("Eliminar la raíz del heap");
        deleteBtn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        deleteBtn.putClientProperty("JComponent.sizeVariant", "small");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        
        Icon randomIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Help-icon.png").getPath());
        randomBtn = new JButton("Random", randomIcon);
        randomBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        randomBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        randomBtn.setToolTipText("Insertar elemento aleatorio");
        randomBtn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        randomBtn.putClientProperty("JComponent.sizeVariant", "small");
        randomBtn.setMnemonic(KeyEvent.VK_R);
        randomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomBtnActionPerformed(evt);
            }
        });
        
        Icon cleanIcon = new ImageIcon(getClass().getClassLoader().getResource("Button-Refresh-icon.png").getPath());
        cleanBtn = new JButton("Limpiar", cleanIcon);
        cleanBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        cleanBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        cleanBtn.setToolTipText("Comenzar de nuevo");
        cleanBtn.setMargin(new java.awt.Insets(2, 5, 2, 5));
        cleanBtn.putClientProperty("JComponent.sizeVariant", "small");
        cleanBtn.setMnemonic(KeyEvent.VK_L);
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });
        
        jLabel2 = new JLabel("Tamaño del heap", SwingConstants.RIGHT);
        heapSizeComboBox = new JComboBox();
        heapSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        heapSizeComboBox.setSelectedIndex(24);
        heapSizeComboBox.setKeySelectionManager(null);
        heapSizeComboBox.setToolTipText("Tamaño del heap");
        heapSizeComboBox.putClientProperty("JComponent.sizeVariant", "large");
        heapSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heapSizeComboBoxActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(integerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(randomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(heapSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(integerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(randomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(heapSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
        );
        
    }// </editor-fold>//GEN-END:initComponents

private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed

    try {
    	String text = getText();
    	if (text.length() == 0) {
    		return;
    	}
        Integer valueToInsert = Integer.valueOf(text);
        if (valueToInsert < 0 || valueToInsert > 999) {
            return;
        }
        controller.addItem(Integer.valueOf(text));
    } catch (Exception e) {
        setEnabled(true);
    } finally {
        integerTextField.setText("");
    }
    
}//GEN-LAST:event_insertBtnActionPerformed

private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    controller.deleteItem();
}//GEN-LAST:event_deleteBtnActionPerformed

private void randomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomBtnActionPerformed
    int intGenerated = generator.nextInt(999) + 1;
    integerTextField.setText(String.valueOf(intGenerated));
    insertBtnActionPerformed(evt);
}//GEN-LAST:event_randomBtnActionPerformed

private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
    int res = JOptionPane.showConfirmDialog(null, "Se eliminarán todos los elementos.\n¿Continuar?",
            "Limpiar", JOptionPane.YES_NO_OPTION);

    if (res == 0) {
        controller.clear();
    }
}//GEN-LAST:event_cleanBtnActionPerformed

private void heapSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heapSizeComboBoxActionPerformed
	int res = JOptionPane.showConfirmDialog(null, "Se eliminarán todos los elementos.\n¿Continuar?",
            "Nuevo tamaño", JOptionPane.YES_NO_OPTION);

    if (res == 0) {
    	controller.setNewCapacity(getSelectedCapacity());
    } else {
    	heapSizeComboBox.setSelectedItem(String.valueOf(controller.getHeapCapacity()));
    }
}//GEN-LAST:event_heapSizeComboBoxActionPerformed

private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    integerTextField.requestFocusInWindow();
}//GEN-LAST:event_formFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox heapSizeComboBox;
    private javax.swing.JButton insertBtn;
    private javax.swing.JTextField integerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton randomBtn;
    // End of variables declaration//GEN-END:variables
    
    public int getSelectedCapacity() {
    	return Integer.valueOf(heapSizeComboBox.getSelectedItem().toString());
    }

}