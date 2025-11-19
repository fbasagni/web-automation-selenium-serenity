# Automação Web com Java, Selenium e BDD – Projeto Amazon

Este projeto implementa uma automação front-end para o site da Amazon, utilizando Java, Selenium WebDriver e especificações de comportamento escritas em Gherkin (BDD).  
O objetivo é simular o uso real da plataforma, validando navegação, busca e adição de produtos ao carrinho.

A estrutura foi desenvolvida seguindo boas práticas de automação, com foco em clareza, organização e manutenção contínua.


---


## 1. Objetivo do Projeto

Este repositório foi criado para demonstrar:

- Aplicação prática de automação web utilizando Java e Selenium.
- Organização dos testes com o padrão Page Object Model (POM).
- Escrita de cenários em Gherkin, facilitando o entendimento sobre o comportamento esperado.
- Validação do fluxo funcional principal de um e-commerce (busca e adição ao carrinho).

O projeto reúne princípios que utilizo no dia a dia, trazendo uma visão clara e estruturada sobre automação web.


---


## 2. Importância do Projeto

Este projeto apresenta conceitos fundamentais para automações profissionais:

### Comunicação clara com BDD
Os cenários escritos em Gherkin descrevem de forma objetiva o comportamento esperado, facilitando a comunicação entre áreas técnicas e não técnicas.

### Organização com Page Object Model
O uso do POM garante reutilização de código e facilidade de manutenção, essencial para projetos mais longos e complexos.

### Simulação real do usuário
O Selenium WebDriver reproduz ações reais no navegador, permitindo validar com precisão pontos importantes da experiência do usuário.

### Demonstração prática de competências
Este projeto reúne habilidades em Java, Selenium, testes funcionais e estruturação de suítes, demonstrando práticas utilizadas em projetos reais.

---


## 3. Tecnologias Utilizadas

- Java 8 ou superior  
- Selenium WebDriver  
- JUnit  
- Cucumber / Gherkin (BDD)  
- Page Object Model  
- Maven  
- ChromeDriver ou WebDriver equivalente  


---


## 4. Estrutura do Projeto

```plaintext

src
 └── main
      └── java
          └── pages/               # Páginas estruturadas no padrão POM
 └── test
      └── java
           ├── steps/              # Step Definitions do BDD
           ├── runners/            # Classes de execução dos testes
           └── features/           # Cenários .feature escritos em Gherkin

```


## 5. Funcionalidades Automatizadas


Os testes cobrem as principais interações do fluxo de compra:

 - Acesso à página inicial
 - Busca de produtos
 - Seleção de itens
 - Validação das informações exibidas
 - Adição ao carrinho

Este fluxo representa uma parte crítica da jornada do usuário em e-commerces e é frequentemente alvo de validação em projetos reais.


## 6. Como Executar


Pré-requisitos

  - Java 8+
  - Maven
  - WebDriver compatível com o navegador


Passos

  1. Clone o repositório:

  ```plaintext

git clone https://github.com/fbasagni/amazon_automation_project.git
```

2. Instale as dependências:

  ```plaintext

mvn install
```
   
3. Execute os testes:

  ```plaintext

mvn test
```


## 7. Exemplo de Cenário BDD

  ```plaintext

Feature: Fluxo de compra na Amazon
  Scenario: Adicionar um produto ao carrinho
    Given que o usuário acessa a página inicial da Amazon
    When pesquisa pelo produto "notebook"
    And seleciona o primeiro item exibido
    And adiciona o item ao carrinho
    Then o carrinho deve apresentar o produto selecionado
```

## 8. Considerações Finais

Este é um projeto de demonstração desenvolvido com estrutura profissional.
Ele evidencia práticas importantes de automação, como clareza, organização, reaproveitamento de código e uso de BDD.

Pode ser expandido para novos cenários e serve como base de referência sobre minha abordagem pessoal na criação de automações front-end.
