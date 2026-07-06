package com.company.base.util;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Centraliza a geração de dados falsos e realistas usando a biblioteca JavaFaker.
 * Utiliza localidade pt-BR para nomes e telefones brasileiros.
 */
public class FakerHelper {

    private static final Faker faker = new Faker(new Locale("pt", "BR"));

    /** Nome completo brasileiro aleatório */
    public static String nomeCompleto() {
        return faker.name().fullName();
    }

    /** E-mail aleatório em formato válido */
    public static String email() {
        return faker.internet().emailAddress();
    }

    /** Número de celular brasileiro no formato 011XXXXXXXXX */
    public static String telefone() {
        return faker.numerify("011#########");
    }

    /** Primeiro nome para uso como nome de bebê */
    public static String nomeBebe() {
        return faker.name().firstName();
    }

    /** Número de endereço aleatório */
    public static String numero() {
        return faker.numerify("###");
    }

    /** Complemento de endereço aleatório */
    public static String complemento() {
        return faker.options().option("Apto 10", "Casa", "Bl 5", "Sl 2", "Cobertura", "Fundos");
    }

    /** Nome para cartão de crédito (maiúsculo, sem acentos) */
    public static String nomeCartao() {
        return faker.name().fullName().toUpperCase()
                .replace("Ã", "A").replace("Ç", "C").replace("É", "E")
                .replace("Ê", "E").replace("Á", "A").replace("Ó", "O")
                .replace("Ú", "U").replace("Â", "A").replace("Í", "I")
                .replace("Õ", "O").replace("Ô", "O").replace("Ü", "U");
    }

    /**
     * Retorna um mapa com dados pessoais gerados para o formulário de assinante.
     * O campo idadeBebe deve ser passado pois é uma opção fixa do site.
     */
    public static Map<String, String> dadosPessoais(String idadeBebe) {
        Map<String, String> dados = new HashMap<>();
        dados.put("nomeCompleto", nomeCompleto());
        dados.put("email", email());
        dados.put("telefone", telefone());
        dados.put("nomeBebe", nomeBebe());
        dados.put("idadeBebe", idadeBebe);
        return dados;
    }
}
