package com.company.base.steps.serenity;

import com.company.base.pages.PageBabyRefil;
import net.thucydides.core.annotations.Step;

import java.util.Map;

public class BabyRefilSteps {

    PageBabyRefil pageBabyRefil;

    @Step
    public void acessarSiteBabyRefil() {
        pageBabyRefil.acessarSite();
    }

    @Step
    public void clicarComoFunciona() {
        pageBabyRefil.clicarComoFunciona();
    }

    @Step
    public void selecionarPlanoAssinatura() {
        pageBabyRefil.selecionarPlanoAssinatura();
    }

    @Step
    public void clicarAssinarAgora() {
        pageBabyRefil.clicarAssinarAgora();
    }

    @Step
    public void selecionarPrimeiroPlanoComFrequencia(String frequencia) {
        pageBabyRefil.selecionarPrimeiroPlanoComFrequencia(frequencia);
    }

    @Step
    public void clicarAvancar() {
        pageBabyRefil.clicarAvancar();
    }

    @Step
    public void preencherEnderecoDeEntrega(String cep, String numero, String complemento) {
        pageBabyRefil.preencherEnderecoDeEntrega(cep, numero, complemento);
    }

    @Step
    public void preencherDadosCartaoPagamento(Map<String, String> dados) {
        pageBabyRefil.preencherDadosCartaoPagamento(dados);
    }

    @Step
    public void clicarFinalizarAssinatura() {
        pageBabyRefil.clicarFinalizarAssinatura();
    }

    @Step
    public void verificarMensagemPagamentoRecusado() {
        pageBabyRefil.verificarMensagemPagamentoRecusado();
    }

    @Step
    public void verificarNotificacaoErroValidacao() {
        pageBabyRefil.verificarNotificacaoErroValidacao();
    }

    @Step
    public void verificarConteudoSecaoPlanos(String titulo) {
        pageBabyRefil.verificarConteudoSecaoPlanos(titulo);
    }

    @Step
    public void verificarPrecoPlano(String preco) {
        pageBabyRefil.verificarPrecoPlano(preco);
    }

    @Step
    public void verificarBeneficiosDoPlano() {
        pageBabyRefil.verificarBeneficiosDoPlano();
    }

    @Step
    public void verificarFormularioDadosPessoaisExibido() {
        pageBabyRefil.verificarFormularioDadosPessoaisExibido();
    }

    @Step
    public void preencherDadosPessoaisComFaker(String idadeBebe) {
        pageBabyRefil.preencherDadosPessoaisComFaker(idadeBebe);
    }

    @Step
    public void verificarFormularioPagamentoExibido() {
        pageBabyRefil.verificarFormularioPagamentoExibido();
    }
}
