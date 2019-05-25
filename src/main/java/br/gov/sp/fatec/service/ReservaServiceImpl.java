package br.gov.sp.fatec.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Reserva;
import br.gov.sp.fatec.repository.ReservaRepository;

@Service("reservaService")
@Transactional
public class ReservaServiceImpl implements ReservaService {

	private final Logger logger = Logger.getLogger(this.getClass().getName());;

	@Autowired
	private ReservaRepository reservaRepo;

	public void setReservaRepo(ReservaRepository reservaRepo) {
		this.reservaRepo = reservaRepo;
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	public List<Reserva> todos() {
		List<Reserva> retorno = new ArrayList<Reserva>();
		for (Reserva reserva : reservaRepo.findAll()) {
			retorno.add(reserva);
		}
		return retorno;
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	public Reserva salvar(Reserva reserva) {
		logger.log(Level.INFO, reserva.toString());
		return reservaRepo.save(reserva);
	}

	@Override
	public void excluir(Long id) {
		reservaRepo.deleteById(id);
	}

	@Override
	public Reserva buscarPorId(Long id) {
		Optional<Reserva> reserva = reservaRepo.findById(id);
		if (reserva.isPresent()) {
			return reserva.get();
		}
		return null;
	}

	@Override
	public List<Reserva> teste(Long id) {
		List<Reserva> retorno = new ArrayList<Reserva>();
		for (Reserva reserva : reservaRepo.findByRsv_usr_id(id)) {
			retorno.add(reserva);
		}
		return retorno;
		
	}

}
