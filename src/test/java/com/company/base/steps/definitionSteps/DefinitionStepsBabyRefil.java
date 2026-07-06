package com.company.base.steps.definitionSteps;

import com.company.base.steps.serenity.BabyRefilSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.*;
import net.thucydides.core.annotations.Steps;

public class DefinitionStepsBabyRefil {

    @Steps
    BabyRefilSteps babyRefilSteps;

    @Dado("^que acesso o site BabyRefil$")
    public void queAcessoOSiteBabyRefil() {
        babyRefilSteps.acessarSiteBabyRefil();
    }

    @E("^clico no link Como Funciona$")
    public void clicoNoLinkComoFunciona() {
        babyRefilSteps.clicarComoFunciona();
    }

    @E("^seleciono o plano de assinatura$")
    public void selecionoOPlanoDeAssinatura() {
        babyRefilSteps.selecionarPlanoAssinatura();
    }

    @E("^clico em Assinar agora$")
    public void clicoEmAssinarAgora() {
        babyRefilSteps.clicarAssinarAgora();
    }

    @E("^seleciono o primeiro plano com frequencia \"([^\"]*)\"$")
    public void selecionoOPrimeiroPlanoComFrequencia(String frequencia) {
        babyRefilSteps.selecionarPrimeiroPlanoComFrequencia(frequencia);
    }

    @E("^clico em Avancar para dados pessoais$")
    public void clicoEmAvancarParaDadosPessoais() {
        babyRefilSteps.clicarAvancar();
    }

    @E("^preencho o endereco de entrega com CEP \"([^\"]*)\" numero \"([^\"]*)\" e complemento \"([^\"]*)\"$")
    public void preenchoOEnderecoDeEntrega(String cep, String numero, String complemento) {
        babyRefilSteps.preencherEnderecoDeEntrega(cep, numero, complemento);
    }

    @E("^clico em Avancar para pagamento$")
    public void clicoEmAvancarParaPagamento() {
        babyRefilSteps.clicarAvancar();
    }

    @E("^preencho os dados do cartao de pagamento:$")
    public void preenchoOsDadosDoCartaoDePagamento(DataTable dataTable) {
        babyRefilSteps.preencherDadosCartaoPagamento(dataTable.<String,String>asMaps(String.class, String.class).get(0));
    }

    @E("^clico em Finalizar Assinatura$")
    public void clicoEmFinalizarAssinatura() {
        babyRefilSteps.clicarFinalizarAssinatura();
    }

    @Então("^o sistema exibe a mensagem de pagamento recusado$")
    public void oSistemaExibeAMensagemDePagamentoRecusado() {
        babyRefilSteps.verificarMensagemPagamentoRecusado();
    }

    @Quando("^preencho os dados do novo cartao:$")
    public void preenchoOsDadosDoNovoCartao(DataTable dataTable) {
        babyRefilSteps.preencherDadosCartaoPagamento(dataTable.<String,String>asMaps(String.class, String.class).get(0));
    }

    @E("^clico em Finalizar Assinatura novamente$")
    public void clicoEmFinalizarAssinaturaNovamente() {
        babyRefilSteps.clicarFinalizarAssinatura();
    }

    @Então("^o sistema exibe a notificacao de erro de validacao$")
    public void oSistemaExibeANotificacaoDeErroDeValidacao() {
        babyRefilSteps.verificarNotificacaoErroValidacao();
    }

    @Então("^o sistema exibe a secao de planos com titulo \"([^\"]*)\"$")
    public void oSistemaExibeASecaoDePlanosComTitulo(String titulo) {
        babyRefilSteps.verificarConteudoSecaoPlanos(titulo);
    }

    @E("^o sistema exibe o valor do plano \"([^\"]*)\"$")
    public void oSistemaExibeOValorDoPlano(String preco) {
        babyRefilSteps.verificarPrecoPlano(preco);
    }

    @E("^o sistema exibe os beneficios do plano$")
    public void oSistemaExibeOsBeneficiosDoPlano() {
        babyRefilSteps.verificarBeneficiosDoPlano();
    }

    @Então("^o sistema exibe o formulario de dados pessoais do assinante$")
    public void oSistemaExibeOFormularioDeDadosPessoais() {
        babyRefilSteps.verificarFormularioDadosPessoaisExibido();
    }

    @E("^preencho os dados pessoais gerados automaticamente com idade do bebe \"([^\"]*)\"$")
    public void preenchoOsDadosPessoaisComFaker(String idadeBebe) {
        babyRefilSteps.preencherDadosPessoaisComFaker(idadeBebe);
    }

    @Então("^o sistema exibe o formulario de pagamento$")
    public void oSistemaExibeOFormularioDePagamento() {
        babyRefilSteps.verificarFormularioPagamentoExibido();
    }
}
