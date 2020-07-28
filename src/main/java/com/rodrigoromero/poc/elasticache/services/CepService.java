package com.rodrigoromero.poc.elasticache.services;

import org.springframework.stereotype.Service;

import com.rodrigoromero.poc.elasticache.clients.ViaCepClient;
import com.rodrigoromero.poc.elasticache.jsons.LocalJson;

@Service
public class CepService {

	private ViaCepClient viaCepClient;

	public CepService(ViaCepClient viaCepClient) {
		this.viaCepClient = viaCepClient;
		
	}
	
	public LocalJson buscarCep(String cep) {
		return viaCepClient.bucsarCep(cep); 
	}
	
}
