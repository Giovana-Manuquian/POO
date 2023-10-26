package br.senai.sp.jandira.model;

abstract public class Diario {
    double calcularNota(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
}
