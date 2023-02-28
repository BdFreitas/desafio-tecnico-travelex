package com.breno.desafiotecnico.entity;

import java.util.Objects;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = validateName(nome);
    }

    public String getNome() {
        return nome;
    }

    private String validateName(String nome) {
        if (Objects.nonNull(nome) && !nome.isEmpty() && isNameComplete(nome)) {
            return nome.trim();
        }

        throw new IllegalArgumentException("Por favor, insira um nome válido e completo. Ex: \"João Soares Silva\".");
    }

    private boolean isNameComplete(String nome) {
        int numeroDeNomes = nome.split(" ").length;

        if (numeroDeNomes == 1) {
            return false;
        }

        return true;
    }

    public String getFirstName() {
        return this.nome.split(" ")[0];
    }

    public String getLastName() {
        String sobrenome = "";
        String[] nomes = this.nome.split(" ");

        for (int i = 1; i <= nomes.length - 1; i++) {
            if (i == 1) {
                sobrenome = nomes[i];
                continue;
            }

            sobrenome += " " + nomes[i];
        }

        return sobrenome;
    }

    public String getNameInUpperCase() {
        return this.nome.toUpperCase();
    }

    public String getAbbreviatedName() {
        String[] nomes = this.nome.split(" ");

        if (nomes.length == 2) {
            return this.nome;
        }

        StringBuilder nomeAbreviado = new StringBuilder();

        for (int i = 0; i <= nomes.length - 1; i++) {
            String parte = nomes[i];

            if (i == 0) {
                nomeAbreviado.append(parte);
            } else if (i == nomes.length - 1) {
                nomeAbreviado.append(" ").append(parte);
            } else if (
                    parte.equalsIgnoreCase("de")
                            || parte.equalsIgnoreCase("da")
                            || parte.equalsIgnoreCase("dos")
            ) {
                nomeAbreviado.append(" ").append(parte);
            } else {
                nomeAbreviado.append(" ").append(parte.substring(0, 1).toUpperCase()).append(".");
            }
        }

        return nomeAbreviado.toString();
    }
}
