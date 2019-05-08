package com.fatec.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.fatec.model.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long> {
	
	public List <Carro> findByCarrosNome();

}
