package br.gov.sp.fatec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "TB_RESERVA")
public class Reserva implements Serializable {

	private static final long serialVersionUID = -4175224450033765996L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESERVA_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "RSV_USR_ID")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "RSV_CAR_ID")
	private Carro carro;

	@Column(name = "DATA_INICIO", length = 25, nullable = true)
	private String data_ini;

	@Column(name = "DATA_FIM", length = 25, nullable = true)
	private String data_fim;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getData_ini() {
		return data_ini;
	}

	public void setData_ini(String data_ini) {
		this.data_ini = data_ini;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", usuario=" + usuario + ", carro=" + carro + ", data_ini=" + data_ini
				+ ", data_fim=" + data_fim + "]";
	}

}
