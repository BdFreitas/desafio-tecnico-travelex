package com.breno.desafiotecnico.service;

import com.breno.desafiotecnico.exception.BadRequestException;
import org.springframework.stereotype.Service;


import java.text.DecimalFormat;


@Service
public class ImcService {

    public Double getImc(String pesoStr, String alturaStr) {
        double peso = convertWeight(pesoStr);
        double altura = convertHeight(alturaStr);
        return formatImc(peso / (altura * altura));
    }

    private double convertWeight(String pesoStr) {
        try {
            if (pesoStr.matches("^\\d+[.,]\\d+$")) {
                return Double.parseDouble(pesoStr.replace(",", "."));
            }
            return Double.parseDouble(pesoStr) / 1000;

        } catch (NumberFormatException e) {
            throw new BadRequestException("O peso fornecido não é válido.");
        }
    }

    private double convertHeight(String alturaStr) {
        try {
            if (alturaStr.matches("^\\d+[.,]\\d+$")) {
                return Double.parseDouble(alturaStr.replace(",", "."));
            }
            return Double.parseDouble(alturaStr) / 100;

        } catch (NumberFormatException e) {
            throw new BadRequestException("A altura fornecida não é válida.");
        }
    }

    private double formatImc(Double imc) {
        String imcStr = (new DecimalFormat("00.00").format(imc)).replace(",", ".");
        return Double.parseDouble(imcStr);
    }
}
