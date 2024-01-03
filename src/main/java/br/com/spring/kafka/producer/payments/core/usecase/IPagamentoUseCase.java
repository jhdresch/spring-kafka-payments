package br.com.spring.kafka.producer.payments.core.usecase;

import br.com.spring.kafka.producer.payments.entrypoint.model.Pagamento;

public interface IPagamentoUseCase {
	
	void enviadoPAgamento(final Pagamento pagamento);

}
