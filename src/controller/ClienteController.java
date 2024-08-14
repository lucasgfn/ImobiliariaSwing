
package controller;

import connection.Connection;
import interfaces.ICrud;
import model.Cliente;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.postgresql.jdbc.PgConnection;


public class ClienteController implements ICrud<Cliente> {
    private PgConnection conn = Connection.conectar();
     

    @Override
    public void salvar(Cliente t) {
       try{
        String sql = ("insert into cliente(nome, endereco, telefone, cpf) values (?,?,?,?)");
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, t.getNome());
        pstm.setString(2, t.getEndereco());
        pstm.setString(3, t.getTelefone());
        pstm.setString(4, t.getCpf());
        
        pstm.execute();
        
       }catch(SQLException ex){
           System.out.println("Erro: "+ ex.getMessage());
       }
    }

    @Override
    public List<Cliente> consultarTodos() {
       List<Cliente> clientes = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                 cliente.setCpf(rs.getString("cpf"));
                  cliente.setTelefone(rs.getString("telefone"));
                   cliente.setId(rs.getInt("id_cliente"));
                    cliente.setEndereco(rs.getString("endereco"));
                
                clientes.add(cliente);
            }

            
        }catch(SQLException ex){
            System.out.print("Erro: "+ ex.getMessage());
        }
        
        return clientes;
    }
    

    @Override
    public List<Cliente> consultarPorNome(String nome) {
        PgConnection con = Connection.conectar();
        List<Cliente> clientes = new ArrayList<>();
        
        try{
        PreparedStatement stm = con.prepareStatement("SELECT * FROM cliente WHERE nome = ?");
           
        stm.setString(1, nome);
        
        ResultSet rs = stm.executeQuery();
        
        while(rs.next()){
            Cliente c1= new Cliente();
            c1.setId(rs.getInt("id_cliente"));
            c1.setNome(rs.getString("nome"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setCpf(rs.getString("cpf"));
            
            clientes.add(c1);
        }
        
        rs.close();
        stm.close();
        
        } catch (SQLException ex) {
           throw new RuntimeException(ex.getMessage());
        }
        
        return clientes;
    }

    @Override
    public void excluir(int id) {
        try {
            PreparedStatement stm = conn.prepareStatement("delete from cliente where id_cliente = ?");
            stm.setInt(1, id);
            stm.execute();
                     
        }catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    @Override
    public void update(Cliente t) {
        try{
            PreparedStatement pstm = conn.prepareStatement("UPDATE cliente SET nome = ?, endereco = ?, telefone = ?, cpf = ? WHERE id_cliente = ?");
            
            pstm.setString(1, t.getNome());
            pstm.setString(2, t.getEndereco());
            pstm.setString(3, t.getTelefone());
            pstm.setString(4, t.getCpf());
            pstm.setInt(5, t.getId());
            
            pstm.executeUpdate();
            
            pstm.close();
            
            
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void atribuir(int id, int id_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}

    

