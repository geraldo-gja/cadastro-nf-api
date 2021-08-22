package com.Geraldo.cadastroNF.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Geraldo.cadastroNF.domain.Cliente;
import com.Geraldo.cadastroNF.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Integer id) {	
		Cliente obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}	 
}

//localhost:8080/clientes/1