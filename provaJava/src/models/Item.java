package models;

import java.util.ArrayList;

public class Item {

    private int codigo;
    private String titulo;
    private String subtitulo;
    private int anoPublicacao;
    private ArrayList<Autor> autores;
    private double preco;

    public Item(){

    }

    public Item(int codigo, String titulo, String subtitulo, int anoPublicacao, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.anoPublicacao = anoPublicacao;
        autores = new ArrayList<>();
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", autores=" + autores +
                ", preco=" + preco +
                '}';
    }
}
