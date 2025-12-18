package me.dio.mockito.exemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;

    private String documento;

    private LocalDate nascimento;

    private DadosLocalizacao endereco;

    // Construtor: inicializa a pessoa com nome, documento e nascimento
    public Pessoa(final String nome, final String documento, final LocalDate nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    // Adiciona os dados de endereço à pessoa
    public void adicionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    // Verifica se a pessoa é maior de 18 anos
    public boolean ehMaiorDeIdade() {
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) > 18L;
    }
}
