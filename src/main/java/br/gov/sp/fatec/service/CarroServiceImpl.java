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
import br.gov.sp.fatec.model.Usuario;
import br.gov.sp.fatec.repository.CarroRepository;
import br.gov.sp.fatec.repository.UsuarioRepository;


@Service("carroService")
@Transactional
public class CarroServiceImpl implements CarroService {

	@Autowired
	private CarroRepository carroRepo;
	
	public void setAnotacaoRepo(CarroRepository carroRepo) {
		this.carroRepo = carroRepo;
	}
	
	@Override
	@PreAuthorize("isAuthenticated()")
	public List<Carro> todos() {
		List<Carro> retorno = new ArrayList<Carro>();
		for(Carro carro: carroRepo.findAll()) {
			retorno.add(carro);
		}
		return retorno;
	}
	
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Carro salvar(Carro carro) {
		return carroRepo.save(carro);
	}

	@Override
	public void excluir(Long idCarro) {
		carroRepo.deleteById(idCarro);
	}

	@Override	
	public Carro buscarPorId(Long idCarro) {
		Optional<Carro> carro = carroRepo.findById(idCarro);
		if(carro.isPresent()) {
			return carro.get();
		}
		return null;
	}

}
