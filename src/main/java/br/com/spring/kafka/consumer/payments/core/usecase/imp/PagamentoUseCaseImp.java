package br.com.spring.kafka.consumer.payments.core.usecase.imp;

import br.com.spring.kafka.consumer.payments.core.usecase.IPagamentoUseCase;
import br.com.spring.kafka.consumer.payments.core.usecase.dataprovider.IPagamentoDataProvider;
import br.com.spring.kafka.consumer.payments.entrypoint.model.Pagamento;

public class PagamentoUseCaseImp implements IPagamentoUseCase {
	
	final IPagamentoDataProvider pagamentoDataProvider;
	
	
	public PagamentoUseCaseImp(IPagamentoDataProvider pagamentoDataProvider) {
		this.pagamentoDataProvider = pagamentoDataProvider;
	}
	
	@Override
	public void enviadoPAgamento(Pagamento pagamento) {
		pagamentoDataProvider.envioKafka(pagamento);
	}
	

}
