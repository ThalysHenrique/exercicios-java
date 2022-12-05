package models;

import java.util.ArrayList;

public class Gibi extends Item {

    private String faixaEtaria;
    private String ilustrador;

    public Gibi(){
        super();
    }

    public Gibi(String faixaEtaria, String ilustrador) {
        this.faixaEtaria = faixaEtaria;
        this.ilustrador = ilustrador;
    }

    public Gibi(int codigo, String titulo, String subtitulo, int anoPublicacao, String faixaEtaria, String ilustrador, double preco) {
        super(codigo, titulo, subtitulo, anoPublicacao, preco);
        this.faixaEtaria = faixaEtaria;
        this.ilustrador = ilustrador;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    @Override
    public String toString() {
        return "Gibi{" + super.toString() +
                "faixaEtaria='" + faixaEtaria + '\'' +
                ", ilustrador='" + ilustrador + '\'' +
                '}';
    }
}
