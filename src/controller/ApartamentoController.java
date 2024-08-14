/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connection.Connection;
import java.util.List;
import interfaces.ICrud;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Apartamento;
import org.postgresql.jdbc.PgConnection;

/**
 *
 * @author lucas
 */
public class ApartamentoController implements ICrud<Apartamento> {
    private PgConnection conn = connection.Connection.conectar();
    
    
    @Override
    public void salvar(Apartamento t) {
    try{
               String sqlImovel = "INSERT INTO apartamento (nome, endereco, numeroimovel, capacidadepessoas, qntquarto, qntbanheiro, qntvagasgaragem, numeroapartamento, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pstmImovel = conn.prepareStatement(sqlImovel);
                pstmImovel.setString(1, t.getNomeImovel());
                pstmImovel.setString(2, t.getEndereco());
                pstmImovel.setInt(3, t.getNumero());
                pstmImovel.setInt(4, t.getCapacidade());
                pstmImovel.setInt(5, t.getQntQuartos());
                pstmImovel.setInt(6, t.getQntBanheiros());
                pstmImovel.setInt(7, t.getQntVagasGaragem());
                pstmImovel.setInt(8, t.getNumAndar());
                pstmImovel.setDouble(9, t.getPreco());
              
              

                pstmImovel.execute();
           }catch(SQLException ex){
               System.out.println("Erro no salvar: "+ ex.getMessage());
           }
    }    

    @Override
    public void excluir(int id) {
        PgConnection conn = Connection.conectar();
            try {
                PreparedStatement stm = conn.prepareStatement("delete from apartamento where id_apartamento = ?");
                stm.setInt(1, id);
                stm.execute();

            }catch (SQLException e) {
                throw new RuntimeException(e.getMessage());

            }finally{

            }
        
    }

    @Override
    public void update(Apartamento t) {
        try{
            String sqlImovel = ("UPDATE apartamento SET nome=?, endereco=?, numeroimovel=?, capacidadepessoas=?, qntquarto=?, qntbanheiro=?, qntvagasgaragem=?, numeroapartamento=?, preco=? WHERE id_apartamento = ?");
                PreparedStatement pstm = conn.prepareStatement(sqlImovel);
                pstm.setString(1, t.getNomeImovel());
                pstm.setString(2, t.getEndereco());
                pstm.setInt(3, t.getNumero());
                pstm.setInt(4, t.getCapacidade());
                pstm.setInt(5, t.getQntQuartos());
                pstm.setInt(6, t.getQntBanheiros());
                pstm.setInt(7, t.getQntVagasGaragem());
                pstm.setInt(8, t.getNumAndar());
                pstm.setDouble(9, t.getPreco());
              
            pstm.setInt(10, t.getId());
            
            pstm.executeUpdate();
            
            pstm.close();
            
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public List<Apartamento> consultarTodos() {
            PgConnection con = Connection.conectar();
            List<Apartamento> apt = new ArrayList<>();

            try{
                PreparedStatement pstm = conn.prepareStatement("SELECT * FROM apartamento");
                ResultSet rs = pstm.executeQuery();
            

                while(rs.next()){
                    Apartamento c1 = new Apartamento();
                    c1.setId(rs.getInt("id_apartamento"));
                    c1.setNomeImovel(rs.getString("nome"));
                    c1.setEndereco(rs.getString("endereco"));
                    c1.setNumero(rs.getInt("numeroimovel"));
                    c1.setCapacidade(rs.getInt("capacidadepessoas"));
                    c1.setPreco(rs.getDouble("preco"));
                    c1.setQntQuartos(rs.getInt("qntquarto"));
                    c1.setQntVagasGaragem(rs.getInt("qntvagasgaragem"));
                    c1.setQntBanheiros(rs.getInt("qntbanheiro"));
                    c1.setNumAndar(rs.getInt("numeroapartamento"));
                    c1.setPreco(rs.getDouble("preco"));
                    c1.setCliente_id(rs.getInt("cliente_id"));
                    apt.add(c1);
                }

                rs.close();
                pstm.close();

                } catch (SQLException ex) {
                   throw new RuntimeException(ex.getMessage());
            }

            return apt;
        
    }

    @Override
    public List<Apartamento>  consultarPorNome(String nome) {
        PgConnection con = connection.Connection.conectar();
                List<Apartamento> apt = new ArrayList<>();

                try{
                    PreparedStatement stm = con.prepareStatement("SELECT * FROM apartamento WHERE nome = ?");

                    stm.setString(1, nome);

                    ResultSet rs = stm.executeQuery();

                    while(rs.next()){
                        Apartamento c1 = new Apartamento();
                        c1.setId(rs.getInt("id_apartamento"));
                        c1.setNomeImovel(rs.getString("nome"));
                        c1.setEndereco(rs.getString("endereco"));
                        c1.setNumero(rs.getInt("numeroimovel"));
                        c1.setCapacidade(rs.getInt("capacidadepessoas"));
                        c1.setPreco(rs.getDouble("preco"));
                        c1.setQntQuartos(rs.getInt("qntquarto"));
                        c1.setQntVagasGaragem(rs.getInt("qntvagasgaragem"));
                        c1.setQntBanheiros(rs.getInt("qntbanheiro"));
                        c1.setNumAndar(rs.getInt("numeroapartamento"));
                        c1.setPreco(rs.getDouble("preco"));

                        apt.add(c1);
                    }

                    rs.close();
                    stm.close();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex.getMessage());
                }

        return apt;
     }   

    @Override
    public void atribuir(int id, int id_cliente) {  
 
        try{
             PreparedStatement stm = conn.prepareStatement("UPDATE apartamento SET cliente_id = ? WHERE id_apartamento = ?");

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
