package com.peualoe.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "Tclientes")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nome")
	private String nome;

	@Cpf
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpf")
	private String cpf;

    @Column(name = "nasc")
	private String nasc;

    @Column(name = "ende")
	private String ende;

	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}


	@Entity
	@Table(name = "Tenderecos")
	public class Tutorial2 {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	
		@Column(name = "cpf")
		private String cpf;
	
		@Column(name = "ende")
		private String ende;
	
		@Column(name = "published")
		private boolean published;
	
		public Tutorial2() {
	
		}



	public Tutorial(String nome, String cpf, String nasc, String ende, boolean published){
		this.nome = nome;
		this.cpf = cpf;
		this.nasc = nasc;
		this.ende = ende;
		this.publish = publish;
	}

	public long getId(){
		return id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}







	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}









	public String getEnde() {
		return ende;
	}

	public void setEnde(String ende) {
		this.ende = ende;
	}








	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}






	@Override
	public String toString() {
		return "Tutorial [id=" + id + 
		                     ", nome=" + nome + 
							 ", cpf="  + cpf  + 
							 ", nasc=" + nasc +
							 ", ende=" + ende +
							 ", published=" + published + "]";
	}

}
