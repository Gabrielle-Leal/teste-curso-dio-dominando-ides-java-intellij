package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!! " + (a+b));*/
    }
}

class Livro {
    private String none;
    private Integer numPaginas;

    public Livro(String none, Integer numPaginas) {
        this.none = none;
        this.numPaginas = numPaginas;
    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "none='" + none + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
