/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ApartamentoController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Apartamento;
import model.Casa;


/**
 *
 * @author lucas
 */
public class ConsultaApartamentoView extends javax.swing.JFrame {
    int linha = 0;
    int id = 0;
    String nome = "";
    String endereco = "";
    int numero = 0;
    int capacidade = 0;
    int vagasgaragem = 0;
    int quantquartos = 0;
    int quantbanheiros = 0;
    int numeroapartamento = 0;
    boolean elevador = true;
    double preco = 0;
    String tipo = "apartamento";
    
    Apartamento apt = new Apartamento();
    
    public ConsultaApartamentoView() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfPesquisaNome = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsultarTodos = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btAtribuir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Lista Apartamentos");

        tfPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaNomeActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultarTodos.setText("Consultar Todos");
        btConsultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTodosActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Apartamento", "Nome", "Endereco", "Numero", "Capacidade", "Vagas Garagem", "Quartos(Qnt)", "Banheiros(Qnt)", "N Apartamento", "Preço", "Cliente"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btAtribuir.setText("Atribuir Cliente");
        btAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtribuirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btConsultarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btAtribuir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel1)))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btConsultarTodos)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtribuir))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaNomeActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try{
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            ApartamentoController ctr = new ApartamentoController();

            ctr.consultarPorNome((tfPesquisaNome.getText()));

            modelo.setRowCount(0);

            List<Apartamento> apt = (List<Apartamento>) ctr.consultarPorNome(tfPesquisaNome.getText());

            if (apt.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.");
            } else{
                for (Apartamento c1 : apt) {
                    modelo.addRow(new Object[]{
                        c1.getId(),
                        c1.getNomeImovel(),
                        c1.getEndereco(),
                        c1.getNumero(),
                        c1.getCapacidade(),
                        c1.getQntVagasGaragem(),
                        c1.getQntQuartos(),
                        c1.getQntBanheiros(),
                        c1.getNumAndar(),
                        c1.getPreco(),
                        c1.getCliente_id(),

                    });
                }
            }
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try{
            ApartamentoController ctc = new ApartamentoController();
            int linha = jTable1.getSelectedRow();
            int id = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());

            ctc.excluir(id);

            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(linha);

        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTodosActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        ApartamentoController ctr = new ApartamentoController();
        List<Apartamento> apt = ctr.consultarTodos();

        for(Apartamento c1: apt){
            modelo.addRow(new Object[]{
                c1.getId(),
                c1.getNomeImovel(),
                c1.getEndereco(),
                c1.getNumero(),
                c1.getCapacidade(),
                c1.getQntVagasGaragem(),
                c1.getQntQuartos(),
                c1.getQntBanheiros(),
                c1.getNumAndar(),
                c1.getPreco(),
                c1.getCliente_id(),
            });
        }
    }//GEN-LAST:event_btConsultarTodosActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Apartamento apt = new Apartamento(id, nome, endereco, numero, capacidade, vagasgaragem, quantquartos, quantbanheiros, numeroapartamento, preco);
        apt.setId(this.apt.getId());
        new AtualizarApartamentoView(apt).setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btAtualizar.setEnabled(false);
         btAtribuir.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        linha = jTable1.getSelectedRow();
        id = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
        
        apt.setId(Integer.parseInt(jTable1.getValueAt(linha, 0).toString()));
        nome = jTable1.getValueAt(linha, 1).toString();
        endereco = jTable1.getValueAt(linha, 2).toString();
        numero = Integer.parseInt(jTable1.getValueAt(linha, 3).toString());
        capacidade = Integer.parseInt(jTable1.getValueAt(linha,4).toString());
        vagasgaragem = Integer.parseInt(jTable1.getValueAt(linha,5).toString());
        quantquartos = Integer.parseInt(jTable1.getValueAt(linha,6).toString());
        quantbanheiros = Integer.parseInt(jTable1.getValueAt(linha,7).toString());
        numeroapartamento = Integer.parseInt(jTable1.getValueAt(linha,8).toString());
        preco = Double.parseDouble(jTable1.getValueAt(linha,9).toString());
        btAtualizar.setEnabled(true);
        btAtribuir.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtribuirActionPerformed
       new ConsultaClientePorNomeView(id, tipo).setVisible(true);
       
    }//GEN-LAST:event_btAtribuirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConsultaApartamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaApartamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaApartamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaApartamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaApartamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtribuir;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConsultarTodos;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfPesquisaNome;
    // End of variables declaration//GEN-END:variables
}
