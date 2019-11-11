package com.capgemini.batatatinhadellivery.model;

import java.io.Serializable;

public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	private String telefoneResidencial;
	private String telefoneComercial;
	private String telefoneCelular;
	
	public Telefone() {
	}

	public Telefone(String telefoneResidencial, String telefoneComercial, String telefoneCelular) {
		super();
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
}
