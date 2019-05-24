package br.gov.sp.fatec.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.gov.sp.fatec.model.Carro;
import br.gov.sp.fatec.model.Reserva;
import br.gov.sp.fatec.service.ReservaService;
import br.gov.sp.fatec.view.View;

import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping(value = "/reserva")
@CrossOrigin
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;

	public void setCarroService(ReservaService reservaService) {
		this.reservaService = reservaService;
	}
	
//	RESERVA JOIN CARRO, USER
//	@RequestMapping(value = "/getAllJoin", method = RequestMethod.GET)
//	public ResponseEntity<Reserva> getAllJoin() {
////		return new ResponseEntity<Collection<Object>>(reservaService.todosInfo(), HttpStatus.OK);
//		reservaService.todosInfo();
//		return new ResponseEntity<Reserva>(HttpStatus.OK);
//
//	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<Collection<Reserva>> getAll() {
		return new ResponseEntity<Collection<Reserva>>(reservaService.todos(), HttpStatus.OK);
	}
	
	
//	CRIA RESERVA
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Reserva> salvar(@RequestBody Reserva reserva, UriComponentsBuilder uriComponentsBuilder) {
		reserva = reservaService.salvar(reserva);
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setLocation(uriComponentsBuilder.path("/getById/" + reserva.getId()).build().toUri());
		return new ResponseEntity<Reserva>(reserva, responseHeaders, HttpStatus.CREATED);
	}
	
	
//	DELETAR RESERVA
	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Reserva> deletePorId(@PathVariable("id") Long id) {
		reservaService.excluir(id);
		return new ResponseEntity<Reserva>(HttpStatus.OK);
	}

}
