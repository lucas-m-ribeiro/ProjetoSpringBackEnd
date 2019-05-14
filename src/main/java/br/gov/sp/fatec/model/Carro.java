package br.gov.sp.fatec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.gov.sp.fatec.view.View;

import com.fasterxml.jackson.annotation.JsonView;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "TB_CARRO")
public class Carro implements Serializable {

	private static final long serialVersionUID = -4175224450033765996L;

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CAR_ID")
	private Long id;
    
    @Column(name = "CAR_NOME", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "CAR_KM", length = 500, nullable = false)
    private String km;
    
    @Column(name = "CAR_CATEGORIA", length = 20 , nullable = true)
    private String categoria;
    
    @Column(name = "CAR_MODELO", length = 20 ,nullable = true)
    private String modelo;
    
    @Column(name = "CAR_ANO", length = 4 ,nullable = true)
    private Integer ano;
    
    @Column(name = "CAR_FABRICANTE", length=20,nullable = true)
    private String fabricante;
    
    @Column(name = "CAR_COR",length=20, nullable = true)
    private String cor;
   
    @Column(name = "CAR_DISPONIVEL", nullable = true)
    private Boolean disponivel;

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

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

}
