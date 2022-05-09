package com.example.viladevinhouse.security.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "vilas")
public class Vila extends GeradorDeId {

	@Column(name = "nome", unique = true, nullable = false)
	private String nome;
	
	@Column(name = "orcamento", unique = true, nullable = false)
	private Double orcamento;
	
	@Column(name = "gasto", nullable = false)
	private Double gasto;
	
	// evita recursividade quando o json de resposta for criado para a datatables.
	@JsonIgnore
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "vilas_contem_profissoes",
			joinColumns = @JoinColumn(name = "id_vila", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "id_profissao", referencedColumnName = "id")
    )
	private Set<Profissao> profissoes;
	
	// evita recursividade quando o json de resposta for criado para a datatables.
	@JsonIgnore
	@OneToMany(mappedBy = "vila")
	private List<CadastroHabitante> cadastrosHabitantes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "vila")
	private List<Relatorio> relatorios;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	public Vila() {
		super();
	}

	public Vila(Long id) {
		super.setId(id);
	}

	public Vila(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public Double getGasto() {
		return gasto;
	}

	public void setGasto(Double gasto) {
		this.gasto = gasto;
	}

	public Set<Profissao> getProfissoes() {
		return profissoes;
	}

	public void setProfissoes(Set<Profissao> profissoes) {
		this.profissoes = profissoes;
	}

	public List<CadastroHabitante> getCadastrosHabitantes() {
		return cadastrosHabitantes;
	}

	public void setCadastrosHabitantes(List<CadastroHabitante> cadastrosHabitantes) {
		this.cadastrosHabitantes = cadastrosHabitantes;
	}	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
