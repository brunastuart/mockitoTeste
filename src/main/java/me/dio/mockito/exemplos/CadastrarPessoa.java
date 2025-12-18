package me.dio.mockito.exemplos;

import java.time.LocalDate;

public class CadastrarPessoa {

    private ApiDosCorreios apiDosCorreios;

    // Construtor com injeção de dependência da API dos Correios
    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        // Cria uma nova instância de Pessoa com os dados básicos
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        // Busca os dados de endereço na API externa usando o CEP
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        // Adiciona os dados de endereço retornados à pessoa
        pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }

}
