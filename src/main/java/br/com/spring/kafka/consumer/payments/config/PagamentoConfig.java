package br.com.spring.kafka.consumer.payments.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.spring.kafka.consumer.payments.core.dataprovider.PagamentoDataProviderImp;
import br.com.spring.kafka.consumer.payments.core.usecase.imp.PagamentoUseCaseImp;

@Configuration
public class PagamentoConfig {
	
	@Bean
	PagamentoUseCaseImp pagamentoUseCaseImp (PagamentoDataProviderImp pagamentoDataProviderImp) {
		return new PagamentoUseCaseImp(pagamentoDataProviderImp);
	}

}
