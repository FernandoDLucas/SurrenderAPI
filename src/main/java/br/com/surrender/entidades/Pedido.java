package br.com.surrender.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "Pedido")
public class Pedido {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "ID")
	private Long id;
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "PEDCOD")
	private Long idpedido; 
	
	@Column (name = "PEDIDODESCR")
	private String pedidoDescricao; 
	
	@Column (name = "PEDIDOVLR", scale = 2)
	private BigDecimal pedidoValor; 
	
	@Column (name = "PEDIDODATA")
	private LocalDate pedidoData;
	
}
