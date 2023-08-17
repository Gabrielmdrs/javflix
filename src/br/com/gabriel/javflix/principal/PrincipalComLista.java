package br.com.gabriel.javflix.principal;

import br.com.gabriel.javflix.modelo.Filme;
import br.com.gabriel.javflix.modelo.Serie;
import br.com.gabriel.javflix.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Oppenheimer",2023);
        meuFilme.avalia(9);
        Filme barbie = new Filme("Barbie",2023);
        barbie.avalia(8);
        Filme titanic = new Filme("Titanic", 1998);
        titanic.avalia(7);

        Serie greysAnatomy = new Serie("Greys Anatomy",2010);
        greysAnatomy.avalia(8);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(barbie);
        lista.add(titanic);
        lista.add(greysAnatomy);
        Collections.sort(lista);

        for (Titulo item: lista) {
            System.out.println(item);
            System.out.println("Avaliação em estrelas: " + item.getClassificacao());
        }









    }
}
