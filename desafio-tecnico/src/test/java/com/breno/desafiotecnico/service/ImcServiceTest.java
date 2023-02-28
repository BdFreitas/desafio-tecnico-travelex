package com.breno.desafiotecnico.service;

import com.breno.desafiotecnico.exception.BadRequestException;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;


class ImcServiceTest {

    private ImcService imcService = new ImcService();

    @Test
    void shouldAcceptWeightInGramsAndHeightInCentimeters() {
        String pesoStr = "75000";
        String alturaStr = "180";
        Double peso = Double.parseDouble(pesoStr) / 1000;
        Double altura = Double.parseDouble(alturaStr) / 100;

        String imc = new DecimalFormat("00.00")
                .format(peso / (altura * altura))
                .replace(",", ".");

        assertEquals(Double.parseDouble(imc), imcService.getImc(pesoStr, alturaStr));
    }

    @Test
    void shouldAcceptWeightInKilogramsAndHeightInCentimetersUsingComaAndPoint() {
        String pesoStr = "75,0";
        String alturaStr = "1.80";

        String imc = new DecimalFormat("00.00")
                .format(75.0 / (1.80 * 1.80))
                .replace(",", ".");

        assertEquals(Double.parseDouble(imc), imcService.getImc(pesoStr, alturaStr));
    }

    @Test
    void shouldReturnBadRequestExceptionWhenArgumentIsEmpty() {
        assertThrows(BadRequestException.class, () -> {
            imcService.getImc("", "");});
    }

    @Test
    void shouldReturnBadRequestExceptionWhenArgumentIsInvalid() {
        assertThrows(BadRequestException.class, () -> {
            imcService.getImc("teste", "teste");});
    }

    @Test
    void ShouldReturnRightImc() {
        Double imc = 23.15;
        assertEquals(imc, imcService.getImc("75,0", "1,80"));
    }
}