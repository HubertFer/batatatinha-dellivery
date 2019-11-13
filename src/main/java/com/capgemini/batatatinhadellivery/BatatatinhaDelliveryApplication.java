package com.capgemini.batatatinhadellivery;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.batatatinhadellivery.model.Cliente;
import com.capgemini.batatatinhadellivery.model.Endereco;
import com.capgemini.batatatinhadellivery.model.Telefone;
import com.capgemini.batatatinhadellivery.repository.ClienteRepository;
import com.capgemini.batatatinhadellivery.repository.EnderecoRepository;
import com.capgemini.batatatinhadellivery.repository.TelefoneRepository;

@SpringBootApplication
public class BatatatinhaDelliveryApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;

	public static void main(String[] args) {
		SpringApplication.run(BatatatinhaDelliveryApplication.class, args);		
		
	}

	@Override
	public void run(String... args) throws Exception {
				
		Telefone tel1 = new Telefone(null, "11-34345900", "2321-6060", "94589-9090");

		Telefone tel2= new Telefone(null, "11-24324324", "23423-6060", "967676-9090");

		Cliente cli1 = new Cliente(null, "João", "197.168.169-13", "joão@gmail.com", tel1);
		Cliente cli2 = new Cliente(null, "Lucas", "200.168.169-13", "lucas@gmail.com", tel2);
				
		Endereco end1 = new Endereco(null, "Rua das flores","06455-000","135", "Jd. das Rosas", "","Padaria margarida","São Paulo",cli1);
		Endereco end2 = new Endereco(null, "rua verde", "38703456", "333", "Pq. Jardim", "Loja 2", "Locadora", "São Paulo",cli1);
		Endereco end3 = new Endereco(null, "rua azul", "4864864864", "4343", "Pq. Europa", "Loja 2", "Posto", "São Paulo",cli2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3));
					
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1, end2));
		telefoneRepository.saveAll(Arrays.asList(tel1, tel2));
	
	}
}
