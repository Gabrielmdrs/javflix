package br.com.gabriel.javflix.modelo;

import br.com.gabriel.javflix.calculos.Classificavel;

public class Filme extends Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    protected double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private int quantidadeDeAvaliacoes;
    private double somaAvaliacoes;


    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);

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

    public void mostraFichaTecnica(){
        System.out.println("Nome do Filme: "+ this.nome);
        System.out.println("Ano de lançamento: "+ this.anoDeLancamento);
        System.out.println("Avaliaçao do filme: "+ this.avaliacao);
    }
    public void avalia(double nota){
        somaAvaliacoes += nota;
        quantidadeDeAvaliacoes++;
        this.avaliacao = somaAvaliacoes/quantidadeDeAvaliacoes;
    }



}