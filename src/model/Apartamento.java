/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class Apartamento extends Imovel{
    private int numAndar;
    

    public Apartamento(int numAndar, String nomeImovel, String endereco, int id, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco, int cliente_id) {
        super(id, nomeImovel, endereco, numero, capacidade, qntQuartos, qntBanheiros, qntVagasGaragem, preco, cliente_id);
        this.numAndar = numAndar;
        
    }
    
    public Apartamento(int numAndar, String nomeImovel, String endereco, int id, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco) {
        super(id, nomeImovel, endereco, numero, capacidade, qntQuartos, qntBanheiros, qntVagasGaragem, preco);
        this.numAndar = numAndar;
        
    }

    public Apartamento() {
        
    }
        
    public int getNumAndar() {
        return numAndar;
    }

    public void setNumAndar(int numAndar) {
        this.numAndar = numAndar;
    }

  
    @Override
    public String toString() {
        return super.toString()+"Apartamento{" + "numAndar=" + numAndar + '}';
    }

    @Override
    public void calcularPrecoAluguel() {
        double valorfixo = 1000;
        int messes = 12;
          
        double preco = valorfixo + (valorfixo/messes);
        
        System.out.println("O preço do valor do alugel para " + messes + "é" + preco);
    }
    
    
    
    
}
