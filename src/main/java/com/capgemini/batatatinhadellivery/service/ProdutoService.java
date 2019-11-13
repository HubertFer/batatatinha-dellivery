package com.capgemini.batatatinhadellivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.batatatinhadellivery.model.Produto;
import com.capgemini.batatatinhadellivery.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
}
