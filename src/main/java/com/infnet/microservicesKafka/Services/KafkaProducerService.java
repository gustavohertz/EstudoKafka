package com.infnet.microservicesKafka.Services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensagem(String topico, String mensagem){
        kafkaTemplate.send(topico, mensagem);
        System.out.println("Mensagem enviada para o tópico " + topico + ": " + mensagem);
    }
}
