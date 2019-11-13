package com.capgemini.batatatinhadellivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.batatatinhadellivery.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
