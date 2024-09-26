/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author agatha.machado
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Senhor dos Anéis: Sociedade do Anel", "J.R.R. Tolkien", 50.00));
        livros.add(new Ebook("Deuses Americanos", "Neil Gaiman", 120.00, 1.5));
        livros.add(new Livro("Senhor dos Anéis: Duas Torres", "J.R.R. Tolkien", 50.00));
        livros.add(new Ebook("Coraline", "Neil Gaiman", 200.00, 2.0));

        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}
