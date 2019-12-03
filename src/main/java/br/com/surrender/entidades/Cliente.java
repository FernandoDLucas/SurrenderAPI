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
@Table (name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID", length = 6, unique = true)
	private Long clientId;
	
	@Column (name = "CLINOME")
	private String nome; 
	
	@Column (name = "CLITIPO")
	private String tipoCli; // Identifica se é pessoa física ou jurídica 
	
	@Column (name = "CLIDOC", unique = true)
	private String documento; // CNPJ ou CPF dependendo do tipoCli 
	
	@Column (name = "CLIIDEN")
	private String identificaCli; // RG ou IE dependendo do tipoCli  
	
	@Column (name = "CLIEND")
	private String endereco;
	
	@Column (name = "CLIENDNUM")
	private long numEndereco; 
	
	@Column (name = "CLIENDCPL")
	private String cplEndereco; // Complemente do Endereco 
	
	@OneToMany (fetch = FetchType.LAZY)
	private ItemPedido itenspedido;
	
	
}
