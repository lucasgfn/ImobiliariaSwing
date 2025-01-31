/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ApartamentoController;
import controller.CasaController;
import controller.ClienteController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author lucas
 */
public class ConsultaClientePorNomeView extends javax.swing.JFrame {
    int id_imovel = 0;
    int id = 0;
    int linha = 0;
    String nome = "";
    String telefone = "";
    String cpf = "";
    String endereco = "";
    String tipo = "";
                 
    
    public ConsultaClientePorNomeView(int id_imovel, String tipo) {
        this.id_imovel = id_imovel;
        this.tipo = tipo; 
        initComponents();
    }

    public ConsultaClientePorNomeView() {
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfPesquisaNome = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nome", "CPF", "Telefone", "Endereço"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        jLabel2.setText("Informe o nome para realizar a pesquisa:");

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btConfirmar.setText("Vincular Imovel");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        linha = jTable1.getSelectedRow();
        id = Integer.parseInt(jTable1.getValueAt(linha, 0).toString());
        nome = jTable1.getValueAt(linha, 1).toString();
        cpf = jTable1.getValueAt(linha, 2).toString();
        telefone = jTable1.getValueAt(linha, 3).toString();
        endereco = jTable1.getValueAt(linha,4).toString();
        
        btAtualizar.setEnabled(true);
        if(!tipo.equals("")){
            btConfirmar.setEnabled(true);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void tfPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btAtualizar.setEnabled(false);
        btConfirmar.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Cliente cliente1 = new Cliente(id, nome, telefone, endereco, cpf);
        
        new AtualizarClienteView(cliente1).setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try{       
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            ClienteController ctr = new ClienteController();

            ctr.consultarPorNome((tfPesquisaNome.getText()));

             modelo.setRowCount(0);
      
            List<Cliente> clientes = (List<Cliente>) ctr.consultarPorNome(tfPesquisaNome.getText());

             if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.");
            } else{              
                for (Cliente cliente : clientes) {
                    modelo.addRow(new Object[]{
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getCpf(),
                        cliente.getTelefone(),
                        cliente.getEndereco()
                    });
                }
            }
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       CasaController ctc = new CasaController();
       ApartamentoController cta = new ApartamentoController();
       
        try{
            if (tipo.equals("casa")) {
             System.out.print(id_imovel+"--"+id);
            ctc.atribuir(id_imovel, id);
            }
            else if(tipo.equals("apartamento")) {
             System.out.print(id_imovel+"--"+id);
            cta.atribuir(id_imovel, id);
            }
        }catch(RuntimeException e){
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
       

    }//GEN-LAST:event_btConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfPesquisaNome;
    // End of variables declaration//GEN-END:variables
}
