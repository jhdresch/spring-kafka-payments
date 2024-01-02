package br.com.spring.kafka.consumer.payments.entrypoint.model;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Pagamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idUser;
	private Long idProduto;
	private String cartaoNumero;
	

}
