package com.marques.FirtsSpringApp.model;

import java.time.LocalDate;

public class StandRequestDTO {
    private String nome;
    private LocalDate dataNascimento;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public LocalDate getDataNascimento(){return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento){this.dataNascimento = dataNascimento;}
}
