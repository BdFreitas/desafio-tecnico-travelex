package com.breno.desafiotecnico;

import com.breno.desafiotecnico.entity.Cliente;
import com.breno.desafiotecnico.entity.Gerente;
import com.breno.desafiotecnico.entity.Robo;

public class DesafioTecnicoApplicationEx2 {

    public static void main(String[] args) {
        System.out.println("------------------- TESTE 1 -------------------");

        Cliente cliente = new Cliente("  João Soares Silva  ");
        System.out.println(cliente.getFirstName());
        System.out.println(cliente.getLastName());
        System.out.println(cliente.getNameInUpperCase());
        System.out.println(cliente.getAbbreviatedName());

        System.out.println("------------------- TESTE 2 -------------------");

        Gerente gerente = new Gerente("  Breno de Freitas  ");
        System.out.println(gerente.getFirstName());
        System.out.println(gerente.getLastName());
        System.out.println(gerente.getNameInUpperCase());
        System.out.println(gerente.getAbbreviatedName());

        System.out.println("------------------- TESTE 3 -------------------");

        Robo robo = new Robo("  Robonildo de Classe Dois  ");
        System.out.println(robo.getFirstName());
        System.out.println(robo.getLastName());
        System.out.println(robo.getNameInUpperCase());
        System.out.println(robo.getAbbreviatedName());

        System.out.println("--------------------------------------------------");
    }
}
