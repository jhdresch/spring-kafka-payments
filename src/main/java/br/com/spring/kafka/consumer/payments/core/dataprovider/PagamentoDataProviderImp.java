package br.com.spring.kafka.consumer.payments.core.dataprovider;

import org.springframework.stereotype.Component;

import br.com.spring.kafka.consumer.payments.core.usecase.dataprovider.IPagamentoDataProvider;
import br.com.spring.kafka.consumer.payments.entrypoint.model.Pagamento;

@Component
public class PagamentoDataProviderImp implements IPagamentoDataProvider {

	@Override
	public void envioKafka(Pagamento pagamento) {

		
	}

}
