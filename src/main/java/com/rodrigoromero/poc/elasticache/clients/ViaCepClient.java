package com.rodrigoromero.poc.elasticache.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rodrigoromero.poc.elasticache.jsons.LocalJson;

@FeignClient(name = "via-cep", url = "${viacep.url}")
public interface ViaCepClient {

	@GetMapping("/{cep}/json")
	LocalJson bucsarCep(@PathVariable String cep); 
	
}
