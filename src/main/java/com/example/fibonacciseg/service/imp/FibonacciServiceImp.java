package com.example.fibonacciseg.service.imp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fibonacciseg.controller.FibonacciDTO;
import com.example.fibonacciseg.service.FibonacciService;

@Service
public class FibonacciServiceImp implements FibonacciService {


    @Override
    public FibonacciDTO resultadoSegundos() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        int c = seconds % 10;  
        int d = seconds / 10;
        List<Integer> itemSemillas = new ArrayList<>();  //siempre q tengamos una lista debemos de devolver los valores
        itemSemillas.add(c);
        itemSemillas.add(d);

        List<Integer> sumaSegundos = new ArrayList<>();
        sumaSegundos.add(c);
        sumaSegundos.add(d);

        int sumaSemilla = c + d;
        while (sumaSemilla < seconds) {
            sumaSegundos.add(sumaSemilla);
            sumaSemilla = sumaSemilla + sumaSegundos.get(sumaSegundos.size()-2);
        }

        return new FibonacciDTO(
            String.valueOf(hours), 
            String.valueOf(minutes), 
            String.valueOf(seconds), 
            itemSemillas, 
            sumaSegundos);

    
 }

}