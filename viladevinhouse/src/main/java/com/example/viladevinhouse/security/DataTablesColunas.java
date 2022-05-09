package com.example.viladevinhouse.security;

public class DataTablesColunas {

	public static final String[] PROFISSOES = {"id", "nome"};

	public static final String[] VILAS = {"id", "nome", "orcamento", "gasto", "especialidades"};
	
	public static final String[] CADASTROS_HABITANTES = {"id", "habitante.nome", "variavelEliminar", "vila.nome", "profissao.nome"};

	public static final String[] USUARIOS = {"id", "email", "ativo", "perfis"};	
}
