package me.dio.mockito.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {

    // Lista interna para armazenar as mensagens adicionadas
    private List<Mensagem> mensagens = new ArrayList<>();

    // Adiciona uma nova mensagem à lista interna
    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    // Retorna uma visualização imutável da lista de mensagens para evitar modificações externas
    public List<Mensagem> getMensagens() {
        return Collections.unmodifiableList(this.mensagens);
    }

}
