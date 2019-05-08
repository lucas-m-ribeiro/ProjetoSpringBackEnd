package com.fatec.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.model.Carro;
import com.fatec.service.CarroService;

@RestController
@RequestMapping(value = "/carro")
@CrossOrigin
public class CarroController {
	
	@Autowired
	private CarroService cs;
	
	public void SetCarroService(CarroService cs) {
		this.cs = cs;
	}
	
//	@RequestMapping(value = "/save", method = RequestMethod.GET)
//	public ResponseEntity<Carro> pesquisarPorId(@PathVariable("id") Long id) {
//		return new ResponseEntity<Carro>(cs.buscarPorId(id), HttpStatus.OK);
//	}
	
	@PostMapping("/salvar")
	public Carro salvaProduto(@RequestBody Carro carro){
		System.out.println("PEGUEI OS DADOS");
		System.out.println(carro);
		System.out.println("-------------");
		return cs.salvar(carro);
	}
}
