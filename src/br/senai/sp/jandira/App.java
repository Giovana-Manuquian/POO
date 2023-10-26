package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {
        //Exemplo POO
        Pessoas pessoa1 = new Pessoas("João", 18);
        Pessoas pessoa2 = new Pessoas("Maria", 26);

        //Encapsulamneto
//        System.out.println(pessoa1.getNome());
//        System.out.println(pessoa2.getNome());

        //Herança
        Pessoas aluno1 = new Aluno("Giovana", 21, 1637);
//        System.out.println(aluno1.getNome());
//        System.out.println(aluno1.getIdade());

        //Exemplo Polimorfismo
//        aluno1.passarTempo();
//        System.out.println(aluno1.getSaldo());

        //Exemplo Abstração
        aluno1.notaFinal(8,7);
    }
}
