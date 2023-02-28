package com.breno.desafiotecnico.controller;

import com.breno.desafiotecnico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("imc")
public class PessoaController {
    @Autowired
    private ImcService imcService;

    // Obter mcc
    @GetMapping
    public ResponseEntity<Double> getImc(@RequestParam("peso") String peso, @RequestParam("altura") String altura) {
        return new ResponseEntity(imcService.getImc(peso, altura), OK);
    }
}
