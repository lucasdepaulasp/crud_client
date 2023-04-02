package com.dio.crudClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.crudClient.entities.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository <Clientes, Integer>{

}
