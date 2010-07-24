package view.collection.queue;

import java.awt.BorderLayout;

import controller.QueueController;

/**
 *
 */
public class QueuePanel<T> extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private QueueView<T> view;

    public QueuePanel(QueueView<T> view) {
        initComponents();
        this.view = view;
        this.add(view, BorderLayout.CENTER);
    }

    public void addController(QueueController<Integer> controller) {
        this.view.addController(controller);
        this.buttonsPanel.addController(controller);
    }

    public QueueView<T> getView() {
        return view;
    }

    public QueueButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new view.collection.queue.QueueButtonsPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());
        add(buttonsPanel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.collection.queue.QueueButtonsPanel buttonsPanel;
    // End of variables declaration//GEN-END:variables

}
