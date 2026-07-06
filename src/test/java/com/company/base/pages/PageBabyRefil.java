package com.company.base.pages;

import com.company.base.util.DateHelper;
import com.company.base.util.FakerHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

@DefaultUrl("https://babyrefil.vercel.app/")
public class PageBabyRefil extends BasePage {

    // === NAVEGAÇÃO ===
    @FindBy(xpath = "//a[normalize-space(.)='Como Funciona']")
    private WebElementFacade lnkComoFunciona;

    // === SELEÇÃO DE PLANO ===
    @FindBy(css = "div:nth-child(2) > .flex > .mx-auto")
    private WebElementFacade divPlanoDestaque;

    @FindBy(xpath = "//button[normalize-space(.)='Assinar agora']")
    private WebElementFacade btnAssinarAgora;

    @FindBy(xpath = "(//button[normalize-space(.)='Selecionar Plano'])[1]")
    private WebElementFacade btnSelecionarPrimeiroPlano;

    @FindBy(xpath = "//button[normalize-space(.)='Avançar']")
    private WebElementFacade btnAvancar;

    // === DADOS PESSOAIS ===
    @FindBy(xpath = "//input[@name='fullName']")
    private WebElementFacade txtNomeCompleto;

    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade txtEmail;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElementFacade txtTelefone;

    @FindBy(xpath = "//input[@name='babyName']")
    private WebElementFacade txtNomeBebe;

    @FindBy(xpath = "//button[@role='combobox']")
    private WebElementFacade btnIdadeBebe;

    // === ENDEREÇO ===
    @FindBy(xpath = "//input[@name='cep']")
    private WebElementFacade txtCEP;

    @FindBy(xpath = "//button[normalize-space(.)='Buscar']")
    private WebElementFacade btnBuscarCEP;

    @FindBy(xpath = "//input[@name='number']")
    private WebElementFacade txtNumero;

    @FindBy(xpath = "//input[@name='complement']")
    private WebElementFacade txtComplemento;

    // === PAGAMENTO ===
    @FindBy(xpath = "//input[@name='cardNumber']")
    private WebElementFacade txtNumeroCartao;

    @FindBy(xpath = "//input[@name='cardName']")
    private WebElementFacade txtNomeCartao;

    @FindBy(xpath = "//input[@name='cardExpiry']")
    private WebElementFacade txtValidade;

    @FindBy(xpath = "//input[@name='cardCvv']")
    private WebElementFacade txtCVV;

    @FindBy(xpath = "//input[@name='cpf']")
    private WebElementFacade txtCPFTitular;

    @FindBy(xpath = "//button[normalize-space(.)='Finalizar Assinatura']")
    private WebElementFacade btnFinalizarAssinatura;

    // === VALIDAÇÕES E CONTEÚDO ===
    @FindBy(xpath = "//*[contains(.,'Pagamento Recusado')]")
    private WebElementFacade msgPagamentoRecusado;

    @FindBy(xpath = "//*[contains(.,'Não foi possível validar')]")
    private WebElementFacade msgErroValidacao;

    @FindBy(xpath = "//*[contains(.,'Escolha seu plano')]")
    private WebElementFacade tituloSecaoPlanos;

    @FindBy(xpath = "//*[contains(.,'119,90')]")
    private WebElementFacade precoPlano;

    @FindBy(xpath = "//*[contains(.,'4 pacotes de fralda premium')]")
    private WebElementFacade beneficioFraldas;

    @FindBy(xpath = "//*[contains(.,'Kit de cuidados diários para')]")
    private WebElementFacade beneficioKitCuidados;

    // =====================================================================
    // MÉTODOS
    // =====================================================================

    public void acessarSite() {
        open();
        DateHelper.waitThread(3000);
    }

    public void clicarComoFunciona() {
        waitFor(lnkComoFunciona).waitUntilClickable().click();
        DateHelper.waitThread(2000);
    }

    public void selecionarPlanoAssinatura() {
        waitFor(divPlanoDestaque).waitUntilClickable();
        scrollAteElemento(divPlanoDestaque);
        evaluateJavascript("arguments[0].click();", divPlanoDestaque);
        DateHelper.waitThread(1000);
    }

    public void clicarAssinarAgora() {
        waitFor(btnAssinarAgora).waitUntilClickable();
        scrollAteElemento(btnAssinarAgora);
        evaluateJavascript("arguments[0].click();", btnAssinarAgora);
        DateHelper.waitThread(2000);
    }

    public void selecionarPrimeiroPlanoComFrequencia(String frequencia) {
        waitFor(btnSelecionarPrimeiroPlano).waitUntilClickable();
        btnSelecionarPrimeiroPlano.click();
        DateHelper.waitThread(1000);
        
        WebElementFacade opcaoFrequencia = find(By.xpath("//*[contains(.,'" + frequencia + "') and not(self::script) and not(self::style)]"));
        waitFor(opcaoFrequencia).waitUntilClickable().click();
        DateHelper.waitThread(1000);
    }

    public void clicarAvancar() {
        waitFor(btnAvancar).waitUntilClickable();
        btnAvancar.click();
        DateHelper.waitThread(2000);
    }

    public void preencherDadosPessoais(Map<String, String> dados) {
        waitFor(txtNomeCompleto);
        typeAndVerify(txtNomeCompleto, dados.get("nomeCompleto"));
        DateHelper.waitThread(300);

        typeAndVerify(txtEmail, dados.get("email"));
        DateHelper.waitThread(300);

        typeAndVerify(txtTelefone, dados.get("telefone"));
        DateHelper.waitThread(300);

        typeAndVerify(txtNomeBebe, dados.get("nomeBebe"));
        DateHelper.waitThread(300);

        selecionarIdadeBebe(dados.get("idadeBebe"));
        DateHelper.waitThread(500);
    }

    private void selecionarIdadeBebe(String idadeBebe) {
        waitFor(btnIdadeBebe).waitUntilClickable().click();
        DateHelper.waitThread(500);
        WebElementFacade opcao = find(By.xpath("//*[@role='option'][normalize-space(.)='" + idadeBebe + "']"));
        waitFor(opcao).waitUntilClickable().click();
    }

    public void preencherEnderecoDeEntrega(String cep, String numero, String complemento) {
        waitFor(txtCEP);
        typeAndVerify(txtCEP, cep);
        DateHelper.waitThread(500);

        waitFor(btnBuscarCEP);
        btnBuscarCEP.click();
        DateHelper.waitThread(2000);

        waitFor(txtNumero);
        typeAndVerify(txtNumero, numero);
        DateHelper.waitThread(300);

        typeAndVerify(txtComplemento, complemento);
        DateHelper.waitThread(300);
    }

    public void preencherDadosCartaoPagamento(Map<String, String> dados) {
        waitFor(txtNumeroCartao);
        sliceAndType(txtNumeroCartao, dados.get("numeroCartao"));
        DateHelper.waitThread(500);

        if (dados.containsKey("nomeCartao")) {
            typeAndVerify(txtNomeCartao, dados.get("nomeCartao"));
            DateHelper.waitThread(300);
        }

        typeAndVerify(txtValidade, dados.get("validade"));
        DateHelper.waitThread(300);

        typeAndVerify(txtCVV, dados.get("cvv"));
        DateHelper.waitThread(300);

        if (dados.containsKey("cpfTitular")) {
            typeAndVerify(txtCPFTitular, dados.get("cpfTitular"));
            DateHelper.waitThread(300);
        }
    }

    public void clicarFinalizarAssinatura() {
        waitFor(btnFinalizarAssinatura);
        btnFinalizarAssinatura.click();
        DateHelper.waitThread(3000);
    }

    public void verificarMensagemPagamentoRecusado() {
        waitFor(msgPagamentoRecusado);
        Assert.assertTrue(
            "Mensagem 'Pagamento Recusado' não foi exibida",
            msgPagamentoRecusado.isVisible()
        );
    }

    public void verificarNotificacaoErroValidacao() {
        waitFor(msgErroValidacao);
        Assert.assertTrue(
            "Notificação de erro de validação não foi exibida",
            msgErroValidacao.isVisible()
        );
    }

    public void verificarConteudoSecaoPlanos(String titulo) {
        waitFor(tituloSecaoPlanos);
        Assert.assertTrue(
            "Seção de planos com título '" + titulo + "' não foi encontrada",
            tituloSecaoPlanos.isVisible()
        );
    }

    public void verificarPrecoPlano(String preco) {
        waitFor(precoPlano);
        Assert.assertTrue(
            "Preço '" + preco + "' não foi exibido na página",
            precoPlano.isVisible()
        );
    }

    public void verificarBeneficiosDoPlano() {
        waitFor(beneficioFraldas);
        Assert.assertTrue("Benefício de fraldas não exibido", beneficioFraldas.isVisible());
        waitFor(beneficioKitCuidados);
        Assert.assertTrue("Benefício de kit de cuidados não exibido", beneficioKitCuidados.isVisible());
    }

    public void verificarFormularioDadosPessoaisExibido() {
        waitFor(txtNomeCompleto);
        Assert.assertTrue("Campo 'Nome Completo' não foi exibido no formulário", txtNomeCompleto.isVisible());
        Assert.assertTrue("Campo 'E-mail' não foi exibido no formulário", txtEmail.isVisible());
        Assert.assertTrue("Campo 'Telefone' não foi exibido no formulário", txtTelefone.isVisible());
        Assert.assertTrue("Campo 'Nome do Bebê' não foi exibido no formulário", txtNomeBebe.isVisible());
    }

    public void preencherDadosPessoaisComFaker(String idadeBebe) {
        preencherDadosPessoais(FakerHelper.dadosPessoais(idadeBebe));
    }

    public void verificarFormularioPagamentoExibido() {
        waitFor(txtNumeroCartao);
        Assert.assertTrue("Campo 'Número do Cartão' não foi exibido", txtNumeroCartao.isVisible());
        Assert.assertTrue("Campo 'CVV' não foi exibido", txtCVV.isVisible());
        Assert.assertTrue("Botão 'Finalizar Assinatura' não foi exibido", btnFinalizarAssinatura.isVisible());
    }
}
