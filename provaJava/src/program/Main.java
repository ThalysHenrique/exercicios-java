package program;

import models.*;

public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Thalys", "Henrique", "Brasileiro");
        Autor a2 = new Autor("James", "Bond", "Americano");

        Gibi g1 = new Gibi(01, "Turma da Mônica", "Cebolinha x Mônica", 1989, "10 anos", "Mauricio de Souza", 15.50);

        Revista r1 = new Revista(02, "Capricho", "Modelos", 2008, 12.70, 8, "Tyler");

        Livro l1 = new Livro(03, "Senhor dos Anéis", "A sociedade do anel", 1978, 27.00, "78780000-7", "Martins Fontes");

        // polimorfismo

        Item i1;
        i1 = new Gibi();
        // i1 = new Revista();
        // i1 = new Livro();

        // Revista r2 = new Livro(); --> NÃO PODE

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(g1);
        System.out.println(r1);
        System.out.println(l1);
        System.out.println(i1);
    }
}