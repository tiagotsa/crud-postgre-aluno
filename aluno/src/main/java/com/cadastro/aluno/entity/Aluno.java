package com.cadastro.aluno.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aluno {

	      @Id
		  @GeneratedValue(strategy = GenerationType.IDENTITY)
		  private Long id;
		  private String nome;
		  private String endereco;
		  private String contato;
		  
		    public Aluno(Long id, String nome, String endereco, String contato) {
			this.id = id;
			this.nome = nome;
			this.endereco = endereco;
			this.contato = contato;
		}

		public Aluno() {
			  
		  }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}
}
