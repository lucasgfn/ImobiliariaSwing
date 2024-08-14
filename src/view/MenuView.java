package view;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnInicio = new javax.swing.JMenu();
        MnCliente = new javax.swing.JMenu();
        MiCadCliente = new javax.swing.JMenuItem();
        MiConCliente = new javax.swing.JMenuItem();
        MiConNome = new javax.swing.JMenuItem();
        MnCasa = new javax.swing.JMenu();
        MiCadImovel = new javax.swing.JMenuItem();
        MiConImovel = new javax.swing.JMenuItem();
        MnApartamento = new javax.swing.JMenu();
        MiCadastroApartamento = new javax.swing.JMenuItem();
        MiConsultaApartamento = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Uma lar para sua família");

        jLabel2.setFont(new java.awt.Font("Kailasa", 1, 48)); // NOI18N
        jLabel2.setText("Imobiliaria Spercosk");

        MnInicio.setText("Início ");
        jMenuBar1.add(MnInicio);

        MnCliente.setText("Cliente");

        MiCadCliente.setText("Cadastrar");
        MiCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCadClienteActionPerformed(evt);
            }
        });
        MnCliente.add(MiCadCliente);

        MiConCliente.setText("Consutar ");
        MiConCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConClienteActionPerformed(evt);
            }
        });
        MnCliente.add(MiConCliente);

        MiConNome.setText("Consultar Por Nome ");
        MiConNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConNomeActionPerformed(evt);
            }
        });
        MnCliente.add(MiConNome);

        jMenuBar1.add(MnCliente);

        MnCasa.setText("Casa");

        MiCadImovel.setText("Cadastrar");
        MiCadImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCadImovelActionPerformed(evt);
            }
        });
        MnCasa.add(MiCadImovel);

        MiConImovel.setText("Consultar");
        MiConImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConImovelActionPerformed(evt);
            }
        });
        MnCasa.add(MiConImovel);

        jMenuBar1.add(MnCasa);

        MnApartamento.setText("Apartamento");

        MiCadastroApartamento.setText("Cadastrar");
        MiCadastroApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCadastroApartamentoActionPerformed(evt);
            }
        });
        MnApartamento.add(MiCadastroApartamento);

        MiConsultaApartamento.setText("Consultar");
        MiConsultaApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConsultaApartamentoActionPerformed(evt);
            }
        });
        MnApartamento.add(MiConsultaApartamento);

        jMenuBar1.add(MnApartamento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCadClienteActionPerformed

        new CadastroClienteView().setVisible(true);
    }//GEN-LAST:event_MiCadClienteActionPerformed

    private void MiConClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConClienteActionPerformed
        new ConsultaClienteView().setVisible(true);
    }//GEN-LAST:event_MiConClienteActionPerformed

    private void MiConNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConNomeActionPerformed
        new ConsultaClientePorNomeView(0, "").setVisible(true);
    }//GEN-LAST:event_MiConNomeActionPerformed

    private void MiConImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConImovelActionPerformed
        new ConsultaCasaView().setVisible(true);
    }//GEN-LAST:event_MiConImovelActionPerformed

    private void MiCadastroApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCadastroApartamentoActionPerformed
        new CadastroApartamentoView().setVisible(true);
    }//GEN-LAST:event_MiCadastroApartamentoActionPerformed

    private void MiConsultaApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConsultaApartamentoActionPerformed
        new ConsultaApartamentoView().setVisible(true);
    }//GEN-LAST:event_MiConsultaApartamentoActionPerformed

    private void MiCadImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCadImovelActionPerformed
        new CadastroCasaView().setVisible(true);
    }//GEN-LAST:event_MiCadImovelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MiCadCliente;
    private javax.swing.JMenuItem MiCadImovel;
    private javax.swing.JMenuItem MiCadastroApartamento;
    private javax.swing.JMenuItem MiConCliente;
    private javax.swing.JMenuItem MiConImovel;
    private javax.swing.JMenuItem MiConNome;
    private javax.swing.JMenuItem MiConsultaApartamento;
    private javax.swing.JMenu MnApartamento;
    private javax.swing.JMenu MnCasa;
    private javax.swing.JMenu MnCliente;
    private javax.swing.JMenu MnInicio;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
