package com.breno.desafiotecnico.entity;

public class Cliente extends Usuario{
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getNameInUpperCase() {
        return super.getNameInUpperCase();
    }

    @Override
    public String getAbbreviatedName() {
        return super.getAbbreviatedName();
    }
}
