package com.dio.crudClient.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 																						//Inclui todos os Gte e Set
@AllArgsConstructor
@NoArgsConstructor
@Entity 																					//@Entity é o mapeamento entre a classe e tabela
@Table(name="CLIENTES") 
public class Clientes {
	@Id 																					// especifica qual é a chave primaria independente da descrição da chave primaria 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 									// Avisa que o Banco irá gerar o ID e como será gerado o cod ID
	private int id;
	@Column (name = "nome") 																//Fazendo referencia a coluna no BD, exatamente como está escrita no BD
	private String nome;
	private String email;
	private String cpf;
	private String idade;
	
}
