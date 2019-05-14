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

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<Collection<Reserva>> getAll() {
		return new ResponseEntity<Collection<Reserva>>(reservaService.todos(), HttpStatus.OK);
	}
	
//	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
//	public ResponseEntity<Collection<Reserva>> getAll() {
//		return new ResponseEntity<Collection<Reserva>>(reservaService.todos(), HttpStatus.OK);
//	}

}
