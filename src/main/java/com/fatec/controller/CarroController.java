package com.fatec.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;
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
	
	// pesquisa um carro por ID
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Carro> pesquisarPorId(@PathVariable("id") Long id) {
		System.out.println("carro por id");
		return new ResponseEntity<Carro>(cs.buscarPorId(id), HttpStatus.OK);
	}
	
	
	//lista todos os carros
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<Collection<Carro>> getAll() {
		System.out.println("get all");
		return new ResponseEntity<Collection<Carro>>(cs.listarTodos(), HttpStatus.OK);
	}

	
	//Salva carro por id
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Carro> salvar(@RequestBody Carro car, UriComponentsBuilder uriComponentsBuilder) {
		System.out.println("save");
		car = cs.salvar(car);
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setLocation(uriComponentsBuilder.path("/getById/" + car.getId()).build().toUri());
		return new ResponseEntity<Carro>(car, responseHeaders, HttpStatus.CREATED);
	}
	
	
	//deletando carro por id
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Carro> deletar(@PathVariable ("idCarro") Long idCarro, Carro  car) {
		System.out.println("deleta");
		cs.excluir(idCarro);
		HttpHeaders responseHeaders = new HttpHeaders();
		return new ResponseEntity<Carro>(car, responseHeaders, HttpStatus.OK);
	}
}
