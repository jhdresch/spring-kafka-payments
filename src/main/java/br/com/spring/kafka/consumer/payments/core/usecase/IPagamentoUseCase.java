package br.com.spring.kafka.consumer.payments.core.usecase;

import br.com.spring.kafka.consumer.payments.entrypoint.model.Pagamento;

public interface IPagamentoUseCase {
	
	void enviadoPAgamento(final Pagamento pagamento);

}
