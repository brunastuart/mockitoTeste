package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

/**
 * Teste da classe {@link EnviarMensagem} exemplificando Spy
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    // @Spy: Cria um objeto "espião" que envolve a instância real.
    // Permite verificar interações (verify) enquanto mantém o comportamento real do objeto.
    @Spy
    EnviarMensagem enviarMensagem = new EnviarMensagem();

    @Test
    void adicionarMensagem() {
        // Prepara o dado de teste (uma mensagem)
        Mensagem mensagem = new Mensagem("Hello World");

        // Executa o método real da classe monitorada pelo Spy
        enviarMensagem.adicionarMensagem(mensagem);

        // Verifica se o método adicionarMensagem foi de fato chamado com o objeto esperado
        verify(enviarMensagem).adicionarMensagem(mensagem);

        // Valida se o comportamento real ocorreu (a mensagem foi adicionada à lista)
        Assertions.assertEquals(1, enviarMensagem.getMensagens().size());
    }

}
