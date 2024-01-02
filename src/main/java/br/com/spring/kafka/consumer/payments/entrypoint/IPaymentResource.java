package br.com.spring.kafka.consumer.payments.entrypoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.spring.kafka.consumer.payments.entrypoint.model.Pagamento;

public interface IPaymentResource {
	
	@PostMapping
	ResponseEntity<Pagamento> pagamento(@RequestBody Pagamento pagamento); 

}
