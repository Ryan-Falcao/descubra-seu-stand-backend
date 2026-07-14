package com.marques.FirtsSpringApp.service;

import com.marques.FirtsSpringApp.model.PerfilStand;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StandService {
    public PerfilStand descobrirStand(LocalDate nascimento){
        int numeroArcano = calcularArcano(nascimento);
        return PerfilStand.values()[numeroArcano - 1];
    }
    private int calcularArcano(LocalDate nascimento){
        String dataTexto = nascimento.toString().replace("-","");
        int soma = somarDigitos(dataTexto);

        while (soma>22){
            soma = somarDigitos(String.valueOf(soma));
        }
        return soma;
    }
    private int somarDigitos(String numero){
        int soma = 0;
        for (char c: numero.toCharArray()){
            soma += Character.getNumericValue(c);
        }
        return soma;
    }
}
