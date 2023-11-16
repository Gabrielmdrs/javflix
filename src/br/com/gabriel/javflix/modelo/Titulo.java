package br.com.gabriel.javflix.modelo;

import br.com.gabriel.javflix.calculos.Classificavel;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Classificavel , Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private int quantidadeDeAvaliacoes;
    private double somaAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    public Titulo(TituloOmdb newtituloOmdb) {
        this.nome = newtituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(newtituloOmdb.year().substring(0,4));
        this.duracaoEmMinutos = Integer.parseInt(newtituloOmdb.runtime().replaceAll(" min",""));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void mostraFichaTecnica() {
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Avaliaçao do filme: " + this.avaliacao);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        quantidadeDeAvaliacoes++;
        this.avaliacao = somaAvaliacoes / quantidadeDeAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        return (int) this.getAvaliacao()/2;
    }
    @Override
    public String toString() {
        return  ( "Nome: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") " +
                    "Duração:" + this.getDuracaoEmMinutos())+ "min";
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}

