package com.rodrigoromero.poc.elasticache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigoromero.poc.elasticache.jsons.LocalJson;
import com.rodrigoromero.poc.elasticache.services.CepService;

@RequestMapping("api/cep")
@RestController
public class CepController {

	@Autowired
	private CepService cepService;

	@GetMapping("/{cep}")
	public ResponseEntity buscarCep(@PathVariable String cep) {
		LocalJson json = cepService.buscarCep(cep);
		return new ResponseEntity(json, HttpStatus.OK);
	}

}
