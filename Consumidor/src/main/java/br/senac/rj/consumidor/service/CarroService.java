package br.senac.rj.consumidor.service;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Service;

@Service
public class CarroService extends BaseService {

	public String listAllJSON() {
		client = ClientBuilder.newClient();
		return client.target("http://localhost:8090/carro/lista").request(MediaType.APPLICATION_JSON).get(String.class);
	}
	
	public String listAllXML() {
		client = ClientBuilder.newClient();
		return client.target("http://localhost:8090/carro/listaxml").request(MediaType.APPLICATION_XML).get(String.class);
	}
}
