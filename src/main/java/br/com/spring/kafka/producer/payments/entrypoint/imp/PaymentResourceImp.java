package br.com.spring.kafka.producer.payments.entrypoint.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.kafka.producer.payments.core.usecase.IPagamentoUseCase;
import br.com.spring.kafka.producer.payments.entrypoint.IPaymentResource;
import br.com.spring.kafka.producer.payments.entrypoint.model.Pagamento;

@RestController
@RequestMapping("/payments")
public class PaymentResourceImp implements IPaymentResource{
	
	@Autowired
	private IPagamentoUseCase pagamentoUseCase;

	@Override
	public ResponseEntity<Pagamento> pagamento(Pagamento pagamento) {
		pagamentoUseCase.enviadoPAgamento(pagamento);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
