
package my.ugtrivia;


public class UGTrivia_Quizz extends javax.swing.JPanel {

    
    public UGTrivia_Quizz() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jToolBar1 = new javax.swing.JToolBar();
        panel1 = new java.awt.Panel();
        canvas1 = new java.awt.Canvas();
        lblquestionB = new javax.swing.JLabel();
        lblquestionA = new javax.swing.JLabel();
        lblquestionE = new javax.swing.JLabel();
        lblquestionC = new javax.swing.JLabel();
        lblquestionD = new javax.swing.JLabel();
        lblquestionmain = new javax.swing.JLabel();
        lblanswer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jToolBar2 = new javax.swing.JToolBar();
        panel2 = new java.awt.Panel();
        canvas2 = new java.awt.Canvas();
        lblquestionB1 = new javax.swing.JLabel();
        lblquestionA1 = new javax.swing.JLabel();
        lblquestionE1 = new javax.swing.JLabel();
        lblquestionC1 = new javax.swing.JLabel();
        lblquestionD1 = new javax.swing.JLabel();
        lblquestionmain1 = new javax.swing.JLabel();
        lblanswer1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setName("panelmain"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTree1.setForeground(new java.awt.Color(0, 51, 51));
        jTree1.setName("treecourse"); // NOI18N
        jScrollPane1.setViewportView(jTree1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 183, 436));

        jToolBar1.setRollover(true);
        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 790, 32));

        panel1.setName("panelquizz"); // NOI18N

        lblquestionB.setBackground(java.awt.Color.orange);
        lblquestionB.setName("lblquestionB"); // NOI18N

        lblquestionA.setBackground(java.awt.Color.orange);
        lblquestionA.setName("lblquestionA"); // NOI18N

        lblquestionE.setBackground(java.awt.Color.orange);
        lblquestionE.setName("lblquestionD"); // NOI18N

        lblquestionC.setBackground(java.awt.Color.orange);
        lblquestionC.setName("lblquestionC"); // NOI18N

        lblquestionD.setBackground(java.awt.Color.orange);
        lblquestionD.setName("lblquestionD"); // NOI18N

        lblquestionmain.setBackground(java.awt.Color.orange);
        lblquestionmain.setName("lblquestionmain"); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblquestionmain, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(lblquestionE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(lblquestionD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblquestionmain, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblquestionA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblquestionB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        lblanswer.setName("lblquestionmain"); // NOI18N
        add(lblanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 460, 127));

        jButton1.setText("Next");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 80, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName("panelmain"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTree2.setForeground(new java.awt.Color(0, 51, 51));
        jTree2.setName("treecourse"); // NOI18N
        jScrollPane2.setViewportView(jTree2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 183, 436));

        jToolBar2.setRollover(true);
        jPanel1.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 790, 32));

        panel2.setName("panelquizz"); // NOI18N

        lblquestionB1.setBackground(java.awt.Color.orange);
        lblquestionB1.setName("lblquestionB"); // NOI18N

        lblquestionA1.setBackground(java.awt.Color.orange);
        lblquestionA1.setName("lblquestionA"); // NOI18N

        lblquestionE1.setBackground(java.awt.Color.orange);
        lblquestionE1.setName("lblquestionD"); // NOI18N

        lblquestionC1.setBackground(java.awt.Color.orange);
        lblquestionC1.setName("lblquestionC"); // NOI18N

        lblquestionD1.setBackground(java.awt.Color.orange);
        lblquestionD1.setName("lblquestionD"); // NOI18N

        lblquestionmain1.setBackground(java.awt.Color.orange);
        lblquestionmain1.setName("lblquestionmain"); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblquestionmain1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(lblquestionE1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(lblquestionD1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionB1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblquestionA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblquestionmain1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblquestionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblquestionB1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionD1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquestionE1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        lblanswer1.setName("lblquestionmain"); // NOI18N
        jPanel1.add(lblanswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 460, 127));

        jButton2.setText("Next");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 80, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    private javax.swing.JLabel lblanswer;
    private javax.swing.JLabel lblanswer1;
    private javax.swing.JLabel lblquestionA;
    private javax.swing.JLabel lblquestionA1;
    private javax.swing.JLabel lblquestionB;
    private javax.swing.JLabel lblquestionB1;
    private javax.swing.JLabel lblquestionC;
    private javax.swing.JLabel lblquestionC1;
    private javax.swing.JLabel lblquestionD;
    private javax.swing.JLabel lblquestionD1;
    private javax.swing.JLabel lblquestionE;
    private javax.swing.JLabel lblquestionE1;
    private javax.swing.JLabel lblquestionmain;
    private javax.swing.JLabel lblquestionmain1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
