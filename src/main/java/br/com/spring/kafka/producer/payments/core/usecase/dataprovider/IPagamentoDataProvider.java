package br.com.spring.kafka.producer.payments.core.usecase.dataprovider;

import br.com.spring.kafka.producer.payments.entrypoint.model.Pagamento;

public interface IPagamentoDataProvider {
	
	public void envioKafka(final Pagamento pagamento);

}
