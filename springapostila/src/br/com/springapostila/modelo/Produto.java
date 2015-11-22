package br.com.springapostila.modelo;

import java.io.Serializable;

import org.hibernate.lob.SerializableBlob;

public class Produto implements Serializable{

	private Integer id;
	private String nome;
	private Integer quatidade;
	
	
	
	
	public Produto() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuatidade() {
		return quatidade;
	}
	public void setQuatidade(Integer quatidade) {
		this.quatidade = quatidade;
	}
	
	
	
}
