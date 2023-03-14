package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/
        Gato gato = new Gato();
        Livro livro = new Livro("O cortiço", 240);

        System.out.println(gato);
    }
}

class Livro {
    private String nome;
    private Integer nPag;

    Livro(String nome, Integer nPag) {
        this.nome = nome;
        this.nPag = nPag;
    }
}