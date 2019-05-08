package fatec.com.projeto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fatec.com.projeto.model.Carro;
import fatec.com.projeto.repository.CarroRepository;

@Service("CarroService")
@Transactional
public class CarroServiceImpl implements CarroService{

	@Autowired
	public CarroRepository cr;

	public void setCarroRepository(CarroRepository cr) {
		this.cr = cr;
	}
	
	@Override
	public Carro salvar(Carro carro) {
		return cr.save(carro);
	}

	@Override
	public void excluir(Long idCarro) {
		cr.delete(idCarro); 		
	}

	@Override
	public List<Carro> listarTodos() {
		List<Carro> retorno = new ArrayList<Carro>();
		for(Carro carro: cr.findAll()) {
			retorno.add(carro);
		}
		return retorno;
	}

	@Override
	public Carro buscarPorId(Long idCarro) {
		return cr.findOne(idCarro);
	}
}
