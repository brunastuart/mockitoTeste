package me.dio.mockito.exemplos;

public class Email {

    // Armazena o endereço de e-mail do destinatário
    private String enderecoEmail;

    // Armazena o conteúdo da mensagem
    private String mensagem;

    // Define o formato do e-mail (HTML ou TEXTO)
    private Formato formato;

    // Construtor: Inicializa o objeto Email com os dados fornecidos
    public Email(String enderecoEmail, String mensagem, Formato formato) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
        this.formato = formato;
    }

    public String getEnderecoEmail() {
        // Retorna o endereço de e-mail
        return enderecoEmail;
    }

    public String getMensagem() {
        // Retorna o conteúdo da mensagem
        return mensagem;
    }

    public Formato getFormato() {
        // Retorna o formato do e-mail
        return formato;
    }
}
