package com.example.viladevinhouse.security.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "rendas", indexes = {@Index(name = "idx_valor", columnList = "valor")})
public class Renda extends GeradorDeId {
	
	@Column(name = "valor", unique = true, nullable = false)
	private Double valor;

	public Double getvalor() {
		return valor;
	}

	public void setvalor(Double valor) {
		this.valor = valor;
	}
}
