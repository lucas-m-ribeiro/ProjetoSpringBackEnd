package fatec.com.projeto.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import fatec.com.projeto.model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long> {
	
	public List <Carro> findByCarrosNome();

}
