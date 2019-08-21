package br.senac.rj.consumidor.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

public abstract class BaseService {

	protected Client client;
	protected WebTarget target;
}
