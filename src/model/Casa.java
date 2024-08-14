/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author lucas
 */
public class Casa extends Imovel{
    private int qntAndar;

    public Casa(int qntAndar, String nomeImovel, String endereco, int id, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco, int cliente_id) {
        super(id, nomeImovel, endereco, numero, capacidade, qntQuartos, qntBanheiros, qntVagasGaragem, preco, cliente_id);
        this.qntAndar = qntAndar;
    }
    
    
    public Casa(int qntAndar, String nomeImovel, String endereco, int id, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco) {
        super(id, nomeImovel, endereco, numero, capacidade, qntQuartos, qntBanheiros, qntVagasGaragem, preco);
        this.qntAndar = qntAndar;
    }
      
    public Casa(){
        super();
    }
    
    public int getQntAndar() {
        return qntAndar;
    }

    public void setQntAndar(int qntAndar) {
        this.qntAndar = qntAndar;
    }
    
   
    @Override
    public String toString() {
        return  super.toString()+"Casa" + "qntAndar=" + qntAndar;
    }

    @Override
    public void calcularPrecoAluguel() {
         double valorfixo = 1200;
         int messes = 12;
          
        double preco = valorfixo + (valorfixo/messes);
        
        System.out.println("O preço do valor do alugel para " + messes + "é" + preco);
    }
    
     
    
    
}
