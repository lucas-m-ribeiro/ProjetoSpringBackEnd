package br.gov.sp.fatec.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "TB_RESERVA")
public class Reserva implements Serializable {
	
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "RESERVA_ID ")
	private Long reserva_id;
	
	@Column(name = "CAR_ID")
	private Long car_id;
   
	@Column(name = "USR_ID")
	private Long usr_id;
   
	@Column(name = "DATA_INICIO", nullable = true)
	private String data_inicio;
	
	@Column(name = "DATA_FIM" ,nullable = true)
	private String data_fim;

	public Long getReserva_id() {
		return reserva_id;
	}

	public void setReserva_id(Long reserva_id) {
		this.reserva_id = reserva_id;
	}

	public Long getCar_id() {
		return car_id;
	}

	public void setCar_id(Long car_id) {
		this.car_id = car_id;
	}

	public Long getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(Long usr_id) {
		this.usr_id = usr_id;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String  getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
}
