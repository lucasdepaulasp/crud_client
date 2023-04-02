package com.dio.crudClient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.crudClient.entities.Clientes;
import com.dio.crudClient.services.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public Clientes save(@RequestBody Clientes clientes) {
		return clienteService.save(clientes);
	}

	@GetMapping
	public List<Clientes> getAll() {
		return clienteService.getAll();
	}
	
	//Excluir item
	@DeleteMapping("{id}")
	public void deletar(@PathVariable Integer id) {
		clienteService.deletar(id);
	}
	
	@PatchMapping("{id}")
	public Clientes update(@PathVariable int id, @RequestBody Clientes cliente) {
		return clienteService.update(id, cliente);
	}
}
