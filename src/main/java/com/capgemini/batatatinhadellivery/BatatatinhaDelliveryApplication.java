package com.capgemini.batatatinhadellivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.batatatinhadellivery.model.Cliente;
import com.capgemini.batatatinhadellivery.repository.ClienteRepository;

@SpringBootApplication
public class BatatatinhaDelliveryApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(BatatatinhaDelliveryApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente cli1 = new Cliente(null, "João", "197.168.169-13", "joão@gmail.com");
		Cliente cli2 = new Cliente(null, "Lucas", "200.168.169-13", "lucas@gmail.com");
		
		clienteRepository.save(cli2);
		
	}

}
