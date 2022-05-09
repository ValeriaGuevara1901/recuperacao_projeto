package com.example.viladevinhouse.security.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
public class Role extends GeradorDeId {
	
	@Column(name = "descricao", nullable = false, unique = true)
	private String desc;
	
	public Role() {
		super();
	}

	public Role(Long id) {
		super.setId(id);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
