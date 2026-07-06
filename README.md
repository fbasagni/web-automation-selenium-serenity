# Automação Web com Java, Selenium e BDD – Projeto BabyRefil

Este projeto implementa uma automação front-end para o fluxo de assinatura do site BabyRefil, utilizando Java, Selenium WebDriver, Serenity BDD e especificações de comportamento escritas em Gherkin (BDD).
O objetivo é simular o uso real da plataforma, validando a jornada completa de assinatura: seleção de plano, preenchimento de dados pessoais e endereço, e pagamento (incluindo o fluxo de cartão recusado e retentativa).

A estrutura foi desenvolvida seguindo boas práticas de automação, com foco em clareza, organização e manutenção contínua.


---


## 1. Objetivo do Projeto

Este repositório foi criado para demonstrar:

- Aplicação prática de automação web utilizando Java, Selenium e Serenity BDD.
- Organização dos testes com o padrão Page Object Model (POM).
- Escrita de cenários em Gherkin (em português), facilitando o entendimento sobre o comportamento esperado.
- Geração de dados de teste dinâmicos e realistas com JavaFaker, evitando dados fixos/sensíveis na massa de testes.
- Validação do fluxo funcional principal de uma assinatura recorrente (seleção de plano, dados pessoais, endereço e pagamento).

O projeto reúne princípios que utilizo no dia a dia, trazendo uma visão clara e estruturada sobre automação web.


---


## 2. Importância do Projeto

Este projeto apresenta conceitos fundamentais para automações profissionais:

### Comunicação clara com BDD
Os cenários escritos em Gherkin descrevem de forma objetiva o comportamento esperado, facilitando a comunicação entre áreas técnicas e não técnicas.

### Organização com Page Object Model
O uso do POM garante reutilização de código e facilidade de manutenção, essencial para projetos mais longos e complexos.

### Massa de dados dinâmica com Faker
Dados pessoais (nome, e-mail, telefone) são gerados dinamicamente a cada execução, reduzindo dependência de dados fixos e aumentando a segurança da suíte.

### Simulação real do usuário
O Selenium WebDriver reproduz ações reais no navegador, permitindo validar com precisão pontos importantes da experiência do usuário.

### Demonstração prática de competências
Este projeto reúne habilidades em Java, Selenium, Serenity BDD, testes funcionais e estruturação de suítes, demonstrando práticas utilizadas em projetos reais.

---


## 3. Tecnologias Utilizadas

- Java 8 ou superior
- Selenium WebDriver
- Serenity BDD
- JUnit
- Cucumber4 / Gherkin (BDD)
- JavaFaker (geração de dados de teste)
- WebDriverManager (gerenciamento automático do ChromeDriver)
- Page Object Model
- Maven


---


## 4. Estrutura do Projeto

```plaintext

src
 └── test
      ├── java
      │    └── com/company/base/
      │         ├── pages/               # Páginas estruturadas no padrão POM
      │         ├── steps/
      │         │    ├── serenity/        # Camada de @Step do Serenity
      │         │    └── definitionSteps/ # Step Definitions do BDD (Cucumber)
      │         ├── runners/              # Classes de execução dos testes (JUnit + Cucumber)
      │         └── util/                 # Helpers (Faker, datas, YAML, etc.)
      └── resources
           └── features/                  # Cenários .feature escritos em Gherkin

```


## 5. Funcionalidades Automatizadas

Os testes cobrem as principais interações do fluxo de assinatura:

 - Acesso à página inicial e navegação até a seção de planos
 - Seleção de plano e frequência de entrega
 - Preenchimento de dados pessoais e do bebê (com dados gerados via Faker)
 - Preenchimento de endereço de entrega (busca por CEP)
 - Preenchimento e envio de dados de pagamento
 - Validação do fluxo de pagamento recusado e retentativa com novo cartão

Este fluxo representa uma parte crítica da jornada do usuário em plataformas de assinatura recorrente e é frequentemente alvo de validação em projetos reais.


## 6. Como Executar


Pré-requisitos

  - Java 8+
  - Maven
  - Google Chrome instalado (o ChromeDriver é baixado e gerenciado automaticamente pelo WebDriverManager)


Passos

  1. Clone o repositório:

  ```plaintext

git clone https://github.com/fbasagni/web-automation-selenium-serenity.git
```

2. Instale as dependências:

  ```plaintext

mvn install
```

3. Execute os testes:

  ```plaintext

mvn verify
```

4. Consulte o relatório gerado pelo Serenity em:

  ```plaintext

target/site/serenity/index.html
```


## 7. Exemplo de Cenário BDD

  ```plaintext

Funcionalidade: Assinatura no site BabyRefil
  Contexto:
    Dado que acesso o site BabyRefil
    E clico no link Como Funciona

  Cenario: Preencher cadastro e endereco com dados gerados dinamicamente via Faker
    E seleciono o plano de assinatura
    E clico em Assinar agora
    E seleciono o primeiro plano com frequencia "A cada 15 dias"
    E clico em Avancar para dados pessoais
    E preencho os dados pessoais gerados automaticamente com idade do bebe "9-12 meses"
    E preencho o endereco de entrega com CEP "09635140" numero "1111" e complemento "bl 8"
    E clico em Avancar para pagamento
    Entao o sistema exibe o formulario de pagamento
```

## 8. Considerações Finais

Este é um projeto de demonstração desenvolvido com estrutura profissional.
Ele evidencia práticas importantes de automação, como clareza, organização, reaproveitamento de código, geração dinâmica de massa de dados e uso de BDD.

Pode ser expandido para novos cenários e serve como base de referência sobre minha abordagem pessoal na criação de automações front-end.
