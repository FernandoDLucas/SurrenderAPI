package br.com.surrender.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "VENDEDOR")
public class Vendedor {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID")
	private long ID; 
		
	@OneToMany (fetch = FetchType.LAZY)
	private ItemPedido itenspedido;
	
}
