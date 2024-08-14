/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class Cliente {
        private int id;
	private String nome;
	private String cpf;
        private String telefone;
        private String endereco;


        public Cliente(int id,String nome, String telefone, String endereco, String cpf) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.endereco = endereco;
        }

        public Cliente() {
            
        }
        
        

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
	        throw new IllegalArgumentException("Nome do cliente não pode ser nulo nem vazio");
	    }
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		if (cpf == null || cpf.isEmpty()) {
	        throw new IllegalArgumentException("CPF não pode ser vazio");
	    }
	
	    if (cpf.length() != 11) {
	        throw new IllegalArgumentException("CPF deve ter 11 dígitos");
	    }
	
	    this.cpf = cpf;
	    
	}

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            if (telefone == null || telefone.isEmpty()) {
	        throw new IllegalArgumentException("Telefone não pode ser vazio");
            }
            this.telefone = telefone;
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
        
        

    @Override
    public String toString() {
        return "Cliente/n" + "Nome:" + nome + ", CPF:" + cpf + ", Telefone:" + telefone + ", Endereco:" + endereco;
    }
	

}
