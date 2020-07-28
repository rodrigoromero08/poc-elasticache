package com.rodrigoromero.poc.elasticache.clients;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rodrigoromero.poc.elasticache.jsons.LocalJson;

@SpringBootTest
class ViaCepClientTest {

	@Autowired
	private ViaCepClient viaCepClient;

	@Test
	void testBuscarCep() {
		String cepDesejado = "02250000";
		LocalJson json = viaCepClient.bucsarCep(cepDesejado);
		assertNull(json.getErro());
		assertTrue(json.getUf() != null);

	}

	@Test
	void testBuscarCepInexistente() {
		LocalJson json = viaCepClient.bucsarCep("12345678");
		assertTrue(json.getErro());

	}

	@Test
	void testBuscarCepInvalido() {

		Assertions.assertThrows(Exception.class, () -> {
			viaCepClient.bucsarCep("xxxxxxxx");
		});
	}

}
