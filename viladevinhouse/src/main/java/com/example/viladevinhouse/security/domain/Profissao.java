package com.example.viladevinhouse.security.domain;


import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "profissoes", indexes = {@Index(name = "idx_profissao_nome", columnList = "nome")})
public class Profissao extends GeradorDeId {
	
	@Column(name = "nome", unique = true, nullable = false)
	private String nome;
	
	@Column(name = "descricao", columnDefinition = "TEXT")
	private String descricao;
	
	@ManyToMany
	@JoinTable(
			name = "vilas_contem_profissoes",
			joinColumns = @JoinColumn(name = "id_profissao", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "id_vila", referencedColumnName = "id")
    )
	private List<Vila> vilas;	

	public String getTitulo() {
		return nome;
	}

	public void setTitulo(String nome) {
		this.nome = nome;
	}	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Vila> getMedicos() {
		return vilas;
	}

	public void setMedico(List<Vila> vilas) {
		this.vilas = vilas;
	}
}
