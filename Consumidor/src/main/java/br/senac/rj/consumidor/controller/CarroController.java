package br.senac.rj.consumidor.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.senac.rj.consumidor.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController extends BaseController<CarroService> {

	@GetMapping("/lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listAll() throws JsonProcessingException {
		return service.listAllJSON();
	}
	
	@GetMapping("/listaxml")
	@Produces(MediaType.APPLICATION_XML)
	public String listAllAsXML() throws JsonProcessingException {
		return service.listAllXML();
	}
	
}
