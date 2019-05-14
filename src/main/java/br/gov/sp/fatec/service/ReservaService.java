package br.gov.sp.fatec.service;

import java.util.List;
import br.gov.sp.fatec.model.Reserva;

public interface ReservaService {
	public List<Reserva> todos();	
	public Reserva salvar(Reserva reserva);
	public void excluir(Long id);
	public Reserva buscarPorId(Long Id);
}
