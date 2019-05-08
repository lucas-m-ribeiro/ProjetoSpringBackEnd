package fatec.com.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fatec.com.projeto.model.Carro;
import fatec.com.projeto.service.CarroService;

@RestController
@RequestMapping(value = "/carro")
@CrossOrigin
public class CarroController {
	
	@Autowired
	private CarroService cs;
	
	
	public void SetCarroService(CarroService cs) {
		this.cs = cs;
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public ResponseEntity<Carro> pesquisarPorId(@PathVariable("id") Long id) {
		return new ResponseEntity<Carro>(cs.buscarPorId(id), HttpStatus.OK);
	}

}
