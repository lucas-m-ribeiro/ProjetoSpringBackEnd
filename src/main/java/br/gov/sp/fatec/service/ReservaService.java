package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.model.Carro;
import br.gov.sp.fatec.model.Reserva;

public interface ReservaService {
	
	public Reserva salvar(Reserva reserva);
	public void excluir(Long id);
	public List<Reserva> todos();	

}
