package br.com.gabriel.javflix.principal;

import br.com.gabriel.javflix.calculos.CalculadoraDeTempo;
import br.com.gabriel.javflix.calculos.FiltraRecomendacao;
import br.com.gabriel.javflix.modelo.Filme;
import br.com.gabriel.javflix.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Oppenheimer",2023);
        meuFilme.mostraFichaTecnica();

        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(8);



        Filme barbie = new Filme("Barbie",2023);

        var titanic = new Filme("Titanic", 1998);



        Serie greysAnatomy = new Serie("Greys Anatomy",2010);
        greysAnatomy.setTemporadas(19);
        greysAnatomy.setEpisodiosPorTemporada(20);
        greysAnatomy.setMinutosPorEpisodio(45);

        greysAnatomy.avalia(8);
        greysAnatomy.avalia(9);
        greysAnatomy.avalia(7);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(barbie);
        calculadora.inclui(greysAnatomy);

        System.out.println( calculadora.getTempoTotal());

        FiltraRecomendacao filtro = new FiltraRecomendacao();
        filtro.filtra(greysAnatomy);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(barbie);
        listaDeFilmes.add(titanic);

        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);



    }

}
