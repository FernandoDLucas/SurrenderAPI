package br.com.surrender.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID")
	private long produtoId;
	
	@Column (name = "PROCOD")
	private Long produtoCod; 
	
	@Column (name = "PRONOME")
	private String produtoNome;
	
	@Column (name = "PRONOMERED")
	private String produtoNomeRed; // descrição reduzida do produto 
	
	@Column (name = "PROPRECO")
	private BigDecimal produtoPreco; 
	
	@Column (name = "PROUNI")
	private String produtoUnidade; 
	
	public Produto() {}
	
}
