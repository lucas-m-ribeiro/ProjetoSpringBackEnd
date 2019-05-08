package com.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "carro")
public class Carro {
	
	private static final long serialVersionUID = 1507218635788384719L;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
	
    @Column(name = "NOME", unique=true, length = 20, nullable = false)
	private String nome;
	
    @Column(name = "MARCA", length = 20, nullable = false)
	private String marca;
	
    @Column(name = "COR", length = 20, nullable = false)
	private String cor;
	
    @Column(name = "ANO", length = 20, nullable = false)
	private int ano;
	
    @Column(name = "KM", length = 20, nullable = false)
	private double km;
    
	
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}