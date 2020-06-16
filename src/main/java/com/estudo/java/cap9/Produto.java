package com.estudo.java.cap9;

public class Produto {

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa não é uma variável e sim, uma constante.

    //Propriedade
    String nome;
    Integer quantidadeEstoque;

    //Function
    Boolean eNecessarioReporEstoque() {
        if (quantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return false;
    }
}
