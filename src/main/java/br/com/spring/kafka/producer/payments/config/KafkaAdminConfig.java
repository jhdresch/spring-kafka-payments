package br.com.spring.kafka.producer.payments.config;

import java.util.HashMap;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaAdminConfig {

	@Autowired
	private KafkaProperties kafkaProperties;

	@Bean
	KafkaAdmin configKafkaAdmin() {
		var config = new HashMap<String, Object>();
		config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
		return new KafkaAdmin(config);
	}

	@Bean
	KafkaAdmin.NewTopics topics() {
		return new KafkaAdmin.NewTopics(TopicBuilder.name("topic-pagamentos").partitions(1).replicas(1).build());
	}

}
