package pizzapp;

import javax.swing.JOptionPane;

public class PizzApp extends javax.swing.JFrame {

    public double meretSzorzo = 1;  // 32 cm
    public int alapAr = 1750;         // -1 = nincs ára
    public int extrak;              // extra feltétek
    public int db;                  // Pizza darabszáma
    public double osszeg;           // Végső ár
    public String pizzaOsszesites;
    
    int extra1 = 0;
    int extra2 = 0;
    int extra3 = 0;
    
    public String jOptSzoveg;
    public PizzApp() {
        initComponents();
        
        /*int tempAr = Integer.parseInt(lblAr.getText());
        String arSzoveg = toString(tempAr);*/
        
        //int db = numDb.getValue();
        
        //if (numDb.getValue() > 0){}

        osszegSzamolas(db);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_meret = new javax.swing.ButtonGroup();
        lblValaszthato = new javax.swing.JLabel();
        cmdValaszthatoPizzak = new javax.swing.JComboBox<>();
        pnlMeret = new javax.swing.JPanel();
        rdbMeret25 = new javax.swing.JRadioButton();
        rdbMeret32 = new javax.swing.JRadioButton();
        pnlFizetendo = new javax.swing.JPanel();
        lblfizDb = new javax.swing.JLabel();
        lblFizFt = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        numDb = new javax.swing.JSpinner();
        pnlExtrak = new javax.swing.JPanel();
        chbSajt = new javax.swing.JCheckBox();
        chbHagyma = new javax.swing.JCheckBox();
        chbAnanasz = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        btnRendel = new javax.swing.JButton();
        lblOsszesito = new javax.swing.JLabel();
        lblKep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzApp");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblValaszthato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValaszthato.setText("Választható pizza:");

        cmdValaszthatoPizzak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Margherita", "Hawaii", "Songoku", "Diavola" }));
        cmdValaszthatoPizzak.setSelectedIndex(2);
        cmdValaszthatoPizzak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValaszthatoPizzakActionPerformed(evt);
            }
        });

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder("Méret"));

        btnG_meret.add(rdbMeret25);
        rdbMeret25.setText("25 cm");
        rdbMeret25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbMeret25ItemStateChanged(evt);
            }
        });

        btnG_meret.add(rdbMeret32);
        rdbMeret32.setSelected(true);
        rdbMeret32.setText("32 cm");
        rdbMeret32.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbMeret32ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMeret25, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbMeret32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addComponent(rdbMeret25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbMeret32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFizetendo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fizetendő"));

        lblfizDb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfizDb.setText("db:");

        lblFizFt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblFizFt.setText("Ft");

        lblAr.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblAr.setForeground(new java.awt.Color(0, 204, 0));
        lblAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAr.setText("0");

        numDb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        numDb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numDbStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFizetendoLayout = new javax.swing.GroupLayout(pnlFizetendo);
        pnlFizetendo.setLayout(pnlFizetendoLayout);
        pnlFizetendoLayout.setHorizontalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblfizDb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        pnlFizetendoLayout.setVerticalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfizDb))
                .addContainerGap())
        );

        pnlExtrak.setBorder(javax.swing.BorderFactory.createTitledBorder("Extrák"));

        chbSajt.setText("sajt");
        chbSajt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbSajtItemStateChanged(evt);
            }
        });

        chbHagyma.setText("hagyma");
        chbHagyma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbHagymaItemStateChanged(evt);
            }
        });

        chbAnanasz.setText("ananász");
        chbAnanasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbAnanaszItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSajt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbHagyma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbAnanasz, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addComponent(chbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbAnanasz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        jScrollPane1.setViewportView(txaOsszesito);

        btnRendel.setText("Megrendelem");
        btnRendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelActionPerformed(evt);
            }
        });

        lblOsszesito.setText("Összestő:");

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pizza.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValaszthato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdValaszthatoPizzak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRendel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRendel, cmdValaszthatoPizzak, pnlFizetendo, pnlMeret});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lblOsszesito))
                            .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValaszthato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdValaszthatoPizzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRendel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdValaszthatoPizzakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValaszthatoPizzakActionPerformed
        // A combobox nevét elírtam, cmb helyett cmd-ként referálok rá ebben a kódban.
        
        int pizzaIndex = cmdValaszthatoPizzak.getSelectedIndex();
        
        // (-1)-el jelöljük, hogy nincs ára a pizzának.
        /*switch(pizzaIndex){
        case (0):
            alapAr = 1600;
            break;
        case (1):
            alapAr = 1650;
            break;
        case (2):
            alapAr = 1750;
            break;
        case (3):
            alapAr = 1800;
            break;       
        }
        */
        if (pizzaIndex == 0){
            alapAr = 1600;
        }
        else if (pizzaIndex == 1){
            alapAr = 1650;
        }
        else if (pizzaIndex == 2){
            alapAr = 1750;
        }
        else if (pizzaIndex == 3){
            alapAr = 1800;
        }
        
        
        //int db = numDb.getValue();
        db = 1;
        
        osszegSzamolas(db);
        osszesitesKiiras();
    }//GEN-LAST:event_cmdValaszthatoPizzakActionPerformed

    private void rdbMeret32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbMeret32ItemStateChanged
        meretSzorzo = 1;
        osszegSzamolas(db);
        osszesitesKiiras();
    }//GEN-LAST:event_rdbMeret32ItemStateChanged

    private void rdbMeret25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbMeret25ItemStateChanged
        meretSzorzo = .75;
        osszegSzamolas(db);
        osszesitesKiiras();
    }//GEN-LAST:event_rdbMeret25ItemStateChanged

    private void numDbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numDbStateChanged
        osszegSzamolas(db);
        osszesitesKiiras();
    }//GEN-LAST:event_numDbStateChanged

    private void chbAnanaszItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbAnanaszItemStateChanged
        
        if(chbAnanasz.isSelected() == true){
            extra1 = 200;
        }
        else{
            extra1 = 0;
        }
        extrakSzamolas();
        osszesitesKiiras();
    }//GEN-LAST:event_chbAnanaszItemStateChanged

    private void chbHagymaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbHagymaItemStateChanged
        
        if(chbHagyma.isSelected() == true){
            extra2 = 250;
        }
        else{
            extra2 = 0;
        }
        extrakSzamolas();
        osszesitesKiiras();
    }//GEN-LAST:event_chbHagymaItemStateChanged

    private void chbSajtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbSajtItemStateChanged
        
        if(chbSajt.isSelected() == true){
            extra3 = 300;
        }
        else{
            extra3 = 0;
        }
        extrakSzamolas();
        osszesitesKiiras();
    }//GEN-LAST:event_chbSajtItemStateChanged

    private void btnRendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelActionPerformed
        int osszegSeged = (int) Math.round(osszeg);
        
        jOptSzoveg = "Köszönjük a rendelését! \n" + osszegSeged + " Ft lesz.";
        JOptionPane.showMessageDialog(rootPane, jOptSzoveg);
    }//GEN-LAST:event_btnRendelActionPerformed

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
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_meret;
    private javax.swing.JButton btnRendel;
    private javax.swing.JCheckBox chbAnanasz;
    private javax.swing.JCheckBox chbHagyma;
    private javax.swing.JCheckBox chbSajt;
    private javax.swing.JComboBox<String> cmdValaszthatoPizzak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblFizFt;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblOsszesito;
    private javax.swing.JLabel lblValaszthato;
    private javax.swing.JLabel lblfizDb;
    private javax.swing.JSpinner numDb;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlFizetendo;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JRadioButton rdbMeret25;
    private javax.swing.JRadioButton rdbMeret32;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables

    private void osszegSzamolas(int db1) {
        //Ki is írja a label-be.
        dbSzamolas(db);
        osszeg = (alapAr * meretSzorzo + extrak);
        osszeg *= db; //vegsoAr = vegsoAr * db;
        
        lblAr.setText(osszeg + ""); //Szöveggé konvertálni nem kell, + " " -el működik!!!!!!!!!
    }

    private void dbSzamolas(int db1) {
        String pizzaDb = numDb.getValue() + ""; 
        db = Integer.parseInt(pizzaDb);
        
    }

    private void extrakSzamolas() {
        extrak = extra1 + extra2 + extra3;
        osszegSzamolas(db);
    }
    
    private void osszesitesKiiras() {
        //pizzafajta
        String cmbPizzaStr = cmdValaszthatoPizzak.getSelectedItem().toString();
        
        //pizzaméret
        String meretStr = "";
        if (rdbMeret25.isSelected() == true){
            meretStr = "25 cm";
        }
        else if (rdbMeret32.isSelected() == true){
            meretStr = "32 cm";
        }
        else meretStr = "";
        
        //extrák
        String extrakStr = "";
        String segedExtra = "";
        if (chbAnanasz.isSelected() == true){
            segedExtra = "ananász, ";
            extrakStr += segedExtra;
        }
        else {
            extrakStr = extrakStr.replace("ananász, ", "");
        }
        
        if (chbHagyma.isSelected() == true){
            segedExtra = "hagyma, ";
            extrakStr += segedExtra;
        }
        else {
            extrakStr = extrakStr.replace("hagyma, ", "");
        }
        
        if (chbSajt.isSelected() == true){
            segedExtra = "sajt, ";
            extrakStr += segedExtra;
        }
        else {
            extrakStr = extrakStr.replace("sajt, ", "");
        }
        
        //darab
        String dbStr = numDb.getValue().toString();
        
        //összeg
        int osszegSeged = (int) Math.round(osszeg);
        
                
        pizzaOsszesites = "" + cmbPizzaStr + ", " + meretStr + ", " + extrakStr + dbStr + "db\nÖsszesen: " + osszegSeged + " Ft.";
        txaOsszesito.setText(pizzaOsszesites);
    }
    
}

