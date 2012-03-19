package view;

/**
 *
 * @author Andreas
 */
public class MineMoterPanel extends javax.swing.JPanel {

    /**
     * Creates new form MineMoterPanel
     */
    public MineMoterPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tittelLabel = new javax.swing.JLabel();
        mineMoterScrollPane = new javax.swing.JScrollPane();
        mineMoterListe = new javax.swing.JList();
        visMoteKnapp = new javax.swing.JButton();
        redigerMoteKnapp = new javax.swing.JButton();
        fjernMoteKnapp = new javax.swing.JButton();
        personerPanel = new javax.swing.JPanel();
        godtattScrollPane = new javax.swing.JScrollPane();
        godtattListe = new javax.swing.JList();
        avslaattScrollPane = new javax.swing.JScrollPane();
        avslaattListe = new javax.swing.JList();
        avventerScrollPane = new javax.swing.JScrollPane();
        avventerListe = new javax.swing.JList();
        godtattLabel = new javax.swing.JLabel();
        avslaattLabel = new javax.swing.JLabel();
        avventerLabel = new javax.swing.JLabel();
        fjernGodtattKnapp = new javax.swing.JButton();
        fjernAvslaattKnapp = new javax.swing.JButton();
        fjernAvventerKnapp = new javax.swing.JButton();
        avslaattSumLabel = new javax.swing.JLabel();
        avventerSumLabel = new javax.swing.JLabel();
        godtattSumLabel = new javax.swing.JLabel();
        tilbakeKnapp = new javax.swing.JButton();
        nyttMoteKnapp = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(640, 480));
        setLayout(new java.awt.GridBagLayout());

        tittelLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tittelLabel.setText("Mine m�ter:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(tittelLabel, gridBagConstraints);

        mineMoterScrollPane.setPreferredSize(new java.awt.Dimension(475, 125));

        mineMoterListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mineMoterScrollPane.setViewportView(mineMoterListe);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        add(mineMoterScrollPane, gridBagConstraints);

        visMoteKnapp.setText("Vis M�te");
        visMoteKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visMoteKnappActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(visMoteKnapp, gridBagConstraints);

        redigerMoteKnapp.setText("Rediger M�te");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(redigerMoteKnapp, gridBagConstraints);

        fjernMoteKnapp.setText("Fjern M�te");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(fjernMoteKnapp, gridBagConstraints);

        personerPanel.setPreferredSize(new java.awt.Dimension(450, 220));
        personerPanel.setLayout(new java.awt.GridBagLayout());

        godtattScrollPane.setPreferredSize(new java.awt.Dimension(100, 125));

        godtattListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        godtattListe.setPreferredSize(new java.awt.Dimension(40, 120));
        godtattScrollPane.setViewportView(godtattListe);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        personerPanel.add(godtattScrollPane, gridBagConstraints);

        avslaattScrollPane.setPreferredSize(new java.awt.Dimension(100, 125));

        avslaattListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        avslaattListe.setPreferredSize(new java.awt.Dimension(40, 120));
        avslaattScrollPane.setViewportView(avslaattListe);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        personerPanel.add(avslaattScrollPane, gridBagConstraints);

        avventerScrollPane.setPreferredSize(new java.awt.Dimension(100, 125));

        avventerListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        avventerListe.setPreferredSize(new java.awt.Dimension(40, 120));
        avventerScrollPane.setViewportView(avventerListe);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        personerPanel.add(avventerScrollPane, gridBagConstraints);

        godtattLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        godtattLabel.setText("Godtatt:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        personerPanel.add(godtattLabel, gridBagConstraints);

        avslaattLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        avslaattLabel.setText("Avsl�tt:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        personerPanel.add(avslaattLabel, gridBagConstraints);

        avventerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        avventerLabel.setText("Avventer svar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        personerPanel.add(avventerLabel, gridBagConstraints);

        fjernGodtattKnapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/minus16-red-icon.png"))); // NOI18N
        fjernGodtattKnapp.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        personerPanel.add(fjernGodtattKnapp, gridBagConstraints);

        fjernAvslaattKnapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/minus16-red-icon.png"))); // NOI18N
        fjernAvslaattKnapp.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        personerPanel.add(fjernAvslaattKnapp, gridBagConstraints);

        fjernAvventerKnapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/minus16-red-icon.png"))); // NOI18N
        fjernAvventerKnapp.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        personerPanel.add(fjernAvventerKnapp, gridBagConstraints);

        avslaattSumLabel.setText("Sum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        personerPanel.add(avslaattSumLabel, gridBagConstraints);

        avventerSumLabel.setText("Sum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        personerPanel.add(avventerSumLabel, gridBagConstraints);

        godtattSumLabel.setText("Sum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        personerPanel.add(godtattSumLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        add(personerPanel, gridBagConstraints);

        tilbakeKnapp.setText("Tilbake");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(tilbakeKnapp, gridBagConstraints);

        nyttMoteKnapp.setText("Nytt M�te");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(nyttMoteKnapp, gridBagConstraints);
    }// </editor-fold>

    private void visMoteKnappActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel avslaattLabel;
    private javax.swing.JList avslaattListe;
    private javax.swing.JScrollPane avslaattScrollPane;
    private javax.swing.JLabel avslaattSumLabel;
    private javax.swing.JLabel avventerLabel;
    private javax.swing.JList avventerListe;
    private javax.swing.JScrollPane avventerScrollPane;
    private javax.swing.JLabel avventerSumLabel;
    private javax.swing.JButton fjernAvslaattKnapp;
    private javax.swing.JButton fjernAvventerKnapp;
    private javax.swing.JButton fjernGodtattKnapp;
    private javax.swing.JButton fjernMoteKnapp;
    private javax.swing.JLabel godtattLabel;
    private javax.swing.JList godtattListe;
    private javax.swing.JScrollPane godtattScrollPane;
    private javax.swing.JLabel godtattSumLabel;
    private javax.swing.JList mineMoterListe;
    private javax.swing.JScrollPane mineMoterScrollPane;
    private javax.swing.JButton nyttMoteKnapp;
    private javax.swing.JPanel personerPanel;
    private javax.swing.JButton redigerMoteKnapp;
    private javax.swing.JButton tilbakeKnapp;
    private javax.swing.JLabel tittelLabel;
    private javax.swing.JButton visMoteKnapp;
    // End of variables declaration
}