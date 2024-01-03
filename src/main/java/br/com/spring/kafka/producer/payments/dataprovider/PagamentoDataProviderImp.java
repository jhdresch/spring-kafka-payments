package br.com.spring.kafka.producer.payments.dataprovider;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.spring.kafka.producer.payments.core.usecase.dataprovider.IPagamentoDataProvider;
import br.com.spring.kafka.producer.payments.entrypoint.model.Pagamento;

@Component
public class PagamentoDataProviderImp implements IPagamentoDataProvider {

	@Autowired
	private KafkaTemplate<String, Serializable> kafkaTemplate;
	
	@Override
	public void envioKafka(Pagamento pagamento) {
    
		kafkaTemplate.send("topic-pagamentos",pagamento);
		
	}

}
