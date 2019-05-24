package br.gov.sp.fatec.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.model.Carro;
import br.gov.sp.fatec.model.Reserva;
import br.gov.sp.fatec.model.Usuario;
import br.gov.sp.fatec.repository.ReservaRepository;
import br.gov.sp.fatec.repository.UsuarioRepository;


@Service("reservaService")
@Transactional
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepo;
	
	public void setReservaRepo(ReservaRepository reservaRepo) {
		this.reservaRepo = reservaRepo;
	}
	
	@Override
	@PreAuthorize("isAuthenticated()")
	public List<Reserva> todos() {
		List<Reserva> retorno = new ArrayList<Reserva>();
		for(Reserva reserva: reservaRepo.findAll()) {
			retorno.add(reserva);
		}
		return retorno;
	}

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Reserva salvar(Reserva reserva) {
		return reservaRepo.save(reserva);
	}

	@Override
	public void excluir(Long id) {
		reservaRepo.deleteById(id);
	}

	@Override
	public Reserva buscarPorId(Long id) {
		Optional<Reserva> reserva = reservaRepo.findById(id);
		if(reserva.isPresent()) {
			return reserva.get();
		}
		return null;
	}
//
//	@Override
//	public List<Object> todosInfo() {
//		System.out.println("TO AQUI");
//		List<Object> retorno = new ArrayList<Object>();
//		for(Object reserva: reservaRepo.ReservaJoin()) {
//			retorno.add(reserva);
//		}
//		
//		System.out.println(retorno);
//		
//		return retorno;
//	}

}
