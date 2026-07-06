#language:pt
#encoding:utf-8
@babyrefil
Funcionalidade: Assinatura no site BabyRefil
  Permitir que o usuario realize uma assinatura de fraldas no site BabyRefil

  Contexto:
    Dado que acesso o site BabyRefil
    E clico no link Como Funciona

  Cenario: Verificar conteudo da secao de planos e iniciar processo de assinatura
    Entao o sistema exibe a secao de planos com titulo "Escolha seu plano"
    E o sistema exibe o valor do plano "R$ 119,90/entrega"
    E o sistema exibe os beneficios do plano
    Quando clico em Assinar agora
    E seleciono o primeiro plano com frequencia "A cada 15 dias"
    E clico em Avancar para dados pessoais
    Entao o sistema exibe o formulario de dados pessoais do assinante

  Cenario: Preencher cadastro e endereco com dados gerados dinamicamente via Faker
    E seleciono o plano de assinatura
    E clico em Assinar agora
    E seleciono o primeiro plano com frequencia "A cada 15 dias"
    E clico em Avancar para dados pessoais
    E preencho os dados pessoais gerados automaticamente com idade do bebe "9-12 meses"
    E preencho o endereco de entrega com CEP "09635140" numero "1111" e complemento "bl 8"
    E clico em Avancar para pagamento
    Entao o sistema exibe o formulario de pagamento

  Cenario: Realizar assinatura com plano quinzenal e validar pagamento recusado
    E seleciono o plano de assinatura
    E clico em Assinar agora
    E seleciono o primeiro plano com frequencia "A cada 15 dias"
    E clico em Avancar para dados pessoais
    E preencho os dados pessoais gerados automaticamente com idade do bebe "9-12 meses"
    E preencho o endereco de entrega com CEP "09635140" numero "1111" e complemento "bl 8"
    E clico em Avancar para pagamento
    E preencho os dados do cartao de pagamento:
      | numeroCartao         | nomeCartao | validade | cvv | cpfTitular     |
      | 4002 1030 3030 03033 | teste cart | 12/31    | 123 | 119.459.420-45 |
    E clico em Finalizar Assinatura
    Entao o sistema exibe a mensagem de pagamento recusado
    Quando preencho os dados do novo cartao:
      | numeroCartao        | validade | cvv |
      | 5229 9072 9020 5558 | 07/27    | 942 |
    E clico em Finalizar Assinatura novamente
    Entao o sistema exibe a notificacao de erro de validacao
