package com.rodrigoromero.poc.elasticache.jsons;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class LocalJson implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private Boolean erro; 

}
