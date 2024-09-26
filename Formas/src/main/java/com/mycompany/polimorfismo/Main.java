/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;
/**
 *
 * @author Agatha
 */
public class Main {
    
    public static void main(String[] args) {
        Formas[] formas = new Formas[3]; // 3 formas geométricas foram inseridas
        formas[0] = new Retangulo(4, 8);
        formas[1] = new Circulo(5);
        formas[2] = new Triangulo(2, 6);
        
        for (Formas forma : formas) { // Loop for-each
            System.out.println("Área: " + forma.calcularArea()); // Imprimindo a área calculada
        }
    }
}