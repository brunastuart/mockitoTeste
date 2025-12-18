# Mockito Exemplos

Este repositório contém uma coleção de exemplos práticos demonstrando o uso do framework **Mockito** em conjunto com **JUnit 5** para testes unitários em Java.

O objetivo é servir como um guia de referência para as principais funcionalidades do Mockito, desde a criação básica de mocks até cenários mais avançados como métodos estáticos e captura de argumentos.

## 🛠 Tecnologias Utilizadas

*   **Java 21**
*   **Maven**
*   **JUnit 5**
*   **Mockito 5** (incluindo `mockito-inline` para mocks de métodos estáticos)

## 📚 Funcionalidades Demonstradas

O projeto está organizado em classes de teste que isolam funcionalidades específicas:

### 1. Configuração e Injeção Básica
*   **Classe:** `CadastrarPessoaTeste`
*   **Conceitos:**
    *   Uso de `@Mock` para criar dependências simuladas.
    *   Uso de `@InjectMocks` para injetar mocks na classe testada.
    *   Configuração de retorno com `when(...).thenReturn(...)`.
    *   Simulação de exceções com `when(...).thenThrow(...)`.

### 2. Manipulação de Retornos
*   **Classe:** `PessoaTeste`
*   **Conceitos:**
    *   Diferentes formas de configurar retornos (`when` vs `doReturn`).
    *   Uso de `doAnswer` para lógicas dinâmicas de retorno.

### 3. Argument Matchers (Comparadores)
*   **Classe:** `ApiDosCorreiosTeste`
*   **Conceitos:**
    *   Uso de `anyString()` para aceitar qualquer argumento.
    *   Combinação de matchers genéricos com valores específicos.

### 4. Captura de Argumentos
*   **Classe:** `ServicoEnvioEmailTeste`
*   **Conceitos:**
    *   Uso de `@Captor` e `ArgumentCaptor`.
    *   Captura de objetos passados para métodos mockados para asserções detalhadas.

### 5. Mocks de Métodos Void e Exceções
*   **Classe:** `PlataformaDeEnvioTeste`
*   **Conceitos:**
    *   Uso de `doThrow` para métodos que retornam `void`.

### 6. Mock de Métodos Estáticos
*   **Classe:** `GeradorDeNumerosTeste`
*   **Conceitos:**
    *   Uso de `Mockito.mockStatic` (requer dependência `mockito-inline`).
    *   Simulação de comportamento de métodos estáticos dentro de um escopo `try-with-resources`.

### 7. Espiões (Spies)
*   **Classes:** `EnviarMensagemTeste`, `ContaTeste`
*   **Conceitos:**
    *   Uso de `@Spy` para monitorar objetos reais em vez de criar mocks completos.
    *   Verificação de chamadas em métodos reais.

### 8. Verificação de Comportamento
*   **Classe:** `ContaTeste`
*   **Conceitos:**
    *   `verify(...)`: Verificar se um método foi chamado.
    *   `verifyNoInteractions(...)`: Garantir que nenhum método do mock foi chamado.
    *   `InOrder`: Verificar a ordem exata das chamadas.
    *   `times(...)`: Verificar a quantidade de vezes que um método foi invocado.

## 🚀 Como Executar

Para rodar os testes, certifique-se de ter o Maven e o JDK 21 instalados.

```bash
mvn test
```
