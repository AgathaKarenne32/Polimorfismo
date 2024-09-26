/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author agatha.machado
 */
public class Livro {
    String titulo;
    String autor;
    double preco;
    
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    public void exibirDetalhes(){
        System.out.println("Titulo" + titulo);
        System.out.println("Autor" + autor);
        System.out.println("Preco" + preco);
    }
    
}
