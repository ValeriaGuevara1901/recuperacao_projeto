package com.example.viladevinhouse.security.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "habitantes")
public class Habitante extends GeradorDeId {

	@Column(name = "nome", unique = true, nullable = false)
	private String nome;

	@Column(name = "data_nascimento", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dtNascimento;
	
	@Column(name = "renda", unique = true, nullable = false)
	private Double renda;
	
	@CPF
	private String cpf;

	@JsonIgnore
	@OneToMany(mappedBy = "habitante")
	private List<CadastroHabitante> cadastrosHabitantes;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<CadastroHabitante> getAgendamentos() {
		return cadastrosHabitantes;
	}

	public void setAgendamentos(List<CadastroHabitante> cadastrosHabitantes) {
		this.cadastrosHabitantes = cadastrosHabitantes;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
