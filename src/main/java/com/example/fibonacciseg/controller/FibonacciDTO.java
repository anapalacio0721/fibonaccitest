package com.example.fibonacciseg.controller;

import java.util.List;

public class FibonacciDTO {
    private String hora;
    private String minutos;
    private String segundos;
    private List<Integer> itemSemilla;
    private List<Integer> sumaSegundos;
    
    public FibonacciDTO(String hora, String minutos, String segundos, List<Integer> itemSemilla,
            List<Integer> sumaSegundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.itemSemilla = itemSemilla;
        this.sumaSegundos = sumaSegundos;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getSegundos() {
        return segundos;
    }

    public void setSegundos(String segundos) {
        this.segundos = segundos;
    }

    public List<Integer> getItemSemilla() {
        return itemSemilla;
    }

    public void setItemSemilla(List<Integer> itemSemilla) {
        this.itemSemilla = itemSemilla;
    }

    public List<Integer> getSumaSegundos() {
        return sumaSegundos;
    }

    public void setSumaSegundos(List<Integer> sumaSegundos) {
        this.sumaSegundos = sumaSegundos;
    }
    
}