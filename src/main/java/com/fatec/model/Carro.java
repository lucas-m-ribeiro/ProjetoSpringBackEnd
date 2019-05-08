package com.fatec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)	
@Entity
@Table(name = "tb_cr")
public class Carro implements Serializable {
	
	private static final long serialVersionUID = -4175224450033765996L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CR_CD")
    private Long id;
	
    @Column(name = "CR_NM", unique=true, length = 50, nullable = false)
	private String nome;
	
    @Column(name = "CR_MRC", length = 50, nullable = false)
	private String marca;
	
    @Column(name = "CR_COR", length = 50, nullable = false)
	private String cor;
	
    @Column(name = "CR_ANO", length = 20, nullable = false)
	private int ano;
	
    @Column(name = "CR_KM", length = 20, nullable = false)
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
<<<<<<< HEAD
}
=======
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
>>>>>>> 2dce22fcbb9038321d5028495f87611fb21a9364
