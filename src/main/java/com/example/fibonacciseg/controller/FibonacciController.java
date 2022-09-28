package com.example.fibonacciseg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fibonacciseg.service.FibonacciService;

@RestController
@RequestMapping("/fibonacci")

public class FibonacciController {

    private final FibonacciService fibonacciSerie;

    public FibonacciController(@Autowired FibonacciService x)
    // inyecta las dependencias
    {
        this.fibonacciSerie = x;
    }

    @GetMapping
    public ResponseEntity<FibonacciDTO> serieCalculada() {
        return ResponseEntity.ok(fibonacciSerie.resultadoSegundos());
    }
}
