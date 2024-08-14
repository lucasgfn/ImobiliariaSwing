/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Imovel{
    protected int id;
    protected String nomeImovel;
    protected String endereco;
    protected int numero;
    protected int capacidade;
    protected int qntQuartos;
    protected int qntBanheiros;
    protected int qntVagasGaragem;
    protected double preco;
    private int cliente_id;

    public Imovel(int id, String nomeImovel, String endereco, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco, int cliente_id) {
        this.id = id;
        this.nomeImovel = nomeImovel;
        this.endereco = endereco;
        this.numero = numero;
        this.capacidade = capacidade;
        this.qntQuartos = qntQuartos;
        this.qntBanheiros = qntBanheiros;
        this.qntVagasGaragem = qntVagasGaragem;
        this.preco = preco;
        this.cliente_id = cliente_id;
    }
    
    public Imovel(int id, String nomeImovel, String endereco, int numero, int capacidade, int qntQuartos, int qntBanheiros, int qntVagasGaragem, double preco) {
        this.id = id;
        this.nomeImovel = nomeImovel;
        this.endereco = endereco;
        this.numero = numero;
        this.capacidade = capacidade;
        this.qntQuartos = qntQuartos;
        this.qntBanheiros = qntBanheiros;
        this.qntVagasGaragem = qntVagasGaragem;
        this.preco = preco;
    }

    public Imovel() {
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
          if (nomeImovel == null || nomeImovel.isEmpty()) {
	        throw new IllegalArgumentException("Nome do imóvel não pode ser vazio");
          }
          this.nomeImovel = nomeImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
          if (endereco == null || endereco.isEmpty()) {
	        throw new IllegalArgumentException("Endereco não pode ser vazio");
            }
            this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
	    throw new IllegalArgumentException("Número não pode ser menor ou igual a zero");
        }
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (numero <= 0) {
	    throw new IllegalArgumentException("Capacidade não pode ser menor ou igual a zero");
        }
        this.capacidade = capacidade;
    }

    public int getQntQuartos() {
        return qntQuartos;
    }

    public void setQntQuartos(int qntQuartos) {
        if (qntQuartos <= 0) {
	   throw new IllegalArgumentException("Quantidade de quartos não pode ser menor ou igual a zero");
        }
        this.qntQuartos = qntQuartos;
    }

    public int getQntBanheiros() {
        return qntBanheiros;
    }

    public void setQntBanheiros(int qntBanheiros) {
        if (qntBanheiros <= 0) {
	   throw new IllegalArgumentException("Quantidade de banheiros não pode ser menor ou igual a zero");
        }
        this.qntBanheiros = qntBanheiros;
    }

    public int getQntVagasGaragem() {
        return qntVagasGaragem;
    }

    public void setQntVagasGaragem(int qntVagasGaragem) {
        if (qntVagasGaragem <= 0) {
	   throw new IllegalArgumentException("Quantidade de vagas de garagem não pode ser menor ou igual a zero");
        }
        this.qntVagasGaragem = qntVagasGaragem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
	   throw new IllegalArgumentException("Preço não pode ser menor ou igual a zero");
        }
        this.preco = preco;
    }
    
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    public abstract void calcularPrecoAluguel ();
    
    
    @Override
    public String toString() {
        return "Id: "+ id + "Imovel" + "Nome:" + nomeImovel + ", Endereco:" + endereco + ", Nº:"+ numero + " Capacidade:"+ capacidade + ", Quantidade Quartos:" + qntQuartos + ", Quantidade Banheiros:" + qntBanheiros + ", Vagas de Garagem:" + qntVagasGaragem + ", Preço:" + preco;
    }
}

