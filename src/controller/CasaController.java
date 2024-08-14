/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import interfaces.ICrud;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import model.Casa;

import org.postgresql.jdbc.PgConnection;

/**
 *
 * @author lucas
 */
public class CasaController implements ICrud<Casa> {
     private PgConnection conn = connection.Connection.conectar();
    
    @Override
    public void salvar(Casa t) {
     
      try{
           String sqlImovel = "INSERT INTO casa (nome, endereco, numeroimovel, capacidadepessoas, qntquarto, qntbanheiro, qntvagasgaragem, qntandar, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            PreparedStatement pstmImovel = conn.prepareStatement(sqlImovel);
            pstmImovel.setString(1, t.getNomeImovel());
            pstmImovel.setString(2, t.getEndereco());
            pstmImovel.setInt(3, t.getNumero());
            pstmImovel.setInt(4, t.getCapacidade());
            pstmImovel.setInt(5, t.getQntQuartos());
            pstmImovel.setInt(6, t.getQntBanheiros());
            pstmImovel.setInt(7, t.getQntVagasGaragem());
            pstmImovel.setInt(8, t.getQntAndar());
            pstmImovel.setDouble(9, t.getPreco());
           
            
            
            pstmImovel.execute();
       }catch(SQLException ex){
           System.out.println("Erro no salvar: "+ ex.getMessage());
       }
    }
    
    

    @Override
    public void excluir(int id) {
        PgConnection conn = connection.Connection.conectar();
            try {
                PreparedStatement stm = conn.prepareStatement("delete from casa where id_casa= ?");
                stm.setInt(1, id);
                stm.execute();

            }catch (SQLException e) {
                throw new RuntimeException(e.getMessage());

            }finally{

            }
     }

    @Override
    public void update(Casa t) {
        try{
            String SQL = ("UPDATE casa SET nome = ?, endereco = ?, numeroimovel = ?, capacidadepessoas = ?, qntvagasgaragem =?, qntquarto = ?, qntbanheiro=?, qntandar=?, preco=? WHERE id_casa = ?");
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, t.getNomeImovel());
            pstm.setString(2, t.getEndereco());
            pstm.setInt(3, t.getNumero());
            pstm.setInt(4, t.getCapacidade());
            pstm.setInt(5, t.getQntVagasGaragem());
            pstm.setInt(6, t.getQntQuartos());
            pstm.setInt(7, t.getQntBanheiros());
            pstm.setInt(8, t.getQntAndar());
            pstm.setDouble(9, t.getPreco());
            
            pstm.setInt(10, t.getId());
            // Log de depuração
            System.out.println("Executing update: " + pstm);
            
           int rowsAffected = pstm.executeUpdate();
           if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Casa atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado com o ID fornecido.");
            }
            

            pstm.close();

        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
   }    

    @Override
    public List<Casa> consultarTodos() {
        List<Casa> casas = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM casa");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Casa c1 = new Casa();
                    c1.setNomeImovel(rs.getString("nome"));
                    c1.setEndereco(rs.getString("endereco"));
                    c1.setNumero(rs.getInt("numeroimovel"));
                    c1.setId(rs.getInt("id_casa"));
                    c1.setCapacidade(rs.getInt("capacidadepessoas"));
                    c1.setPreco(rs.getDouble("preco"));
                    c1.setQntQuartos(rs.getInt("qntquarto"));
                    c1.setQntVagasGaragem(rs.getInt("qntvagasgaragem"));
                    c1.setQntBanheiros(rs.getInt("qntbanheiro"));
                    c1.setQntAndar(rs.getInt("qntandar"));
                    c1.setCliente_id(rs.getInt("cliente_id"));
                     
          
                casas.add((Casa) c1);
            }

            
        }catch(SQLException ex){
            System.out.print("Erro: "+ ex.getMessage());
        }
        
        return casas;
    }

    @Override
    public List<Casa>  consultarPorNome(String nome) {
        PgConnection con = connection.Connection.conectar();
        List<Casa> casas = new ArrayList<>();
        
        try{
            PreparedStatement stm = con.prepareStatement("SELECT * FROM casa WHERE nome = ?");

            stm.setString(1, nome);

            ResultSet rs = stm.executeQuery();

            while(rs.next()){
                Casa c1= new Casa();
                 c1.setNomeImovel(rs.getString("nome"));
                     c1.setEndereco(rs.getString("endereco"));
                      c1.setNumero(rs.getInt("numeroimovel"));
                       c1.setId(rs.getInt("id_casa"));
                        c1.setCapacidade(rs.getInt("capacidadepessoas"));
                         c1.setPreco(rs.getDouble("preco"));
                         c1.setQntQuartos(rs.getInt("qntquarto"));
                        c1.setQntVagasGaragem(rs.getInt("qntvagasgaragem"));
                        c1.setQntBanheiros(rs.getInt("qntbanheiro"));
                        c1.setQntAndar(rs.getInt("qntandar"));


                casas.add(c1);
            }

            rs.close();
            stm.close();
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        return casas;
    }

    @Override
    public void atribuir(int id, int id_cliente) {

        try{
             PreparedStatement stm = conn.prepareStatement("UPDATE casa SET cliente_id = ? WHERE id_casa = ?");

            stm.setInt(1, id_cliente);
            stm.setInt(2, id);
            System.out.println(id + " " + id_cliente);

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atribuição realizada com Sucesso!");

            
        } catch (SQLException e) {
            throw new RuntimeException("ERRO: "+ e.getMessage());
        }
    }
        
 }
    
    

