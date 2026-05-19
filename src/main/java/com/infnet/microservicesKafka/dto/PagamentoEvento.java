package com.infnet.microservicesKafka.dto;

public record PagamentoEvento(
        String idReserva,
        String idUsuario,
        String emailUsuario,
        String status,
        String mensagemErro
) {}
