package br.com.spring.kafka.producer.payments.config;

import java.io.Serializable;
import java.util.HashMap;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

;



@Configuration
public class JsonProducerConfig {
	
	@Autowired
	private  KafkaProperties kafkaProperties;
	
	@Bean
	ProducerFactory<String, Serializable> producerFactory(){
		var config = new HashMap<String,Object>();
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(config, new StringSerializer(),new JsonSerializer<>() );
		
	}
	
	@Bean
	KafkaTemplate<String, Serializable> kafkaTemplate(ProducerFactory<String, Serializable> producerFactory){
		return new KafkaTemplate<>(producerFactory);
	}

}
