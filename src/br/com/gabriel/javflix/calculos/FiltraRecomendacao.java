package br.com.gabriel.javflix.calculos;

public class FiltraRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >=4) {
            System.out.println("Está entre os mais bem avaliados no momento!");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Bem avaliado no momento!");
        } else {
            System.out.println("Adicione para assistir mais tarde.");
        }
    }

}
