package com.capgemini.batatatinha.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	Produto produto;
	private Long itemQtd;
	private Double valorUnit;
	
	public ItemPedido() {
	}
	
	public ItemPedido(Long id, Produto produto, Long itemQtd, Double valorUnit) {
		super();
		this.id = id;
		this.produto = produto;
		this.itemQtd = itemQtd;
		this.valorUnit = valorUnit;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getItemQtd() {
		return itemQtd;
	}

	public void setItemQtd(Long itemQtd) {
		this.itemQtd = itemQtd;
	}

	public Double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}
}
