package com.example.viladevinhouse.security.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "relatorios")
public class Relatorio extends GeradorDeId {
	
	@ManyToOne
	@JoinColumn(name="id_vila")
	private Vila vila;

	public Vila getVila() {
		return vila;
	}

	public void setVila(Vila vila) {
		this.vila = vila;
	}
	
	

}
