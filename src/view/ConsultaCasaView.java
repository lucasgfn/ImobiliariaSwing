package view;


import controller.CasaController;
import controller.ClienteController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Apartamento;
import model.Casa;


public class ConsultaCasaView extends javax.swing.JFrame {
    int id=0;
    String nome = "";
    String endereco = "";
    int numero = 0;
    int capacidade = 0;
    int vagasgaragem = 0;
    int quantquartos = 0;
    int quantbanheiros = 0;
    int numeroandar = 0;
    double preco = 0;
    String tipo = "casa";
    
    Casa casa = new Casa();
   
    
    public ConsultaCasaView() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisaNome = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btConsultarTodos = new javax.swing.JButton();
        btAtribuir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Imovel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Casa", "Nome", "Endereco", "Numero", "Capacidade", "Vagas Garagem", "Quartos(Qnt)", "Banheiros(Qnt)", "Numero de Andares", "Preço", "Cliente"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Listar Casa");

        tfPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaNomeActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btConsultarTodos.setText("Consultar Todos");
        btConsultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTodosActionPerformed(evt);
            }
        });

        btAtribuir.setText("Atribuir Cliente");
        btAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtribuirActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsultarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAtribuir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btConsultarTodos)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtribuir))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaNomeActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
         try{
            CasaController ctc = new CasaController();
            int linha = jTable1.getSelectedRow();
            int id = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
            
            ctc.excluir(id);
            
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(linha);
            
            
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                                          

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Casa casa = new Casa(id, nome, endereco, numero, capacidade, vagasgaragem, quantquartos, quantbanheiros, numeroandar, preco);
        casa.setId(this.casa.getId());
        System.out.println(casa.getId());
        
        
        new AtualizarCasaView(casa).setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btAtualizar.setEnabled(false);
        btAtribuir.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
       try{       
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            CasaController ctr = new CasaController();

            ctr.consultarPorNome((tfPesquisaNome.getText()));

             modelo.setRowCount(0);
      
            List<Casa> casas = (List<Casa>) ctr.consultarPorNome(tfPesquisaNome.getText());

             if (casas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.");
            } else{              
                for (Casa c1 : casas) {
                    modelo.addRow(new Object[]{
                        c1.getId(),
                        c1.getNomeImovel(),
                        c1.getEndereco(),
                        c1.getNumero(),
                        c1.getCapacidade(),
                        c1.getQntVagasGaragem(),
                        c1.getQntQuartos(),
                        c1.getQntBanheiros(),
                        c1.getQntAndar(),
                        c1.getPreco(),
                        
                       
                    });
                }
            }
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btConsultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTodosActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       
       
       CasaController ctr = new CasaController();
       List<Casa> casas = ctr.consultarTodos();
         
       

        for(Casa c1: casas){
            modelo.addRow(new Object[]{
                        (c1.getId()),
                        c1.getNomeImovel(),
                        c1.getEndereco(),
                        c1.getNumero(),
                        c1.getCapacidade(),
                        c1.getQntVagasGaragem(),
                        c1.getQntQuartos(),
                        c1.getQntBanheiros(),
                        c1.getQntAndar(),
                        c1.getPreco(),
                        c1.getCliente_id()
          
            });
        }
    }//GEN-LAST:event_btConsultarTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        id = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
        System.out.println(id);
        casa.setId(Integer.parseInt(jTable1.getValueAt(linha, 0).toString()));
        nome = jTable1.getValueAt(linha, 1).toString();
        endereco = jTable1.getValueAt(linha, 2).toString();
        numero = Integer.parseInt(jTable1.getValueAt(linha, 3).toString());
        capacidade = Integer.parseInt(jTable1.getValueAt(linha,4).toString());
        vagasgaragem = Integer.parseInt(jTable1.getValueAt(linha,5).toString());
        quantquartos = Integer.parseInt(jTable1.getValueAt(linha,6).toString());
        quantbanheiros = Integer.parseInt(jTable1.getValueAt(linha,7).toString());
        numeroandar = Integer.parseInt(jTable1.getValueAt(linha,8).toString());
        preco = Double.parseDouble(jTable1.getValueAt(linha,9).toString());
        btAtualizar.setEnabled(true);
        btAtribuir.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtribuirActionPerformed
        new ConsultaClientePorNomeView(id, tipo).setVisible(true);

    }//GEN-LAST:event_btAtribuirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtribuir;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConsultarTodos;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfPesquisaNome;
    // End of variables declaration//GEN-END:variables
}
