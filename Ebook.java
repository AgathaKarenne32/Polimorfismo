/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author agatha.machado
 */
    class Ebook extends Livro {
        
        double tamanhoArquivo;
        
        public Ebook(String titulo, String autor, double preco, double par1) {
            super(titulo, autor, preco);
            this.tamanhoArquivo = tamanhoArquivo;
            
        }
        
        public void exibirDetalhes(){
            System.out.println("Titulo" + titulo);
            System.out.println("Autor" + autor);
            System.out.println("Preco" + preco);
            System.out.println("Tamanho do arquivo" + tamanhoArquivo);
        }
    }
