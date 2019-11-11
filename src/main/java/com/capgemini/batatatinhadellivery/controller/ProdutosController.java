package com.capgemini.batatatinhadellivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.batatatinhadellivery.model.Produto;
import com.capgemini.batatatinhadellivery.service.ProdutoService;

@Controller
@RequestMapping(value="/produtos")
public class ProdutosController {

	@Autowired
	private ProdutoService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Produto obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
