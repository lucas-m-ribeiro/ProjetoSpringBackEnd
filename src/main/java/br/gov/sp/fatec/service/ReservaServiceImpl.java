package br.gov.sp.fatec.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Reserva;
import br.gov.sp.fatec.repository.ReservaRepository;



@Service("reservaService")
@Transactional
public class ReservaServiceImpl implements ReservaService {
	
	private ReservaRepository reservaRepo;

	@Override
	public Reserva salvar(Reserva reserva) {
		return reservaRepo.save(reserva);
	}

	@Override
	public void excluir(Long id) {
		reservaRepo.deleteById(id);
	}

	@Override
	public List<Reserva> todos() {
		List<Reserva> retorno = new ArrayList<Reserva>();
		for(Reserva reserva : reservaRepo.findAll()) {
			retorno.add(reserva);
		}
		return retorno;
	}

}