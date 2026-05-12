package com.infnet.microservicesKafka.Services;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumerService {

    @KafkaListener(topics = "Meu-topico-teste", groupId = "defaultGroup")
    public void consumirMensagem(String mensagem){
        System.out.println("Mensagem recebida com sucesso: " + mensagem);
    }
}
