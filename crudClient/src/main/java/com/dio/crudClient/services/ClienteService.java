package com.dio.crudClient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.crudClient.entities.Clientes;
import com.dio.crudClient.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Clientes save(Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Clientes> getAll(){
		return clienteRepository.findAll();
	}
	
	//Deletar
	public void deletar(int id) {
		clienteRepository.deleteById(id);
	}
	
	//Update
		public Clientes update(int id, Clientes clientes) {
			Optional<Clientes> optional = clienteRepository.findById(id);// Primeiro é verificar se existe no banco de dados
			if (optional.isPresent() == true){ // isPresent é o mesmo que contém, e está comparando se existe no banco de dados
				Clientes clienteBD = optional.get();
				clienteBD.setNome(clientes.getNome());
				clienteBD.setEmail(clientes.getEmail());
				 
				return clienteRepository.save(clienteBD); 
			}
			else {
				return new Clientes (); // caso não exista no banco de dados  ele vai criar um novo objeto vario e retornar o msm 
			}
		}
}
