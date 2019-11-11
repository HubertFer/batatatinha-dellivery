package com.capgemini.batatatinha.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pedido {

	private Long id;
	
	private Cliente cliente;
	
	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	private List<ItemPedido> itemPedidos = new ArrayList<>();
}
