package com.breno.desafiotecnico.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario usuario = new Usuario("Usuário de Teste da Silva Pereira");

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTheNameIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {new Usuario("");});
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTheNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {new Usuario(null);});
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenTheNameIsIncomplete() {
        assertThrows(IllegalArgumentException.class, () -> {new Usuario("Breno");});
    }

    @Test
    void shouldNotThrowIllegalArgumentExceptionWhenTheNameIsValidAndComplete() {
        assertDoesNotThrow(() -> {new Usuario("Breno de Freitas");});
    }

    @Test
    void shouldReturnName() {
        String nome = "Usuário de Teste da Silva Pereira";
        assertEquals(nome, usuario.getNome());
    }

    @Test
    void shouldReturnFirstName() {
        String primeiroNome = "Usuário";
        assertEquals(primeiroNome, usuario.getFirstName());
    }

    @Test
    void shouldReturnLastName() {
        String sobrenome= "de Teste da Silva Pereira";
        assertEquals(sobrenome, usuario.getLastName());
    }

    @Test
    void shouldReturnNameInUpperCase() {
        String nomeEmCaixaAlta = "USUÁRIO DE TESTE DA SILVA PEREIRA";
        assertEquals(nomeEmCaixaAlta, usuario.getNameInUpperCase());
    }

    @Test
    void shouldReturnAbbreviatedName() {
        String nomeAbreviado = "Usuário de T. da S. Pereira";
        assertEquals(nomeAbreviado, usuario.getAbbreviatedName());
    }

    @Test
    void shouldNotAbbreviateFirstAndLastName() {
        String nome = "Breno Freitas";
        assertEquals(nome, new Usuario(nome).getAbbreviatedName());
    }
}